SUMMARY = "Core utilities for Python packages"
DESCRIPTION = "Core utilities for Python packages"
SECTION = "devel/python"

HOMEPAGE = "https://github.com/pypa/packaging"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=7bef9bf4a8e4263634d0597e7ba100b8"

PYPI_PACKAGE = "packaging"

DEPENDS += "${PYTHON_PN}-six-native ${PYTHON_PN}-pyparsing-native"

inherit pypi

SRC_URI[md5sum] = "dd118dc389f8e90840d44240292bf3d9"
SRC_URI[sha256sum] = "0c98a5d0be38ed775798ece1b9727178c4469d9c3b4ada66e8e6b7849f8732af"

inherit setuptools

BBCLASSEXTEND = "native"
