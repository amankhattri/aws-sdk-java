/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the results of a transform job output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TransformOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransformOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 path where you want Amazon SageMaker to store the results of the transform job. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * <p>
     * For every S3 object used as input for the transform job, the transformed data is stored in a corresponding
     * subfolder in the location under the output prefix. For example, the input data
     * <code>s3://bucket-name/input-name-prefix/dataset01/data.csv</code> will have the transformed data stored at
     * <code>s3://bucket-name/key-name-prefix/dataset01/</code>, based on the original name, as a series of .part files
     * (.part0001, part0002, etc).
     * </p>
     */
    private String s3OutputPath;
    /**
     * <p>
     * The MIME type used to specify the output data. Amazon SageMaker uses the MIME type with each http call to
     * transfer data from the transform job.
     * </p>
     */
    private String accept;
    /**
     * <p>
     * Defines how to assemble the results of the transform job as a single S3 object. You should select a format that
     * is most convenient to you. To concatenate the results in binary format, specify <code>None</code>. To add a
     * newline character at the end of every transformed record, specify <code>Line</code>. To assemble the output in
     * RecordIO format, specify <code>RecordIO</code>. The default value is <code>None</code>.
     * </p>
     * <p>
     * For information about the <code>RecordIO</code> format, see <a
     * href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     * </p>
     */
    private String assembleWith;
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key for Amazon S3 server-side encryption that Amazon SageMaker uses to
     * encrypt the transformed data.
     * </p>
     * <p>
     * If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's
     * account. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption Keys</a> in
     * the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify in your <code>CreateTramsformJob</code>
     * request. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS KMS</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The Amazon S3 path where you want Amazon SageMaker to store the results of the transform job. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * <p>
     * For every S3 object used as input for the transform job, the transformed data is stored in a corresponding
     * subfolder in the location under the output prefix. For example, the input data
     * <code>s3://bucket-name/input-name-prefix/dataset01/data.csv</code> will have the transformed data stored at
     * <code>s3://bucket-name/key-name-prefix/dataset01/</code>, based on the original name, as a series of .part files
     * (.part0001, part0002, etc).
     * </p>
     * 
     * @param s3OutputPath
     *        The Amazon S3 path where you want Amazon SageMaker to store the results of the transform job. For example,
     *        <code>s3://bucket-name/key-name-prefix</code>.</p>
     *        <p>
     *        For every S3 object used as input for the transform job, the transformed data is stored in a corresponding
     *        subfolder in the location under the output prefix. For example, the input data
     *        <code>s3://bucket-name/input-name-prefix/dataset01/data.csv</code> will have the transformed data stored
     *        at <code>s3://bucket-name/key-name-prefix/dataset01/</code>, based on the original name, as a series of
     *        .part files (.part0001, part0002, etc).
     */

    public void setS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * <p>
     * The Amazon S3 path where you want Amazon SageMaker to store the results of the transform job. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * <p>
     * For every S3 object used as input for the transform job, the transformed data is stored in a corresponding
     * subfolder in the location under the output prefix. For example, the input data
     * <code>s3://bucket-name/input-name-prefix/dataset01/data.csv</code> will have the transformed data stored at
     * <code>s3://bucket-name/key-name-prefix/dataset01/</code>, based on the original name, as a series of .part files
     * (.part0001, part0002, etc).
     * </p>
     * 
     * @return The Amazon S3 path where you want Amazon SageMaker to store the results of the transform job. For
     *         example, <code>s3://bucket-name/key-name-prefix</code>.</p>
     *         <p>
     *         For every S3 object used as input for the transform job, the transformed data is stored in a
     *         corresponding subfolder in the location under the output prefix. For example, the input data
     *         <code>s3://bucket-name/input-name-prefix/dataset01/data.csv</code> will have the transformed data stored
     *         at <code>s3://bucket-name/key-name-prefix/dataset01/</code>, based on the original name, as a series of
     *         .part files (.part0001, part0002, etc).
     */

    public String getS3OutputPath() {
        return this.s3OutputPath;
    }

    /**
     * <p>
     * The Amazon S3 path where you want Amazon SageMaker to store the results of the transform job. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * <p>
     * For every S3 object used as input for the transform job, the transformed data is stored in a corresponding
     * subfolder in the location under the output prefix. For example, the input data
     * <code>s3://bucket-name/input-name-prefix/dataset01/data.csv</code> will have the transformed data stored at
     * <code>s3://bucket-name/key-name-prefix/dataset01/</code>, based on the original name, as a series of .part files
     * (.part0001, part0002, etc).
     * </p>
     * 
     * @param s3OutputPath
     *        The Amazon S3 path where you want Amazon SageMaker to store the results of the transform job. For example,
     *        <code>s3://bucket-name/key-name-prefix</code>.</p>
     *        <p>
     *        For every S3 object used as input for the transform job, the transformed data is stored in a corresponding
     *        subfolder in the location under the output prefix. For example, the input data
     *        <code>s3://bucket-name/input-name-prefix/dataset01/data.csv</code> will have the transformed data stored
     *        at <code>s3://bucket-name/key-name-prefix/dataset01/</code>, based on the original name, as a series of
     *        .part files (.part0001, part0002, etc).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformOutput withS3OutputPath(String s3OutputPath) {
        setS3OutputPath(s3OutputPath);
        return this;
    }

    /**
     * <p>
     * The MIME type used to specify the output data. Amazon SageMaker uses the MIME type with each http call to
     * transfer data from the transform job.
     * </p>
     * 
     * @param accept
     *        The MIME type used to specify the output data. Amazon SageMaker uses the MIME type with each http call to
     *        transfer data from the transform job.
     */

    public void setAccept(String accept) {
        this.accept = accept;
    }

    /**
     * <p>
     * The MIME type used to specify the output data. Amazon SageMaker uses the MIME type with each http call to
     * transfer data from the transform job.
     * </p>
     * 
     * @return The MIME type used to specify the output data. Amazon SageMaker uses the MIME type with each http call to
     *         transfer data from the transform job.
     */

    public String getAccept() {
        return this.accept;
    }

    /**
     * <p>
     * The MIME type used to specify the output data. Amazon SageMaker uses the MIME type with each http call to
     * transfer data from the transform job.
     * </p>
     * 
     * @param accept
     *        The MIME type used to specify the output data. Amazon SageMaker uses the MIME type with each http call to
     *        transfer data from the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformOutput withAccept(String accept) {
        setAccept(accept);
        return this;
    }

    /**
     * <p>
     * Defines how to assemble the results of the transform job as a single S3 object. You should select a format that
     * is most convenient to you. To concatenate the results in binary format, specify <code>None</code>. To add a
     * newline character at the end of every transformed record, specify <code>Line</code>. To assemble the output in
     * RecordIO format, specify <code>RecordIO</code>. The default value is <code>None</code>.
     * </p>
     * <p>
     * For information about the <code>RecordIO</code> format, see <a
     * href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     * </p>
     * 
     * @param assembleWith
     *        Defines how to assemble the results of the transform job as a single S3 object. You should select a format
     *        that is most convenient to you. To concatenate the results in binary format, specify <code>None</code>. To
     *        add a newline character at the end of every transformed record, specify <code>Line</code>. To assemble the
     *        output in RecordIO format, specify <code>RecordIO</code>. The default value is <code>None</code>.</p>
     *        <p>
     *        For information about the <code>RecordIO</code> format, see <a
     *        href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     * @see AssemblyType
     */

    public void setAssembleWith(String assembleWith) {
        this.assembleWith = assembleWith;
    }

    /**
     * <p>
     * Defines how to assemble the results of the transform job as a single S3 object. You should select a format that
     * is most convenient to you. To concatenate the results in binary format, specify <code>None</code>. To add a
     * newline character at the end of every transformed record, specify <code>Line</code>. To assemble the output in
     * RecordIO format, specify <code>RecordIO</code>. The default value is <code>None</code>.
     * </p>
     * <p>
     * For information about the <code>RecordIO</code> format, see <a
     * href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     * </p>
     * 
     * @return Defines how to assemble the results of the transform job as a single S3 object. You should select a
     *         format that is most convenient to you. To concatenate the results in binary format, specify
     *         <code>None</code>. To add a newline character at the end of every transformed record, specify
     *         <code>Line</code>. To assemble the output in RecordIO format, specify <code>RecordIO</code>. The default
     *         value is <code>None</code>.</p>
     *         <p>
     *         For information about the <code>RecordIO</code> format, see <a
     *         href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     * @see AssemblyType
     */

    public String getAssembleWith() {
        return this.assembleWith;
    }

    /**
     * <p>
     * Defines how to assemble the results of the transform job as a single S3 object. You should select a format that
     * is most convenient to you. To concatenate the results in binary format, specify <code>None</code>. To add a
     * newline character at the end of every transformed record, specify <code>Line</code>. To assemble the output in
     * RecordIO format, specify <code>RecordIO</code>. The default value is <code>None</code>.
     * </p>
     * <p>
     * For information about the <code>RecordIO</code> format, see <a
     * href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     * </p>
     * 
     * @param assembleWith
     *        Defines how to assemble the results of the transform job as a single S3 object. You should select a format
     *        that is most convenient to you. To concatenate the results in binary format, specify <code>None</code>. To
     *        add a newline character at the end of every transformed record, specify <code>Line</code>. To assemble the
     *        output in RecordIO format, specify <code>RecordIO</code>. The default value is <code>None</code>.</p>
     *        <p>
     *        For information about the <code>RecordIO</code> format, see <a
     *        href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssemblyType
     */

    public TransformOutput withAssembleWith(String assembleWith) {
        setAssembleWith(assembleWith);
        return this;
    }

    /**
     * <p>
     * Defines how to assemble the results of the transform job as a single S3 object. You should select a format that
     * is most convenient to you. To concatenate the results in binary format, specify <code>None</code>. To add a
     * newline character at the end of every transformed record, specify <code>Line</code>. To assemble the output in
     * RecordIO format, specify <code>RecordIO</code>. The default value is <code>None</code>.
     * </p>
     * <p>
     * For information about the <code>RecordIO</code> format, see <a
     * href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     * </p>
     * 
     * @param assembleWith
     *        Defines how to assemble the results of the transform job as a single S3 object. You should select a format
     *        that is most convenient to you. To concatenate the results in binary format, specify <code>None</code>. To
     *        add a newline character at the end of every transformed record, specify <code>Line</code>. To assemble the
     *        output in RecordIO format, specify <code>RecordIO</code>. The default value is <code>None</code>.</p>
     *        <p>
     *        For information about the <code>RecordIO</code> format, see <a
     *        href="http://mxnet.io/architecture/note_data_loading.html#data-format">Data Format</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssemblyType
     */

    public TransformOutput withAssembleWith(AssemblyType assembleWith) {
        this.assembleWith = assembleWith.toString();
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key for Amazon S3 server-side encryption that Amazon SageMaker uses to
     * encrypt the transformed data.
     * </p>
     * <p>
     * If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's
     * account. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption Keys</a> in
     * the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify in your <code>CreateTramsformJob</code>
     * request. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS KMS</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (AWS KMS) key for Amazon S3 server-side encryption that Amazon SageMaker
     *        uses to encrypt the transformed data.</p>
     *        <p>
     *        If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's
     *        account. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption
     *        Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i>
     *        </p>
     *        <p>
     *        The KMS key policy must grant permission to the IAM role that you specify in your
     *        <code>CreateTramsformJob</code> request. For more information, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS
     *        KMS</a> in the <i>AWS Key Management Service Developer Guide</i>.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key for Amazon S3 server-side encryption that Amazon SageMaker uses to
     * encrypt the transformed data.
     * </p>
     * <p>
     * If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's
     * account. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption Keys</a> in
     * the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify in your <code>CreateTramsformJob</code>
     * request. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS KMS</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return The AWS Key Management Service (AWS KMS) key for Amazon S3 server-side encryption that Amazon SageMaker
     *         uses to encrypt the transformed data.</p>
     *         <p>
     *         If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your
     *         role's account. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption
     *         Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i>
     *         </p>
     *         <p>
     *         The KMS key policy must grant permission to the IAM role that you specify in your
     *         <code>CreateTramsformJob</code> request. For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS
     *         KMS</a> in the <i>AWS Key Management Service Developer Guide</i>.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key for Amazon S3 server-side encryption that Amazon SageMaker uses to
     * encrypt the transformed data.
     * </p>
     * <p>
     * If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's
     * account. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption Keys</a> in
     * the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify in your <code>CreateTramsformJob</code>
     * request. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS KMS</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (AWS KMS) key for Amazon S3 server-side encryption that Amazon SageMaker
     *        uses to encrypt the transformed data.</p>
     *        <p>
     *        If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's
     *        account. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption
     *        Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i>
     *        </p>
     *        <p>
     *        The KMS key policy must grant permission to the IAM role that you specify in your
     *        <code>CreateTramsformJob</code> request. For more information, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS
     *        KMS</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransformOutput withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getS3OutputPath() != null)
            sb.append("S3OutputPath: ").append(getS3OutputPath()).append(",");
        if (getAccept() != null)
            sb.append("Accept: ").append(getAccept()).append(",");
        if (getAssembleWith() != null)
            sb.append("AssembleWith: ").append(getAssembleWith()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransformOutput == false)
            return false;
        TransformOutput other = (TransformOutput) obj;
        if (other.getS3OutputPath() == null ^ this.getS3OutputPath() == null)
            return false;
        if (other.getS3OutputPath() != null && other.getS3OutputPath().equals(this.getS3OutputPath()) == false)
            return false;
        if (other.getAccept() == null ^ this.getAccept() == null)
            return false;
        if (other.getAccept() != null && other.getAccept().equals(this.getAccept()) == false)
            return false;
        if (other.getAssembleWith() == null ^ this.getAssembleWith() == null)
            return false;
        if (other.getAssembleWith() != null && other.getAssembleWith().equals(this.getAssembleWith()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3OutputPath() == null) ? 0 : getS3OutputPath().hashCode());
        hashCode = prime * hashCode + ((getAccept() == null) ? 0 : getAccept().hashCode());
        hashCode = prime * hashCode + ((getAssembleWith() == null) ? 0 : getAssembleWith().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public TransformOutput clone() {
        try {
            return (TransformOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TransformOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
