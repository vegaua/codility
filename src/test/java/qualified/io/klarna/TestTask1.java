package qualified.io.klarna;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestTask1 {

    Task1 t1 = new Task1();

    @Test
    public void test1(){
        Assert.assertThat(t1.maskify("4556364607935616"),
                Is.is("4###########5616"));
    }

    @Test
    public void test2(){
        Assert.assertThat(t1.maskify("4556-3646-0793-5616"),
                Is.is("4###-####-####-5616"));
    }

    @Test
    public void test3(){
        Assert.assertThat(t1.maskify("64607935616"),
                Is.is("6######5616"));
    }

    @Test
    public void test4(){
        Assert.assertThat(t1.maskify("ABCD-EFGH-IJKLM-NOPQ"),
                Is.is("ABCD-EFGH-IJKLM-NOPQ"));
    }

    @Test
    public void test5(){
        Assert.assertThat(t1.maskify("A1234567BCDEFG89HI"),
                Is.is("A#######BCDEFG89HI"));
    }

    @Test
    public void test6(){
        Assert.assertThat(t1.maskify("12345"),
                Is.is("12345"));
    }

    @Test
    public void test7(){
        Assert.assertThat(t1.maskify(""),
                Is.is(""));
    }

    @Test
    public void test8(){
        Assert.assertThat(t1.maskify("Skippy"),
                Is.is("Skippy"));
    }

    @Test
    public void myTest(){
        Assert.assertThat(t1.maskify("1234-5678"),
                Is.is("1###-5678"));
    }

    @Test
    public void test9(){
        Assert.assertThat(t1.maskify("AB12-3456-IJKLM-NOPQ"),
                Is.is("AB##-####-IJKLM-NOPQ"));
    }

    @Test
    public void test10(){
        Assert.assertThat(t1.maskify("ABCD-1234-56KLM-NOPQ"),
                Is.is("ABCD-####-##KLM-NOPQ"));
    }

//    @Test
//    public void test11(){ // TODO write email with question about this case
//        Assert.assertThat(t1.maskify("ABCD-EFG1-2345-6OPQ"),
//                Is.is("ABCD-EFG#-####-#OPQ"));
//    }

    @Test
    public void test12(){
        Assert.assertThat(t1.maskify("123456"),
                Is.is("1#3456"));
    }


    @Test
    public void test13(){
        Assert.assertThat(t1.maskify("1234567890"),
                Is.is("1#####7890"));
    }


    @Test
    public void test14(){
        Assert.assertThat(t1.maskify("1234-SKIP-3456-4567"),
                Is.is("1###-SKIP-####-4567"));
    }

    @Test
    public void test15(){
        Assert.assertThat(t1.maskify("A234-2345-3456-ABCD"),
                Is.is("A###-####-####-ABCD"));
    }

    @Test
    public void test16(){
        Assert.assertThat(t1.maskify("123"),
                Is.is("123"));
    }

    @Test
    public void test17(){
        Assert.assertThat(t1.maskify("123ABCDEFG45"),
                Is.is("123ABCDEFG45"));
    }
}
