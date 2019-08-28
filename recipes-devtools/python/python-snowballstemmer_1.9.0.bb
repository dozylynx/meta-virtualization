SUMMARY = "Stemmers for languages generated from Snowball algorithms"
DESCRIPTION = "Stemmers for languages generated from Snowball algorithms"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.org/project/snowballstemmer/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://README.rst;beginline=68;md5=10f8b1281bb233279327d0e842d9b8b4"

PYPI_PACKAGE = "snowballstemmer"

inherit pypi

SRC_URI[md5sum] = "390ee6ab90cd202d6d2dc180f6aaea04"
SRC_URI[sha256sum] = "9f3b9ffe0809d174f7047e121431acf99c89a7040f0ca84f94ba53a498e6d0c9"

inherit setuptools

BBCLASSEXTEND = "native"
