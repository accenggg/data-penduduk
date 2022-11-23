package rt;

abstract class implementasi {
    private String password;

    public void setPassword() {
        this.password = "admin";
    }
    public String getPassword() {
        return password;
    }
    
    public abstract String jargon();
    
    String sensus(){
        return "Sensus 5 tahun sekali";
    }
       
}

class implementasi2 extends implementasi{
    
    @Override
    final String sensus(){
        return "Sensus 1 tahun sekali";
    }
    
    @Override
    public String jargon(){
        return "MAKMUR RAKYATKU, JAYA NEGERIKU";
    }
}
interface hal{
    public String penduduk();
}
class quotes implements hal{
    @Override
    public String penduduk(){
        return """
               <html>
               \"Data penduduk tidak hanya bermanfaat untuk saat ini,<br/>
               tetapi juga sebagai antisipasi Indonesia di masa depan.\"<br/><br/>
               
               -Suhariyanto, Kepala BPS
               <html>
               """;
    }
}
