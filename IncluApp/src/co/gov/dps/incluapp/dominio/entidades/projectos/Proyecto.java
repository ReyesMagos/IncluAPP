package co.gov.dps.incluapp.dominio.entidades.projectos;

public class Proyecto {
	
	private String actSubvencion;
	private int cantidad;
	private int consecutivo;
	private String descripcionResPropuesto;
	private String entidadEjecutora;
	private String grupoMeta;
	private int idCatalogo;
	private String indResultadoSub;
	private String metasActividades;
	private String productoEntregado;
	private String tema;
	private String programa;
	private String tipoTema;
	private String um;
	
	public Proyecto(String actSubvencion, int cantidad, int consecutivo,
			String descripcionResPropuesto, String entidadEjecutora,
			String grupoMeta, int idCatalogo, String indResultadoSub,
			String astring, String productoEntregado, String tema,
			String programa, String tipoTema, String um) {
		super();
		this.actSubvencion = actSubvencion;
		this.cantidad = cantidad;
		this.consecutivo = consecutivo;
		this.descripcionResPropuesto = descripcionResPropuesto;
		this.entidadEjecutora = entidadEjecutora;
		this.grupoMeta = grupoMeta;
		this.idCatalogo = idCatalogo;
		this.indResultadoSub = indResultadoSub;
		this.metasActividades = astring;
		this.productoEntregado = productoEntregado;
		this.tema = tema;
		this.programa = programa;
		this.tipoTema = tipoTema;
		this.um = um;
	}

	public Proyecto() {
		super();
	}

	public String getActSubvencion() {
		return actSubvencion;
	}

	public void setActSubvencion(String actSubvencion) {
		this.actSubvencion = actSubvencion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getConsecutivo() {
		return consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public String getDescripcionResPropuesto() {
		return descripcionResPropuesto;
	}

	public void setDescripcionResPropuesto(String descripcionResPropuesto) {
		this.descripcionResPropuesto = descripcionResPropuesto;
	}

	public String getEntidadEjecutora() {
		return entidadEjecutora;
	}

	public void setEntidadEjecutora(String entidadEjecutora) {
		this.entidadEjecutora = entidadEjecutora;
	}

	public String getGrupoMeta() {
		return grupoMeta;
	}

	public void setGrupoMeta(String grupoMeta) {
		this.grupoMeta = grupoMeta;
	}

	public int getIdCatalogo() {
		return idCatalogo;
	}

	public void setIdCatalogo(int idCatalogo) {
		this.idCatalogo = idCatalogo;
	}

	public String getIndResultadoSub() {
		return indResultadoSub;
	}

	public void setIndResultadoSub(String indResultadoSub) {
		this.indResultadoSub = indResultadoSub;
	}

	public String getMetasActividades() {
		return metasActividades;
	}

	public void setMetasActividades(String metasActividades) {
		this.metasActividades = metasActividades;
	}

	public String getProductoEntregado() {
		return productoEntregado;
	}

	public void setProductoEntregado(String productoEntregado) {
		this.productoEntregado = productoEntregado;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public String getTipoTema() {
		return tipoTema;
	}

	public void setTipoTema(String tipoTema) {
		this.tipoTema = tipoTema;
	}

	public String getUm() {
		return um;
	}

	public void setUm(String um) {
		this.um = um;
	}
	
	
	
	
}
