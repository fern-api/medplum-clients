//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ExplanationOfBenefit_Diagnosis}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_Diagnosis.builder()}.
 */
@org.immutables.value.Generated(from = "ExplanationOfBenefit_Diagnosis", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_Diagnosis implements com.fhir.ExplanationOfBenefit_Diagnosis {
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
  private final @javax.annotation.Nullable com.fhir.Reference diagnosisReference;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.positiveInt sequence;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept diagnosisCodeableConcept;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept onAdmission;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept packageCode;

  private ImmutableExplanationOfBenefit_Diagnosis(
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type,
      @javax.annotation.Nullable com.fhir.Reference diagnosisReference,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.positiveInt sequence,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CodeableConcept diagnosisCodeableConcept,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CodeableConcept onAdmission,
      @javax.annotation.Nullable com.fhir.CodeableConcept packageCode) {
    this.type = type;
    this.diagnosisReference = diagnosisReference;
    this.id = id;
    this.sequence = sequence;
    this.modifierExtension = modifierExtension;
    this.diagnosisCodeableConcept = diagnosisCodeableConcept;
    this.extension = extension;
    this.onAdmission = onAdmission;
    this.packageCode = packageCode;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code diagnosisReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("diagnosisReference")
  @Override
  public java.util.Optional<com.fhir.Reference> diagnosisReference() {
    return java.util.Optional.ofNullable(diagnosisReference);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code sequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sequence")
  @Override
  public java.util.Optional<com.fhir.positiveInt> sequence() {
    return java.util.Optional.ofNullable(sequence);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code diagnosisCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("diagnosisCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> diagnosisCodeableConcept() {
    return java.util.Optional.ofNullable(diagnosisCodeableConcept);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code onAdmission} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("onAdmission")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> onAdmission() {
    return java.util.Optional.ofNullable(onAdmission);
  }

  /**
   * @return The value of the {@code packageCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("packageCode")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> packageCode() {
    return java.util.Optional.ofNullable(packageCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        newValue,
        this.diagnosisReference,
        this.id,
        this.sequence,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension,
        this.onAdmission,
        this.packageCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Diagnosis withType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        value,
        this.diagnosisReference,
        this.id,
        this.sequence,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension,
        this.onAdmission,
        this.packageCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#diagnosisReference() diagnosisReference} attribute.
   * @param value The value for diagnosisReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withDiagnosisReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "diagnosisReference");
    if (this.diagnosisReference == newValue) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.type,
        newValue,
        this.id,
        this.sequence,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension,
        this.onAdmission,
        this.packageCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#diagnosisReference() diagnosisReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosisReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Diagnosis withDiagnosisReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.diagnosisReference == value) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.type,
        value,
        this.id,
        this.sequence,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension,
        this.onAdmission,
        this.packageCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.type,
        this.diagnosisReference,
        newValue,
        this.sequence,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension,
        this.onAdmission,
        this.packageCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.type,
        this.diagnosisReference,
        value,
        this.sequence,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension,
        this.onAdmission,
        this.packageCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withSequence(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.type,
        this.diagnosisReference,
        this.id,
        newValue,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension,
        this.onAdmission,
        this.packageCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Diagnosis withSequence(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.type,
        this.diagnosisReference,
        this.id,
        value,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension,
        this.onAdmission,
        this.packageCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.type,
        this.diagnosisReference,
        this.id,
        this.sequence,
        newValue,
        this.diagnosisCodeableConcept,
        this.extension,
        this.onAdmission,
        this.packageCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Diagnosis withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.type,
        this.diagnosisReference,
        this.id,
        this.sequence,
        value,
        this.diagnosisCodeableConcept,
        this.extension,
        this.onAdmission,
        this.packageCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept} attribute.
   * @param value The value for diagnosisCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withDiagnosisCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "diagnosisCodeableConcept");
    if (this.diagnosisCodeableConcept == newValue) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.type,
        this.diagnosisReference,
        this.id,
        this.sequence,
        this.modifierExtension,
        newValue,
        this.extension,
        this.onAdmission,
        this.packageCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosisCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Diagnosis withDiagnosisCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.diagnosisCodeableConcept == value) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.type,
        this.diagnosisReference,
        this.id,
        this.sequence,
        this.modifierExtension,
        value,
        this.extension,
        this.onAdmission,
        this.packageCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.type,
        this.diagnosisReference,
        this.id,
        this.sequence,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        newValue,
        this.onAdmission,
        this.packageCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Diagnosis withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.type,
        this.diagnosisReference,
        this.id,
        this.sequence,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        value,
        this.onAdmission,
        this.packageCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#onAdmission() onAdmission} attribute.
   * @param value The value for onAdmission
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withOnAdmission(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "onAdmission");
    if (this.onAdmission == newValue) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.type,
        this.diagnosisReference,
        this.id,
        this.sequence,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension,
        newValue,
        this.packageCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#onAdmission() onAdmission} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onAdmission
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Diagnosis withOnAdmission(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.onAdmission == value) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.type,
        this.diagnosisReference,
        this.id,
        this.sequence,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension,
        value,
        this.packageCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#packageCode() packageCode} attribute.
   * @param value The value for packageCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withPackageCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "packageCode");
    if (this.packageCode == newValue) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.type,
        this.diagnosisReference,
        this.id,
        this.sequence,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension,
        this.onAdmission,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#packageCode() packageCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for packageCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Diagnosis withPackageCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.packageCode == value) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.type,
        this.diagnosisReference,
        this.id,
        this.sequence,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension,
        this.onAdmission,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_Diagnosis} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_Diagnosis
        && equalTo((ImmutableExplanationOfBenefit_Diagnosis) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_Diagnosis another) {
    return java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(diagnosisReference, another.diagnosisReference)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(sequence, another.sequence)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(diagnosisCodeableConcept, another.diagnosisCodeableConcept)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(onAdmission, another.onAdmission)
        && java.util.Objects.equals(packageCode, another.packageCode);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code diagnosisReference}, {@code id}, {@code sequence}, {@code modifierExtension}, {@code diagnosisCodeableConcept}, {@code extension}, {@code onAdmission}, {@code packageCode}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(diagnosisReference);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(sequence);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(diagnosisCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(onAdmission);
    h += (h << 5) + java.util.Objects.hashCode(packageCode);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_Diagnosis} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ExplanationOfBenefit_Diagnosis{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (diagnosisReference != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("diagnosisReference=").append(diagnosisReference);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (sequence != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (diagnosisCodeableConcept != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("diagnosisCodeableConcept=").append(diagnosisCodeableConcept);
    }
    if (extension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (onAdmission != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("onAdmission=").append(onAdmission);
    }
    if (packageCode != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("packageCode=").append(packageCode);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ExplanationOfBenefit_Diagnosis", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ExplanationOfBenefit_Diagnosis {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> diagnosisReference = java.util.Optional.empty();
    boolean diagnosisReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> sequence = java.util.Optional.empty();
    boolean sequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> diagnosisCodeableConcept = java.util.Optional.empty();
    boolean diagnosisCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> onAdmission = java.util.Optional.empty();
    boolean onAdmissionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> packageCode = java.util.Optional.empty();
    boolean packageCodeIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosisReference")
    public void setDiagnosisReference(java.util.Optional<com.fhir.Reference> diagnosisReference) {
      this.diagnosisReference = diagnosisReference;
      this.diagnosisReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public void setSequence(java.util.Optional<com.fhir.positiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosisCodeableConcept")
    public void setDiagnosisCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> diagnosisCodeableConcept) {
      this.diagnosisCodeableConcept = diagnosisCodeableConcept;
      this.diagnosisCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("onAdmission")
    public void setOnAdmission(java.util.Optional<com.fhir.CodeableConcept> onAdmission) {
      this.onAdmission = onAdmission;
      this.onAdmissionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("packageCode")
    public void setPackageCode(java.util.Optional<com.fhir.CodeableConcept> packageCode) {
      this.packageCode = packageCode;
      this.packageCodeIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> diagnosisReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> diagnosisCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> onAdmission() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> packageCode() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_Diagnosis fromJson(Json json) {
    ImmutableExplanationOfBenefit_Diagnosis.Builder builder = ImmutableExplanationOfBenefit_Diagnosis.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.diagnosisReferenceIsSet) {
      builder.diagnosisReference(json.diagnosisReference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.diagnosisCodeableConceptIsSet) {
      builder.diagnosisCodeableConcept(json.diagnosisCodeableConcept);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.onAdmissionIsSet) {
      builder.onAdmission(json.onAdmission);
    }
    if (json.packageCodeIsSet) {
      builder.packageCode(json.packageCode);
    }
    return (ImmutableExplanationOfBenefit_Diagnosis) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_Diagnosis} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_Diagnosis instance
   */
  public static ExplanationOfBenefit_Diagnosis copyOf(ExplanationOfBenefit_Diagnosis instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_Diagnosis) {
      return (ImmutableExplanationOfBenefit_Diagnosis) instance;
    }
    return ImmutableExplanationOfBenefit_Diagnosis.builder()
        .type(instance.type())
        .diagnosisReference(instance.diagnosisReference())
        .id(instance.id())
        .sequence(instance.sequence())
        .modifierExtension(instance.modifierExtension())
        .diagnosisCodeableConcept(instance.diagnosisCodeableConcept())
        .extension(instance.extension())
        .onAdmission(instance.onAdmission())
        .packageCode(instance.packageCode())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_Diagnosis ExplanationOfBenefit_Diagnosis}.
   * <pre>
   * ImmutableExplanationOfBenefit_Diagnosis.builder()
   *    .type(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_Diagnosis#type() type}
   *    .diagnosisReference(com.fhir.Reference) // optional {@link ExplanationOfBenefit_Diagnosis#diagnosisReference() diagnosisReference}
   *    .id(String) // optional {@link ExplanationOfBenefit_Diagnosis#id() id}
   *    .sequence(com.fhir.positiveInt) // optional {@link ExplanationOfBenefit_Diagnosis#sequence() sequence}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Diagnosis#modifierExtension() modifierExtension}
   *    .diagnosisCodeableConcept(com.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Diagnosis#extension() extension}
   *    .onAdmission(com.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_Diagnosis#onAdmission() onAdmission}
   *    .packageCode(com.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_Diagnosis#packageCode() packageCode}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_Diagnosis builder
   */
  public static ImmutableExplanationOfBenefit_Diagnosis.Builder builder() {
    return new ImmutableExplanationOfBenefit_Diagnosis.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_Diagnosis ExplanationOfBenefit_Diagnosis}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ExplanationOfBenefit_Diagnosis", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_DIAGNOSIS_REFERENCE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_SEQUENCE = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_DIAGNOSIS_CODEABLE_CONCEPT = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_ON_ADMISSION = 0x80L;
    private static final long OPT_BIT_PACKAGE_CODE = 0x100L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
    private @javax.annotation.Nullable com.fhir.Reference diagnosisReference;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.positiveInt sequence;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept diagnosisCodeableConcept;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept onAdmission;
    private @javax.annotation.Nullable com.fhir.CodeableConcept packageCode;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(java.util.List<com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#diagnosisReference() diagnosisReference} to diagnosisReference.
     * @param diagnosisReference The value for diagnosisReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosisReference(com.fhir.Reference diagnosisReference) {
      checkNotIsSet(diagnosisReferenceIsSet(), "diagnosisReference");
      this.diagnosisReference = java.util.Objects.requireNonNull(diagnosisReference, "diagnosisReference");
      optBits |= OPT_BIT_DIAGNOSIS_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#diagnosisReference() diagnosisReference} to diagnosisReference.
     * @param diagnosisReference The value for diagnosisReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosisReference")
    public final Builder diagnosisReference(java.util.Optional<? extends com.fhir.Reference> diagnosisReference) {
      checkNotIsSet(diagnosisReferenceIsSet(), "diagnosisReference");
      this.diagnosisReference = diagnosisReference.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(com.fhir.positiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = java.util.Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public final Builder sequence(java.util.Optional<? extends com.fhir.positiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept} to diagnosisCodeableConcept.
     * @param diagnosisCodeableConcept The value for diagnosisCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosisCodeableConcept(com.fhir.CodeableConcept diagnosisCodeableConcept) {
      checkNotIsSet(diagnosisCodeableConceptIsSet(), "diagnosisCodeableConcept");
      this.diagnosisCodeableConcept = java.util.Objects.requireNonNull(diagnosisCodeableConcept, "diagnosisCodeableConcept");
      optBits |= OPT_BIT_DIAGNOSIS_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept} to diagnosisCodeableConcept.
     * @param diagnosisCodeableConcept The value for diagnosisCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosisCodeableConcept")
    public final Builder diagnosisCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> diagnosisCodeableConcept) {
      checkNotIsSet(diagnosisCodeableConceptIsSet(), "diagnosisCodeableConcept");
      this.diagnosisCodeableConcept = diagnosisCodeableConcept.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#onAdmission() onAdmission} to onAdmission.
     * @param onAdmission The value for onAdmission
     * @return {@code this} builder for chained invocation
     */
    public final Builder onAdmission(com.fhir.CodeableConcept onAdmission) {
      checkNotIsSet(onAdmissionIsSet(), "onAdmission");
      this.onAdmission = java.util.Objects.requireNonNull(onAdmission, "onAdmission");
      optBits |= OPT_BIT_ON_ADMISSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#onAdmission() onAdmission} to onAdmission.
     * @param onAdmission The value for onAdmission
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onAdmission")
    public final Builder onAdmission(java.util.Optional<? extends com.fhir.CodeableConcept> onAdmission) {
      checkNotIsSet(onAdmissionIsSet(), "onAdmission");
      this.onAdmission = onAdmission.orElse(null);
      optBits |= OPT_BIT_ON_ADMISSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#packageCode() packageCode} to packageCode.
     * @param packageCode The value for packageCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder packageCode(com.fhir.CodeableConcept packageCode) {
      checkNotIsSet(packageCodeIsSet(), "packageCode");
      this.packageCode = java.util.Objects.requireNonNull(packageCode, "packageCode");
      optBits |= OPT_BIT_PACKAGE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#packageCode() packageCode} to packageCode.
     * @param packageCode The value for packageCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("packageCode")
    public final Builder packageCode(java.util.Optional<? extends com.fhir.CodeableConcept> packageCode) {
      checkNotIsSet(packageCodeIsSet(), "packageCode");
      this.packageCode = packageCode.orElse(null);
      optBits |= OPT_BIT_PACKAGE_CODE;
      return this;
    }

    /**
     * Builds a new {@link ExplanationOfBenefit_Diagnosis ExplanationOfBenefit_Diagnosis}.
     * @return An immutable instance of ExplanationOfBenefit_Diagnosis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ExplanationOfBenefit_Diagnosis build() {
      return new ImmutableExplanationOfBenefit_Diagnosis(
          type,
          diagnosisReference,
          id,
          sequence,
          modifierExtension,
          diagnosisCodeableConcept,
          extension,
          onAdmission,
          packageCode);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean diagnosisReferenceIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS_REFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean diagnosisCodeableConceptIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS_CODEABLE_CONCEPT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean onAdmissionIsSet() {
      return (optBits & OPT_BIT_ON_ADMISSION) != 0;
    }

    private boolean packageCodeIsSet() {
      return (optBits & OPT_BIT_PACKAGE_CODE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ExplanationOfBenefit_Diagnosis is strict, attribute is already set: ".concat(name));
    }
  }
}
