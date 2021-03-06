/**
 * Copyright 2018 LinkedIn Corporation. All rights reserved. Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.tony;

import org.apache.hadoop.yarn.api.ApplicationConstants;
import org.apache.hadoop.yarn.conf.YarnConfiguration;


public class Constants {

  // Environment constants
  public static final String TB_PORT = "TB_PORT";
  public static final String TASK_INDEX = "TASK_INDEX";
  public static final String TASK_NUM = "TASK_NUM";
  public static final String CLUSTER_SPEC = "CLUSTER_SPEC";
  // Distributed TensorFlow job name, e.g. "ps" or "worker",
  // as per https://www.tensorflow.org/deploy/distributed
  public static final String JOB_NAME = "JOB_NAME";
  public static final String PRE_JOB_SHELL = "PRE_JOB_SHELL";
  public static final String POST_JOB_SHELL = "POST_JOB_SHELL";
  public static final String SESSION_ID = "SESSION_ID";
  public static final String PREPROCESSING_JOB = "PREPROCESSING_JOB";
  public static final String PY4JGATEWAY = "PY4J_GATEWAY_PORT";

  // Environment variables for resource localization
  public static final String TF_ZIP_PREFIX = "TF_ZIP";
  public static final String TONY_CONF_PREFIX = "TONY_CONF";

  public static final String PATH_SUFFIX = "_PATH";
  public static final String TIMESTAMP_SUFFIX = "_TIMESTAMP";
  public static final String LENGTH_SUFFIX = "_LENGTH";

  public static final String TF_ZIP_NAME = "tf.zip";

  public static final String PYTHON_VENV_DIR = "venv";
  public static final String TASK_PARAM_KEY = "MODEL_PARAMS";

  public static final String AM_STDOUT_FILENAME = "amstdout.log";
  public static final String AM_STDERR_FILENAME = "amstderr.log";

  public static final String HDFS_CONF_PATH = "HDFS_CONF_PATH";
  public static final String YARN_CONF_PATH = "YARN_CONF_PATH";
  public static final String HDFS_SITE_CONF = "hdfs-site.xml";
  public static final String CORE_SITE_CONF = YarnConfiguration.CORE_SITE_CONFIGURATION_FILE;
  public static final String HADOOP_CONF_DIR = ApplicationConstants.Environment.HADOOP_CONF_DIR.key();

  public static final String WORKER_JOB_NAME = "worker";
  public static final String PS_JOB_NAME = "ps";
  public static final String ATTEMPT_NUMBER = "ATTEMPT_NUMBER";

  public static final String TEST_AM_CRASH = "TEST_AM_CRASH";
  public static final String TEST_TASK_EXECUTOR_HANG = "TEST_TASK_EXECUTOR_HANG";
  public static final String TEST_TASK_EXECUTOR_NUM_HB_MISS = "TEST_TASK_EXECUTOR_NUM_HB_MISS";
  // Should be of the form type#id#ms
  public static final String TEST_TASK_EXECUTOR_SKEW = "TEST_TASK_EXECUTOR_SKEW";

  // Used to get all Hadoop jar paths. Reference: https://www.tensorflow.org/deploy/hadoop
  public static final String HADOOP_CLASSPATH_COMMAND = "CLASSPATH=$(${HADOOP_HDFS_HOME}/bin/hadoop classpath --glob) ";
  public static final String SKIP_HADOOP_PATH = "SKIP_HADOOP_PATH";

  public static final String TONY_DEFAULT_XML = "tony-default.xml";
  public static final String TONY_XML = "tony.xml";
  public static final String TONY_FINAL_XML = "tony-final.xml";
  public static final String TONY_FOLDER = ".tony";

  private Constants() { }
}
