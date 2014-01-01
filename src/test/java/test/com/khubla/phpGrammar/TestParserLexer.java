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
