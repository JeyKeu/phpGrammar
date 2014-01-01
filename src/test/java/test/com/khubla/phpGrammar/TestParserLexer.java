package test.com.khubla.phpGrammar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.khubla.phpGrammar.PHPLexer;
import com.khubla.phpGrammar.PHPParser;
import com.khubla.phpGrammar.PHPParser.ProgContext;

/*
 *   PHP ANTLR4 Grammar Copyright 2013, khubla.com
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * @author tom
 */
public class TestParserLexer {
   static public List<File> getFileListing(File dir, String extension) throws FileNotFoundException {
      final List<File> result = new ArrayList<File>();
      final File[] filesAndDirs = dir.listFiles();
      final List<File> filesDirs = Arrays.asList(filesAndDirs);
      for (final File file : filesDirs) {
         if (!file.isFile()) {
            final List<File> deeperList = getFileListing(file, extension);
            result.addAll(deeperList);
         } else {
            if (file.getName().endsWith(extension)) {
               result.add(file);
            }
         }
      }
      return result;
   }

   /**
    * parse a file
    */
   private void parseFile(String filepath) {
      try {
         System.out.println("Parsing '" + filepath + "'");
         final InputStream fis = new FileInputStream(filepath);
         final PHPLexer lexer = new PHPLexer(new ANTLRInputStream(fis));
         final CommonTokenStream tokens = new CommonTokenStream(lexer);
         final PHPParser parser = new PHPParser(tokens);
         final ProgContext progContext = parser.prog();
         Assert.assertNotNull(progContext);
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }

   @Test
   public void testAllFiles() {
      try {
         final List<File> files = getFileListing(new File("src/test/resources/php"), "php");
         for (final File f : files) {
            parseFile(f.getAbsolutePath());
         }
      } catch (final Exception e) {
         e.printStackTrace();
         Assert.fail();
      }
   }
}
