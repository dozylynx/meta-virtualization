SUMMARY = "A python API to easily integrate Sphinx documentation into your Web application"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.python.org/pypi/sphinxcontrib-websupport"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=819a10ab58e77e03e61a584de6339f7c"

SRC_URI = "https://pypi.python.org/packages/source/s/sphinxcontrib_websupport/sphinxcontrib-websupport-${PV}.tar.gz"

SRC_URI[md5sum] = "5f5be8f1fb8228fc15f01a6081e2f2e9"
SRC_URI[sha256sum] = "1501befb0fdf1d1c29a800fdbf4ef5dc5369377300ddbdd16d2cd40e54c6eefc"

S = "${WORKDIR}/sphinxcontrib-websupport-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
