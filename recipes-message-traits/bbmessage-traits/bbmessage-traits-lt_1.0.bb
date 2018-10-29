#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING.MIT;md5=838c366f69b72c5df05c96dff79b35f2"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# Use local tarball
SRC_URI = "file://bbmessage-traits-${PV}.tar.gz"

S = "${WORKDIR}/bbmessage-traits-${PV}"

inherit cmake

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""

