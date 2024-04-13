import com.yennth.PH31906_13042024_Final.KhachHang;
import com.yennth.PH31906_13042024_Final.KhachHangService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class KhachHangTest {
    KhachHangService service = new KhachHangService();

    @Test
    public void xoaValid() {
        KhachHang khachHang = new KhachHang("KH1" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang);
        service.xoa("KH1");
        Assert.assertEquals(0 , service.getAll().size());
    }

    @Test
    public void xoaInValid1() {
        KhachHang khachHang = new KhachHang("KH1" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang);
        service.xoa("KH1");
        Assert.assertEquals(1 , service.getAll().size());
    }

    @Test
    public void xoaInValid2() {
        KhachHang khachHang = new KhachHang("KH1" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang);
        service.xoa("KH2");
        Assert.assertEquals(0 , service.getAll().size());
    }

    @Test
    public void xoaInValid3() {
        KhachHang khachHang = new KhachHang("KH1" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang);
        service.xoa("KH2");
        Assert.assertEquals(1 , service.getAll().size());
    }

    @Test
    public void xoaValid4() {
        KhachHang khachHang = new KhachHang("KH1" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang);

        KhachHang khachHang2 = new KhachHang("KH2" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang2);
        service.xoa("KH1");
        Assert.assertEquals(1 , service.getAll().size());
    }

    @Test
    public void xoaValid5() {
        KhachHang khachHang = new KhachHang("KH1" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang);

        KhachHang khachHang2 = new KhachHang("KH2" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang2);
        service.xoa("KH2");
        Assert.assertEquals(1 , service.getAll().size());
    }

    @Test
    public void xoaInValid6() {
        KhachHang khachHang = new KhachHang("KH1" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang);

        KhachHang khachHang2 = new KhachHang("KH2" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang2);
        service.xoa("KH1");
        Assert.assertEquals(0 , service.getAll().size());
    }

    @Test
    public void xoaInValid7() {
        KhachHang khachHang = new KhachHang("KH1" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang);

        KhachHang khachHang2 = new KhachHang("KH2" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang2);
        service.xoa("KH2");
        Assert.assertEquals(0 , service.getAll().size());
    }

    @Test
    public void xoaInValid8() {
        KhachHang khachHang = new KhachHang("KH1" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang);

        KhachHang khachHang2 = new KhachHang("KH2" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang2);
        service.xoa("KH3");
        Assert.assertEquals(0 , service.getAll().size());
    }

    @Test
    public void xoaInValid9() {
        KhachHang khachHang = new KhachHang("KH1" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang);

        KhachHang khachHang2 = new KhachHang("KH2" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang2);
        service.xoa("KH3");
        Assert.assertEquals(2 , service.getAll().size());
    }

    @Test
    public void xoaInValid10() {
        KhachHang khachHang = new KhachHang("KH1" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang);

        KhachHang khachHang2 = new KhachHang("KH2" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang2);
        service.xoa("KH3");
        Assert.assertEquals(1 , service.getAll().size());
    }

    @Test
    public void xoaValid11() {
        KhachHang khachHang = new KhachHang("KH1" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang);

        KhachHang khachHang2 = new KhachHang("KH2" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang2);
        service.xoa("KH1");
        service.xoa("KH2");
        Assert.assertEquals(0 , service.getAll().size());
    }

    @Test
    public void xoaInValid12() {
        KhachHang khachHang = new KhachHang("KH1" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang);

        KhachHang khachHang2 = new KhachHang("KH2" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang2);
        service.xoa("KH1");
        service.xoa("KH2");
        Assert.assertEquals(1 , service.getAll().size());
    }

    @Test
    public void xoaInValid13() {
        KhachHang khachHang = new KhachHang("KH1" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang);

        KhachHang khachHang2 = new KhachHang("KH2" , "Nguyen Hai Yen" , "Nu" , 2004 , "VIP");
        service.add(khachHang2);
        service.xoa("KH1");
        service.xoa("KH2");
        Assert.assertEquals(2 , service.getAll().size());
    }

    @Test
    public void xoaInValidNamSinh14() {
        KhachHang khachHang = new KhachHang("KH1" , "Nguyen Hai Yen" , "Nu" , 999 , "VIP");
        service.add(khachHang);
        service.xoa("KH1");
        Assert.assertEquals(0 , service.getAll().size());
    }

    @Test
    public void xoaInValidNamSinh15() {
        KhachHang khachHang = new KhachHang("KH1" , "Nguyen Hai Yen" , "Nu" , 10 , "VIP");
        service.add(khachHang);
        service.xoa("KH1");
        Assert.assertEquals(1 , service.getAll().size());
    }
}
