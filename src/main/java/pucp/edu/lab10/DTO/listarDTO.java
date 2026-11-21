package pucp.edu.lab10.DTO;

public class listarDTO {
    private int id;
    private String hostname;
    private String tipo;
    private String ipGestion;
    private String estado;
    private String sedeNombre;
    private String cuidad;
    private int mesesOperativos;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIpGestion() {
        return ipGestion;
    }

    public void setIpGestion(String ipGestion) {
        this.ipGestion = ipGestion;
    }

    public String getSedeNombre() {
        return sedeNombre;
    }

    public void setSedeNombre(String sedeNombre) {
        this.sedeNombre = sedeNombre;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public int getMesesOperativos() {
        return mesesOperativos;
    }

    public void setMesesOperativos(int mesesOperativos) {
        this.mesesOperativos = mesesOperativos;
    }
}
