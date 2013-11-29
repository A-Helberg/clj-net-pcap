package clj_net_pcap;

/**
 * 
 * Simple POJO for storing header data.
 * 
 * @author Ruediger Gad
 * 
 */
public class PacketHeaderDataBean {

	/*
	 * General pcap information
	 */
	private long ts = 0;
	private int len = 0;
	private int hdrLen = 0;
	private int capLen = 0;

	/*
	 * Ethernet
	 */
	private String ethSrc;
	private String ethDst;

	/*
	 * ARP
	 */
	private String arpOpDesc;
	private String arpTargetMac;
	private String arpTargetIp;
	private String arpSourceMac;
	private String arpSourceIp;

	/*
	 * IP
	 */
	private String ipSrc;
	private String ipDst;
	private int ipVer = 0;

	/*
	 * ICMP
	 */
	private String icmpType;
	private int icmpEchoSeq = -1;

	/*
	 * TCP
	 */
	private int tcpSrc = 0;
	private int tcpDst = 0;
	private long tcpAck = -1;
	private long tcpSeq = -1;
	private int tcpFlags = -1;
	private long tcpTsval = 0;
	private long tcpTsecr = 0;

	/*
	 * UDP
	 */
	private int udpSrc = 0;
	private int udpDst = 0;

	/*
	 * Getter and setter
	 */
	public long getTs() {
		return ts;
	}

	public void setTs(long ts) {
		this.ts = ts;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getHdrLen() {
		return hdrLen;
	}

	public void setHdrLen(int hdrLen) {
		this.hdrLen = hdrLen;
	}

	public int getCapLen() {
		return capLen;
	}

	public void setCapLen(int capLen) {
		this.capLen = capLen;
	}

	public String getEthSrc() {
		return ethSrc;
	}

	public void setEthSrc(String ethSrc) {
		this.ethSrc = ethSrc;
	}

	public String getEthDst() {
		return ethDst;
	}

	public void setEthDst(String ethDst) {
		this.ethDst = ethDst;
	}

	public String getArpOpDesc() {
		return arpOpDesc;
	}

	public void setArpOpDesc(String arpOpDesc) {
		this.arpOpDesc = arpOpDesc;
	}

	public String getArpTargetMac() {
		return arpTargetMac;
	}

	public void setArpTargetMac(String arpTargetMac) {
		this.arpTargetMac = arpTargetMac;
	}

	public String getArpTargetIp() {
		return arpTargetIp;
	}

	public void setArpTargetIp(String arpTargetIp) {
		this.arpTargetIp = arpTargetIp;
	}

	public String getArpSourceMac() {
		return arpSourceMac;
	}

	public void setArpSourceMac(String arpSourceMac) {
		this.arpSourceMac = arpSourceMac;
	}

	public String getArpSourceIp() {
		return arpSourceIp;
	}

	public void setArpSourceIp(String arpSourceIp) {
		this.arpSourceIp = arpSourceIp;
	}

	public String getIp4Src() {
		return ipSrc;
	}

	public void setIp4Src(String ip4Src) {
		this.ipSrc = ip4Src;
	}

	public String getIpDst() {
		return ipDst;
	}

	public void setIpDst(String ipDst) {
		this.ipDst = ipDst;
	}

	public int getIpVer() {
		return ipVer;
	}

	public void setIpVer(int ipVer) {
		this.ipVer = ipVer;
	}

	public String getIcmpType() {
		return icmpType;
	}

	public void setIcmpType(String icmpType) {
		this.icmpType = icmpType;
	}

	public int getIcmpEchoSeq() {
		return icmpEchoSeq;
	}

	public void setIcmpEchoSeq(int icmpEchoSeq) {
		this.icmpEchoSeq = icmpEchoSeq;
	}

	public int getTcpSrc() {
		return tcpSrc;
	}

	public void setTcpSrc(int tcpSrc) {
		this.tcpSrc = tcpSrc;
	}

	public int getTcpDst() {
		return tcpDst;
	}

	public void setTcpDst(int tcpDst) {
		this.tcpDst = tcpDst;
	}

	public long getTcpAck() {
		return tcpAck;
	}

	public void setTcpAck(long tcpAck) {
		this.tcpAck = tcpAck;
	}

	public long getTcpSeq() {
		return tcpSeq;
	}

	public void setTcpSeq(long tcpSeq) {
		this.tcpSeq = tcpSeq;
	}

	public int getTcpFlags() {
		return tcpFlags;
	}

	public void setTcpFlags(int tcpFlags) {
		this.tcpFlags = tcpFlags;
	}

	public long getTcpTsval() {
		return tcpTsval;
	}

	public void setTcpTsval(long tcpTsval) {
		this.tcpTsval = tcpTsval;
	}

	public long getTcpTsecr() {
		return tcpTsecr;
	}

	public void setTcpTsecr(long tcpTsecr) {
		this.tcpTsecr = tcpTsecr;
	}

	public int getUdpSrc() {
		return udpSrc;
	}

	public void setUdpSrc(int udpSrc) {
		this.udpSrc = udpSrc;
	}

	public int getUdpDst() {
		return udpDst;
	}

	public void setUdpDst(int udpDst) {
		this.udpDst = udpDst;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PacketHeaderDataBean");
		if (ts > 0) {
			builder.append("ts=");
			builder.append(ts);
		}
		if (len > 0) {
			builder.append(", len=");
			builder.append(len);
		}
		if (hdrLen > 0) {
			builder.append(", hdrLen=");
			builder.append(hdrLen);
		}
		if (capLen > 0) {
			builder.append(", capLen=");
			builder.append(capLen);
		}
		builder.append(", ");
		if (ethSrc != null) {
			builder.append("ethSrc=");
			builder.append(ethSrc);
			builder.append(", ");
		}
		if (ethDst != null) {
			builder.append("ethDst=");
			builder.append(ethDst);
			builder.append(", ");
		}
		if (arpOpDesc != null) {
			builder.append("arpOpDesc=");
			builder.append(arpOpDesc);
			builder.append(", ");
		}
		if (arpTargetMac != null) {
			builder.append("arpTargetMac=");
			builder.append(arpTargetMac);
			builder.append(", ");
		}
		if (arpTargetIp != null) {
			builder.append("arpTargetIp=");
			builder.append(arpTargetIp);
			builder.append(", ");
		}
		if (arpSourceMac != null) {
			builder.append("arpSourceMac=");
			builder.append(arpSourceMac);
			builder.append(", ");
		}
		if (arpSourceIp != null) {
			builder.append("arpSourceIp=");
			builder.append(arpSourceIp);
			builder.append(", ");
		}
		if (ipSrc != null) {
			builder.append("ip4Src=");
			builder.append(ipSrc);
			builder.append(", ");
		}
		if (ipDst != null) {
			builder.append("ip4Dst=");
			builder.append(ipDst);
			builder.append(", ");
		}
		if (ipVer > 0) {
			builder.append("ipVer=");
			builder.append(ipVer);
			builder.append(", ");
		}
		if (icmpType != null) {
			builder.append("icmpType=");
			builder.append(icmpType);
			builder.append(", ");
		}
		if (icmpEchoSeq > -1) {
			builder.append("icmpEchoSeq=");
			builder.append(icmpEchoSeq);
			builder.append(", ");
		}
		if (tcpSrc > 0) {
			builder.append("tcpSrc=");
			builder.append(tcpSrc);
		}
		if (tcpDst > 0) {
			builder.append(", tcpDst=");
			builder.append(tcpDst);
		}
		if (tcpAck > -1) {
			builder.append(", tcpAck=");
			builder.append(tcpAck);
		}
		if (tcpSeq > -1) {
			builder.append(", tcpSeq=");
			builder.append(tcpSeq);
		}
		if (tcpFlags > -1) {
			builder.append(", tcpFlags=");
			builder.append(tcpFlags);
		}
		if (tcpTsval > 0) {
			builder.append(", tcpTsval=");
			builder.append(tcpTsval);
		}
		if (tcpTsecr > 0) {
			builder.append(", tcpTsecr=");
			builder.append(tcpTsecr);
		}
		if (udpSrc > 0) {
			builder.append(", udpSrc=");
			builder.append(udpSrc);
		}
		if (udpDst > 0) {
			builder.append(", udpDst=");
			builder.append(udpDst);
		}
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((arpOpDesc == null) ? 0 : arpOpDesc.hashCode());
		result = prime * result
				+ ((arpSourceIp == null) ? 0 : arpSourceIp.hashCode());
		result = prime * result
				+ ((arpSourceMac == null) ? 0 : arpSourceMac.hashCode());
		result = prime * result
				+ ((arpTargetIp == null) ? 0 : arpTargetIp.hashCode());
		result = prime * result
				+ ((arpTargetMac == null) ? 0 : arpTargetMac.hashCode());
		result = prime * result + capLen;
		result = prime * result + ((ethDst == null) ? 0 : ethDst.hashCode());
		result = prime * result + ((ethSrc == null) ? 0 : ethSrc.hashCode());
		result = prime * result + hdrLen;
		result = prime * result + icmpEchoSeq;
		result = prime * result
				+ ((icmpType == null) ? 0 : icmpType.hashCode());
		result = prime * result + ((ipDst == null) ? 0 : ipDst.hashCode());
		result = prime * result + ((ipSrc == null) ? 0 : ipSrc.hashCode());
		result = prime * result + ipVer;
		result = prime * result + len;
		result = prime * result + (int) (tcpAck ^ (tcpAck >>> 32));
		result = prime * result + tcpDst;
		result = prime * result + tcpFlags;
		result = prime * result + (int) (tcpSeq ^ (tcpSeq >>> 32));
		result = prime * result + tcpSrc;
		result = prime * result + (int) (tcpTsecr ^ (tcpTsecr >>> 32));
		result = prime * result + (int) (tcpTsval ^ (tcpTsval >>> 32));
		result = prime * result + (int) (ts ^ (ts >>> 32));
		result = prime * result + udpDst;
		result = prime * result + udpSrc;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof PacketHeaderDataBean))
			return false;
		PacketHeaderDataBean other = (PacketHeaderDataBean) obj;
		if (arpOpDesc == null) {
			if (other.arpOpDesc != null)
				return false;
		} else if (!arpOpDesc.equals(other.arpOpDesc))
			return false;
		if (arpSourceIp == null) {
			if (other.arpSourceIp != null)
				return false;
		} else if (!arpSourceIp.equals(other.arpSourceIp))
			return false;
		if (arpSourceMac == null) {
			if (other.arpSourceMac != null)
				return false;
		} else if (!arpSourceMac.equals(other.arpSourceMac))
			return false;
		if (arpTargetIp == null) {
			if (other.arpTargetIp != null)
				return false;
		} else if (!arpTargetIp.equals(other.arpTargetIp))
			return false;
		if (arpTargetMac == null) {
			if (other.arpTargetMac != null)
				return false;
		} else if (!arpTargetMac.equals(other.arpTargetMac))
			return false;
		if (capLen != other.capLen)
			return false;
		if (ethDst == null) {
			if (other.ethDst != null)
				return false;
		} else if (!ethDst.equals(other.ethDst))
			return false;
		if (ethSrc == null) {
			if (other.ethSrc != null)
				return false;
		} else if (!ethSrc.equals(other.ethSrc))
			return false;
		if (hdrLen != other.hdrLen)
			return false;
		if (icmpEchoSeq != other.icmpEchoSeq)
			return false;
		if (icmpType == null) {
			if (other.icmpType != null)
				return false;
		} else if (!icmpType.equals(other.icmpType))
			return false;
		if (ipDst == null) {
			if (other.ipDst != null)
				return false;
		} else if (!ipDst.equals(other.ipDst))
			return false;
		if (ipSrc == null) {
			if (other.ipSrc != null)
				return false;
		} else if (!ipSrc.equals(other.ipSrc))
			return false;
		if (ipVer != other.ipVer)
			return false;
		if (len != other.len)
			return false;
		if (tcpAck != other.tcpAck)
			return false;
		if (tcpDst != other.tcpDst)
			return false;
		if (tcpFlags != other.tcpFlags)
			return false;
		if (tcpSeq != other.tcpSeq)
			return false;
		if (tcpSrc != other.tcpSrc)
			return false;
		if (tcpTsecr != other.tcpTsecr)
			return false;
		if (tcpTsval != other.tcpTsval)
			return false;
		if (ts != other.ts)
			return false;
		if (udpDst != other.udpDst)
			return false;
		if (udpSrc != other.udpSrc)
			return false;
		return true;
	}

}