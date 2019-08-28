SUMMARY = "Python package to parse an image file header and return image size"
DESCRIPTION = "Python package to parse an image file header and return image size"
SECTION = "devel/python"

HOMEPAGE = "https://pypi.org/project/imagesize/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=0c128f0f7e8a02e1b83884c0b5a41cda"

PYPI_PACKAGE = "imagesize"

inherit pypi

SRC_URI[md5sum] = "2f89749b05e07c79c46330dbc62f1e02"
SRC_URI[sha256sum] = "f3832918bc3c66617f92e35f5d70729187676313caa60c187eb0f28b8fe5e3b5"

inherit setuptools

BBCLASSEXTEND = "native"
