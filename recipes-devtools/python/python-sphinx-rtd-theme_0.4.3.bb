SUMMARY = "ReadTheDocs.org theme for Sphinx"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.org/project/sphinx-rtd-theme/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a1db7d4ef426c2935227264e1d4ae8f9"

SRC_URI = "https://pypi.python.org/packages/source/s/sphinx_rtd_theme/sphinx_rtd_theme-${PV}.tar.gz"

SRC_URI[md5sum] = "6c50f30bc39046f497d336039a0c13fa"
SRC_URI[sha256sum] = "728607e34d60456d736cc7991fd236afb828b21b82f956c5ea75f94c8414040a"

S = "${WORKDIR}/sphinx_rtd_theme-${PV}"

inherit setuptools

export BUILD_SYS
export HOST_SYS
export STAGING_INCDIR
export STAGING_LIBDIR

BBCLASSEXTEND = "native"
