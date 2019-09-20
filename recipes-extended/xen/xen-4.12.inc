SRC_URI = " \
    https://downloads.xenproject.org/release/xen/${PV}/xen-${PV}.tar.gz \
    file://0001-python-pygrub-pass-DISTUTILS-xen.4.12.patch \
    "

SRC_URI[md5sum] = "3f96ae93a5d6a3dd89bdf1398e30895e"
SRC_URI[sha256sum] = "5450a85497b84167df1d229b3ab98fb24ef4d6b0510dce522798c13c1b090159"

S = "${WORKDIR}/xen-${PV}"
