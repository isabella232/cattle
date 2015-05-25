#!/bin/bash

. ${CATTLE_HOME:-/var/lib/cattle}/common/scripts.sh

echo 1 > /proc/sys/net/ipv4/ip_forward
echo 0 > /proc/sys/net/ipv4/conf/all/rp_filter
echo 0 > /proc/sys/net/ipv4/conf/eth0/rp_filter

iptables-restore -c < content-home/etc/cattle/iptables-save

stage_files
