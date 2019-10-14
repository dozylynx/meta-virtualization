DESCRIPTION = "SeaBIOS"
HOMEPAGE = "http://www.coreboot.org/SeaBIOS"
LICENSE = "LGPLv3"
SECTION = "firmware"

SRC_URI = " \
    https://www.seabios.org/downloads/seabios-${PV}.tar.gz \
    file://hostcc.patch \
    "
S = "${WORKDIR}/${PN}-${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504         \
                    file://COPYING.LESSER;md5=6a6a8e020838b23406c81b19c1d46df6  \
                    "

SRC_URI[md5sum] = "2fd637b323d247a0948556104a2121c9"
SRC_URI[sha256sum] = "df17b8e565e75c27897ceb82af853b7c568eba7911f3bd173f8a68c1b4bda74b"

FILES_${PN} = "/usr/share/firmware"

DEPENDS = "util-linux-native file-native bison-native flex-native gettext-native acpica-native python-native"

TUNE_CCARGS = ""
EXTRA_OEMAKE += "HOSTCC='${BUILD_CC}'"
EXTRA_OEMAKE += "CROSS_PREFIX=${TARGET_PREFIX}"

COMPATIBLE_HOST = "(i.86|x86_64).*-linux"

do_configure() {
    oe_runmake defconfig
}

do_compile() {
    unset CPP
    unset CPPFLAGS
    oe_runmake
}

do_install() {
    oe_runmake
    install -d ${D}/usr/share/firmware
    install -m 0644 out/bios.bin ${D}/usr/share/firmware/
}

