//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicinalProduct_ManufacturingBusinessOperation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProduct_ManufacturingBusinessOperation.builder()}.
 */
@org.immutables.value.Generated(from = "MedicinalProduct_ManufacturingBusinessOperation", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProduct_ManufacturingBusinessOperation
    implements com.fhir.MedicinalProduct_ManufacturingBusinessOperation {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Reference regulator;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> manufacturer;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept operationType;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.dateTime effectiveDate;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept confidentialityIndicator;
  private final @javax.annotation.Nullable com.fhir.Identifier authorisationReferenceNumber;

  private ImmutableMedicinalProduct_ManufacturingBusinessOperation(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Reference regulator,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> manufacturer,
      @javax.annotation.Nullable com.fhir.CodeableConcept operationType,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.dateTime effectiveDate,
      @javax.annotation.Nullable com.fhir.CodeableConcept confidentialityIndicator,
      @javax.annotation.Nullable com.fhir.Identifier authorisationReferenceNumber) {
    this.extension = extension;
    this.regulator = regulator;
    this.modifierExtension = modifierExtension;
    this.manufacturer = manufacturer;
    this.operationType = operationType;
    this.id = id;
    this.effectiveDate = effectiveDate;
    this.confidentialityIndicator = confidentialityIndicator;
    this.authorisationReferenceNumber = authorisationReferenceNumber;
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
   * @return The value of the {@code regulator} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("regulator")
  @Override
  public java.util.Optional<com.fhir.Reference> regulator() {
    return java.util.Optional.ofNullable(regulator);
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
   * @return The value of the {@code manufacturer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> manufacturer() {
    return java.util.Optional.ofNullable(manufacturer);
  }

  /**
   * @return The value of the {@code operationType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("operationType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> operationType() {
    return java.util.Optional.ofNullable(operationType);
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
   * @return The value of the {@code effectiveDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectiveDate")
  @Override
  public java.util.Optional<com.fhir.dateTime> effectiveDate() {
    return java.util.Optional.ofNullable(effectiveDate);
  }

  /**
   * @return The value of the {@code confidentialityIndicator} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("confidentialityIndicator")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> confidentialityIndicator() {
    return java.util.Optional.ofNullable(confidentialityIndicator);
  }

  /**
   * @return The value of the {@code authorisationReferenceNumber} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authorisationReferenceNumber")
  @Override
  public java.util.Optional<com.fhir.Identifier> authorisationReferenceNumber() {
    return java.util.Optional.ofNullable(authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        newValue,
        this.regulator,
        this.modifierExtension,
        this.manufacturer,
        this.operationType,
        this.id,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        value,
        this.regulator,
        this.modifierExtension,
        this.manufacturer,
        this.operationType,
        this.id,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#regulator() regulator} attribute.
   * @param value The value for regulator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withRegulator(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "regulator");
    if (this.regulator == newValue) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.extension,
        newValue,
        this.modifierExtension,
        this.manufacturer,
        this.operationType,
        this.id,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#regulator() regulator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for regulator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withRegulator(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.regulator == value) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.extension,
        value,
        this.modifierExtension,
        this.manufacturer,
        this.operationType,
        this.id,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.extension,
        this.regulator,
        newValue,
        this.manufacturer,
        this.operationType,
        this.id,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.extension,
        this.regulator,
        value,
        this.manufacturer,
        this.operationType,
        this.id,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#manufacturer() manufacturer} attribute.
   * @param value The value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withManufacturer(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "manufacturer");
    if (this.manufacturer == newValue) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.extension,
        this.regulator,
        this.modifierExtension,
        newValue,
        this.operationType,
        this.id,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#manufacturer() manufacturer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withManufacturer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.manufacturer == value) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.extension,
        this.regulator,
        this.modifierExtension,
        value,
        this.operationType,
        this.id,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#operationType() operationType} attribute.
   * @param value The value for operationType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withOperationType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "operationType");
    if (this.operationType == newValue) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.extension,
        this.regulator,
        this.modifierExtension,
        this.manufacturer,
        newValue,
        this.id,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#operationType() operationType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operationType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withOperationType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.operationType == value) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.extension,
        this.regulator,
        this.modifierExtension,
        this.manufacturer,
        value,
        this.id,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.extension,
        this.regulator,
        this.modifierExtension,
        this.manufacturer,
        this.operationType,
        newValue,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.extension,
        this.regulator,
        this.modifierExtension,
        this.manufacturer,
        this.operationType,
        value,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#effectiveDate() effectiveDate} attribute.
   * @param value The value for effectiveDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withEffectiveDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "effectiveDate");
    if (this.effectiveDate == newValue) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.extension,
        this.regulator,
        this.modifierExtension,
        this.manufacturer,
        this.operationType,
        this.id,
        newValue,
        this.confidentialityIndicator,
        this.authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#effectiveDate() effectiveDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withEffectiveDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.effectiveDate == value) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.extension,
        this.regulator,
        this.modifierExtension,
        this.manufacturer,
        this.operationType,
        this.id,
        value,
        this.confidentialityIndicator,
        this.authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#confidentialityIndicator() confidentialityIndicator} attribute.
   * @param value The value for confidentialityIndicator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withConfidentialityIndicator(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "confidentialityIndicator");
    if (this.confidentialityIndicator == newValue) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.extension,
        this.regulator,
        this.modifierExtension,
        this.manufacturer,
        this.operationType,
        this.id,
        this.effectiveDate,
        newValue,
        this.authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#confidentialityIndicator() confidentialityIndicator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for confidentialityIndicator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withConfidentialityIndicator(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.confidentialityIndicator == value) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.extension,
        this.regulator,
        this.modifierExtension,
        this.manufacturer,
        this.operationType,
        this.id,
        this.effectiveDate,
        value,
        this.authorisationReferenceNumber);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#authorisationReferenceNumber() authorisationReferenceNumber} attribute.
   * @param value The value for authorisationReferenceNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withAuthorisationReferenceNumber(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "authorisationReferenceNumber");
    if (this.authorisationReferenceNumber == newValue) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.extension,
        this.regulator,
        this.modifierExtension,
        this.manufacturer,
        this.operationType,
        this.id,
        this.effectiveDate,
        this.confidentialityIndicator,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#authorisationReferenceNumber() authorisationReferenceNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authorisationReferenceNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withAuthorisationReferenceNumber(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.authorisationReferenceNumber == value) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.extension,
        this.regulator,
        this.modifierExtension,
        this.manufacturer,
        this.operationType,
        this.id,
        this.effectiveDate,
        this.confidentialityIndicator,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProduct_ManufacturingBusinessOperation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProduct_ManufacturingBusinessOperation
        && equalTo((ImmutableMedicinalProduct_ManufacturingBusinessOperation) another);
  }

  private boolean equalTo(ImmutableMedicinalProduct_ManufacturingBusinessOperation another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(regulator, another.regulator)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(manufacturer, another.manufacturer)
        && java.util.Objects.equals(operationType, another.operationType)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(effectiveDate, another.effectiveDate)
        && java.util.Objects.equals(confidentialityIndicator, another.confidentialityIndicator)
        && java.util.Objects.equals(authorisationReferenceNumber, another.authorisationReferenceNumber);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code regulator}, {@code modifierExtension}, {@code manufacturer}, {@code operationType}, {@code id}, {@code effectiveDate}, {@code confidentialityIndicator}, {@code authorisationReferenceNumber}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(regulator);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(manufacturer);
    h += (h << 5) + java.util.Objects.hashCode(operationType);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(effectiveDate);
    h += (h << 5) + java.util.Objects.hashCode(confidentialityIndicator);
    h += (h << 5) + java.util.Objects.hashCode(authorisationReferenceNumber);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProduct_ManufacturingBusinessOperation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicinalProduct_ManufacturingBusinessOperation{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (regulator != null) {
      if (builder.length() > 48) builder.append(", ");
      builder.append("regulator=").append(regulator);
    }
    if (modifierExtension != null) {
      if (builder.length() > 48) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (manufacturer != null) {
      if (builder.length() > 48) builder.append(", ");
      builder.append("manufacturer=").append(manufacturer);
    }
    if (operationType != null) {
      if (builder.length() > 48) builder.append(", ");
      builder.append("operationType=").append(operationType);
    }
    if (id != null) {
      if (builder.length() > 48) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (effectiveDate != null) {
      if (builder.length() > 48) builder.append(", ");
      builder.append("effectiveDate=").append(effectiveDate);
    }
    if (confidentialityIndicator != null) {
      if (builder.length() > 48) builder.append(", ");
      builder.append("confidentialityIndicator=").append(confidentialityIndicator);
    }
    if (authorisationReferenceNumber != null) {
      if (builder.length() > 48) builder.append(", ");
      builder.append("authorisationReferenceNumber=").append(authorisationReferenceNumber);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MedicinalProduct_ManufacturingBusinessOperation", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicinalProduct_ManufacturingBusinessOperation {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> regulator = java.util.Optional.empty();
    boolean regulatorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> manufacturer = java.util.Optional.empty();
    boolean manufacturerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> operationType = java.util.Optional.empty();
    boolean operationTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> effectiveDate = java.util.Optional.empty();
    boolean effectiveDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> confidentialityIndicator = java.util.Optional.empty();
    boolean confidentialityIndicatorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> authorisationReferenceNumber = java.util.Optional.empty();
    boolean authorisationReferenceNumberIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("regulator")
    public void setRegulator(java.util.Optional<com.fhir.Reference> regulator) {
      this.regulator = regulator;
      this.regulatorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
    public void setManufacturer(java.util.Optional<java.util.List<com.fhir.Reference>> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    public void setOperationType(java.util.Optional<com.fhir.CodeableConcept> operationType) {
      this.operationType = operationType;
      this.operationTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveDate")
    public void setEffectiveDate(java.util.Optional<com.fhir.dateTime> effectiveDate) {
      this.effectiveDate = effectiveDate;
      this.effectiveDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("confidentialityIndicator")
    public void setConfidentialityIndicator(java.util.Optional<com.fhir.CodeableConcept> confidentialityIndicator) {
      this.confidentialityIndicator = confidentialityIndicator;
      this.confidentialityIndicatorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authorisationReferenceNumber")
    public void setAuthorisationReferenceNumber(java.util.Optional<com.fhir.Identifier> authorisationReferenceNumber) {
      this.authorisationReferenceNumber = authorisationReferenceNumber;
      this.authorisationReferenceNumberIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> regulator() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> operationType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> effectiveDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> confidentialityIndicator() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> authorisationReferenceNumber() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProduct_ManufacturingBusinessOperation fromJson(Json json) {
    ImmutableMedicinalProduct_ManufacturingBusinessOperation.Builder builder = ImmutableMedicinalProduct_ManufacturingBusinessOperation.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.regulatorIsSet) {
      builder.regulator(json.regulator);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.operationTypeIsSet) {
      builder.operationType(json.operationType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.effectiveDateIsSet) {
      builder.effectiveDate(json.effectiveDate);
    }
    if (json.confidentialityIndicatorIsSet) {
      builder.confidentialityIndicator(json.confidentialityIndicator);
    }
    if (json.authorisationReferenceNumberIsSet) {
      builder.authorisationReferenceNumber(json.authorisationReferenceNumber);
    }
    return (ImmutableMedicinalProduct_ManufacturingBusinessOperation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProduct_ManufacturingBusinessOperation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProduct_ManufacturingBusinessOperation instance
   */
  public static MedicinalProduct_ManufacturingBusinessOperation copyOf(MedicinalProduct_ManufacturingBusinessOperation instance) {
    if (instance instanceof ImmutableMedicinalProduct_ManufacturingBusinessOperation) {
      return (ImmutableMedicinalProduct_ManufacturingBusinessOperation) instance;
    }
    return ImmutableMedicinalProduct_ManufacturingBusinessOperation.builder()
        .extension(instance.extension())
        .regulator(instance.regulator())
        .modifierExtension(instance.modifierExtension())
        .manufacturer(instance.manufacturer())
        .operationType(instance.operationType())
        .id(instance.id())
        .effectiveDate(instance.effectiveDate())
        .confidentialityIndicator(instance.confidentialityIndicator())
        .authorisationReferenceNumber(instance.authorisationReferenceNumber())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProduct_ManufacturingBusinessOperation MedicinalProduct_ManufacturingBusinessOperation}.
   * <pre>
   * ImmutableMedicinalProduct_ManufacturingBusinessOperation.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#extension() extension}
   *    .regulator(com.fhir.Reference) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#regulator() regulator}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#modifierExtension() modifierExtension}
   *    .manufacturer(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#manufacturer() manufacturer}
   *    .operationType(com.fhir.CodeableConcept) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#operationType() operationType}
   *    .id(String) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#id() id}
   *    .effectiveDate(com.fhir.dateTime) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#effectiveDate() effectiveDate}
   *    .confidentialityIndicator(com.fhir.CodeableConcept) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#confidentialityIndicator() confidentialityIndicator}
   *    .authorisationReferenceNumber(com.fhir.Identifier) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#authorisationReferenceNumber() authorisationReferenceNumber}
   *    .build();
   * </pre>
   * @return A new MedicinalProduct_ManufacturingBusinessOperation builder
   */
  public static ImmutableMedicinalProduct_ManufacturingBusinessOperation.Builder builder() {
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProduct_ManufacturingBusinessOperation MedicinalProduct_ManufacturingBusinessOperation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MedicinalProduct_ManufacturingBusinessOperation", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_REGULATOR = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_MANUFACTURER = 0x8L;
    private static final long OPT_BIT_OPERATION_TYPE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_EFFECTIVE_DATE = 0x40L;
    private static final long OPT_BIT_CONFIDENTIALITY_INDICATOR = 0x80L;
    private static final long OPT_BIT_AUTHORISATION_REFERENCE_NUMBER = 0x100L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference regulator;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> manufacturer;
    private @javax.annotation.Nullable com.fhir.CodeableConcept operationType;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.dateTime effectiveDate;
    private @javax.annotation.Nullable com.fhir.CodeableConcept confidentialityIndicator;
    private @javax.annotation.Nullable com.fhir.Identifier authorisationReferenceNumber;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#regulator() regulator} to regulator.
     * @param regulator The value for regulator
     * @return {@code this} builder for chained invocation
     */
    public final Builder regulator(com.fhir.Reference regulator) {
      checkNotIsSet(regulatorIsSet(), "regulator");
      this.regulator = java.util.Objects.requireNonNull(regulator, "regulator");
      optBits |= OPT_BIT_REGULATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#regulator() regulator} to regulator.
     * @param regulator The value for regulator
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("regulator")
    public final Builder regulator(java.util.Optional<? extends com.fhir.Reference> regulator) {
      checkNotIsSet(regulatorIsSet(), "regulator");
      this.regulator = regulator.orElse(null);
      optBits |= OPT_BIT_REGULATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturer(java.util.List<com.fhir.Reference> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = java.util.Objects.requireNonNull(manufacturer, "manufacturer");
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
    public final Builder manufacturer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = manufacturer.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#operationType() operationType} to operationType.
     * @param operationType The value for operationType
     * @return {@code this} builder for chained invocation
     */
    public final Builder operationType(com.fhir.CodeableConcept operationType) {
      checkNotIsSet(operationTypeIsSet(), "operationType");
      this.operationType = java.util.Objects.requireNonNull(operationType, "operationType");
      optBits |= OPT_BIT_OPERATION_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#operationType() operationType} to operationType.
     * @param operationType The value for operationType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    public final Builder operationType(java.util.Optional<? extends com.fhir.CodeableConcept> operationType) {
      checkNotIsSet(operationTypeIsSet(), "operationType");
      this.operationType = operationType.orElse(null);
      optBits |= OPT_BIT_OPERATION_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#effectiveDate() effectiveDate} to effectiveDate.
     * @param effectiveDate The value for effectiveDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectiveDate(com.fhir.dateTime effectiveDate) {
      checkNotIsSet(effectiveDateIsSet(), "effectiveDate");
      this.effectiveDate = java.util.Objects.requireNonNull(effectiveDate, "effectiveDate");
      optBits |= OPT_BIT_EFFECTIVE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#effectiveDate() effectiveDate} to effectiveDate.
     * @param effectiveDate The value for effectiveDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveDate")
    public final Builder effectiveDate(java.util.Optional<? extends com.fhir.dateTime> effectiveDate) {
      checkNotIsSet(effectiveDateIsSet(), "effectiveDate");
      this.effectiveDate = effectiveDate.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#confidentialityIndicator() confidentialityIndicator} to confidentialityIndicator.
     * @param confidentialityIndicator The value for confidentialityIndicator
     * @return {@code this} builder for chained invocation
     */
    public final Builder confidentialityIndicator(com.fhir.CodeableConcept confidentialityIndicator) {
      checkNotIsSet(confidentialityIndicatorIsSet(), "confidentialityIndicator");
      this.confidentialityIndicator = java.util.Objects.requireNonNull(confidentialityIndicator, "confidentialityIndicator");
      optBits |= OPT_BIT_CONFIDENTIALITY_INDICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#confidentialityIndicator() confidentialityIndicator} to confidentialityIndicator.
     * @param confidentialityIndicator The value for confidentialityIndicator
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("confidentialityIndicator")
    public final Builder confidentialityIndicator(java.util.Optional<? extends com.fhir.CodeableConcept> confidentialityIndicator) {
      checkNotIsSet(confidentialityIndicatorIsSet(), "confidentialityIndicator");
      this.confidentialityIndicator = confidentialityIndicator.orElse(null);
      optBits |= OPT_BIT_CONFIDENTIALITY_INDICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#authorisationReferenceNumber() authorisationReferenceNumber} to authorisationReferenceNumber.
     * @param authorisationReferenceNumber The value for authorisationReferenceNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder authorisationReferenceNumber(com.fhir.Identifier authorisationReferenceNumber) {
      checkNotIsSet(authorisationReferenceNumberIsSet(), "authorisationReferenceNumber");
      this.authorisationReferenceNumber = java.util.Objects.requireNonNull(authorisationReferenceNumber, "authorisationReferenceNumber");
      optBits |= OPT_BIT_AUTHORISATION_REFERENCE_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#authorisationReferenceNumber() authorisationReferenceNumber} to authorisationReferenceNumber.
     * @param authorisationReferenceNumber The value for authorisationReferenceNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authorisationReferenceNumber")
    public final Builder authorisationReferenceNumber(java.util.Optional<? extends com.fhir.Identifier> authorisationReferenceNumber) {
      checkNotIsSet(authorisationReferenceNumberIsSet(), "authorisationReferenceNumber");
      this.authorisationReferenceNumber = authorisationReferenceNumber.orElse(null);
      optBits |= OPT_BIT_AUTHORISATION_REFERENCE_NUMBER;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProduct_ManufacturingBusinessOperation MedicinalProduct_ManufacturingBusinessOperation}.
     * @return An immutable instance of MedicinalProduct_ManufacturingBusinessOperation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicinalProduct_ManufacturingBusinessOperation build() {
      return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
          extension,
          regulator,
          modifierExtension,
          manufacturer,
          operationType,
          id,
          effectiveDate,
          confidentialityIndicator,
          authorisationReferenceNumber);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean regulatorIsSet() {
      return (optBits & OPT_BIT_REGULATOR) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean operationTypeIsSet() {
      return (optBits & OPT_BIT_OPERATION_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean effectiveDateIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_DATE) != 0;
    }

    private boolean confidentialityIndicatorIsSet() {
      return (optBits & OPT_BIT_CONFIDENTIALITY_INDICATOR) != 0;
    }

    private boolean authorisationReferenceNumberIsSet() {
      return (optBits & OPT_BIT_AUTHORISATION_REFERENCE_NUMBER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicinalProduct_ManufacturingBusinessOperation is strict, attribute is already set: ".concat(name));
    }
  }
}
