//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ImplementationGuide_Resource}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImplementationGuide_Resource.builder()}.
 */
@org.immutables.value.Generated(from = "ImplementationGuide_Resource", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImplementationGuide_Resource implements com.fhir.ImplementationGuide_Resource {
  private final @javax.annotation.Nullable java.lang.String name;
  private final com.fhir.Reference reference;
  private final @javax.annotation.Nullable com.fhir.id groupingId;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Implementationguide_resourceFhirversionItem> fhirVersion;
  private final @javax.annotation.Nullable java.lang.String exampleCanonical;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.Boolean exampleBoolean;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableImplementationGuide_Resource(
      @javax.annotation.Nullable java.lang.String name,
      com.fhir.Reference reference,
      @javax.annotation.Nullable com.fhir.id groupingId,
      @javax.annotation.Nullable java.util.List<com.fhir.Implementationguide_resourceFhirversionItem> fhirVersion,
      @javax.annotation.Nullable java.lang.String exampleCanonical,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.Boolean exampleBoolean,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.name = name;
    this.reference = reference;
    this.groupingId = groupingId;
    this.fhirVersion = fhirVersion;
    this.exampleCanonical = exampleCanonical;
    this.id = id;
    this.description = description;
    this.extension = extension;
    this.exampleBoolean = exampleBoolean;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code reference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reference")
  @Override
  public com.fhir.Reference reference() {
    return reference;
  }

  /**
   * @return The value of the {@code groupingId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("groupingId")
  @Override
  public java.util.Optional<com.fhir.id> groupingId() {
    return java.util.Optional.ofNullable(groupingId);
  }

  /**
   * @return The value of the {@code fhirVersion} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("fhirVersion")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Implementationguide_resourceFhirversionItem>> fhirVersion() {
    return java.util.Optional.ofNullable(fhirVersion);
  }

  /**
   * @return The value of the {@code exampleCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("exampleCanonical")
  @Override
  public java.util.Optional<java.lang.String> exampleCanonical() {
    return java.util.Optional.ofNullable(exampleCanonical);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code exampleBoolean} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("exampleBoolean")
  @Override
  public java.util.Optional<java.lang.Boolean> exampleBoolean() {
    return java.util.Optional.ofNullable(exampleBoolean);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableImplementationGuide_Resource(
        newValue,
        this.reference,
        this.groupingId,
        this.fhirVersion,
        this.exampleCanonical,
        this.id,
        this.description,
        this.extension,
        this.exampleBoolean,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableImplementationGuide_Resource(
        value,
        this.reference,
        this.groupingId,
        this.fhirVersion,
        this.exampleCanonical,
        this.id,
        this.description,
        this.extension,
        this.exampleBoolean,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImplementationGuide_Resource#reference() reference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for reference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withReference(com.fhir.Reference value) {
    if (this.reference == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "reference");
    return new ImmutableImplementationGuide_Resource(
        this.name,
        newValue,
        this.groupingId,
        this.fhirVersion,
        this.exampleCanonical,
        this.id,
        this.description,
        this.extension,
        this.exampleBoolean,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#groupingId() groupingId} attribute.
   * @param value The value for groupingId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withGroupingId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "groupingId");
    if (this.groupingId == newValue) return this;
    return new ImmutableImplementationGuide_Resource(
        this.name,
        this.reference,
        newValue,
        this.fhirVersion,
        this.exampleCanonical,
        this.id,
        this.description,
        this.extension,
        this.exampleBoolean,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#groupingId() groupingId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupingId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Resource withGroupingId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.groupingId == value) return this;
    return new ImmutableImplementationGuide_Resource(
        this.name,
        this.reference,
        value,
        this.fhirVersion,
        this.exampleCanonical,
        this.id,
        this.description,
        this.extension,
        this.exampleBoolean,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#fhirVersion() fhirVersion} attribute.
   * @param value The value for fhirVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withFhirVersion(java.util.List<com.fhir.Implementationguide_resourceFhirversionItem> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Implementationguide_resourceFhirversionItem> newValue = java.util.Objects.requireNonNull(value, "fhirVersion");
    if (this.fhirVersion == newValue) return this;
    return new ImmutableImplementationGuide_Resource(
        this.name,
        this.reference,
        this.groupingId,
        newValue,
        this.exampleCanonical,
        this.id,
        this.description,
        this.extension,
        this.exampleBoolean,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#fhirVersion() fhirVersion} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fhirVersion
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Resource withFhirVersion(java.util.Optional<? extends java.util.List<com.fhir.Implementationguide_resourceFhirversionItem>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Implementationguide_resourceFhirversionItem> value = optional.orElse(null);
    if (this.fhirVersion == value) return this;
    return new ImmutableImplementationGuide_Resource(
        this.name,
        this.reference,
        this.groupingId,
        value,
        this.exampleCanonical,
        this.id,
        this.description,
        this.extension,
        this.exampleBoolean,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#exampleCanonical() exampleCanonical} attribute.
   * @param value The value for exampleCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withExampleCanonical(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "exampleCanonical");
    if (java.util.Objects.equals(this.exampleCanonical, newValue)) return this;
    return new ImmutableImplementationGuide_Resource(
        this.name,
        this.reference,
        this.groupingId,
        this.fhirVersion,
        newValue,
        this.id,
        this.description,
        this.extension,
        this.exampleBoolean,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#exampleCanonical() exampleCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exampleCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withExampleCanonical(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.exampleCanonical, value)) return this;
    return new ImmutableImplementationGuide_Resource(
        this.name,
        this.reference,
        this.groupingId,
        this.fhirVersion,
        value,
        this.id,
        this.description,
        this.extension,
        this.exampleBoolean,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableImplementationGuide_Resource(
        this.name,
        this.reference,
        this.groupingId,
        this.fhirVersion,
        this.exampleCanonical,
        newValue,
        this.description,
        this.extension,
        this.exampleBoolean,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableImplementationGuide_Resource(
        this.name,
        this.reference,
        this.groupingId,
        this.fhirVersion,
        this.exampleCanonical,
        value,
        this.description,
        this.extension,
        this.exampleBoolean,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableImplementationGuide_Resource(
        this.name,
        this.reference,
        this.groupingId,
        this.fhirVersion,
        this.exampleCanonical,
        this.id,
        newValue,
        this.extension,
        this.exampleBoolean,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableImplementationGuide_Resource(
        this.name,
        this.reference,
        this.groupingId,
        this.fhirVersion,
        this.exampleCanonical,
        this.id,
        value,
        this.extension,
        this.exampleBoolean,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImplementationGuide_Resource(
        this.name,
        this.reference,
        this.groupingId,
        this.fhirVersion,
        this.exampleCanonical,
        this.id,
        this.description,
        newValue,
        this.exampleBoolean,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Resource withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImplementationGuide_Resource(
        this.name,
        this.reference,
        this.groupingId,
        this.fhirVersion,
        this.exampleCanonical,
        this.id,
        this.description,
        value,
        this.exampleBoolean,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#exampleBoolean() exampleBoolean} attribute.
   * @param value The value for exampleBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withExampleBoolean(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.exampleBoolean, newValue)) return this;
    return new ImmutableImplementationGuide_Resource(
        this.name,
        this.reference,
        this.groupingId,
        this.fhirVersion,
        this.exampleCanonical,
        this.id,
        this.description,
        this.extension,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#exampleBoolean() exampleBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exampleBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withExampleBoolean(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.exampleBoolean, value)) return this;
    return new ImmutableImplementationGuide_Resource(
        this.name,
        this.reference,
        this.groupingId,
        this.fhirVersion,
        this.exampleCanonical,
        this.id,
        this.description,
        this.extension,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Resource#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Resource withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImplementationGuide_Resource(
        this.name,
        this.reference,
        this.groupingId,
        this.fhirVersion,
        this.exampleCanonical,
        this.id,
        this.description,
        this.extension,
        this.exampleBoolean,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Resource#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Resource withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImplementationGuide_Resource(
        this.name,
        this.reference,
        this.groupingId,
        this.fhirVersion,
        this.exampleCanonical,
        this.id,
        this.description,
        this.extension,
        this.exampleBoolean,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImplementationGuide_Resource} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImplementationGuide_Resource
        && equalTo((ImmutableImplementationGuide_Resource) another);
  }

  private boolean equalTo(ImmutableImplementationGuide_Resource another) {
    return java.util.Objects.equals(name, another.name)
        && reference.equals(another.reference)
        && java.util.Objects.equals(groupingId, another.groupingId)
        && java.util.Objects.equals(fhirVersion, another.fhirVersion)
        && java.util.Objects.equals(exampleCanonical, another.exampleCanonical)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(exampleBoolean, another.exampleBoolean)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code reference}, {@code groupingId}, {@code fhirVersion}, {@code exampleCanonical}, {@code id}, {@code description}, {@code extension}, {@code exampleBoolean}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + reference.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(groupingId);
    h += (h << 5) + java.util.Objects.hashCode(fhirVersion);
    h += (h << 5) + java.util.Objects.hashCode(exampleCanonical);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(exampleBoolean);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ImplementationGuide_Resource} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ImplementationGuide_Resource{");
    if (name != null) {
      builder.append("name=").append(name);
    }
    if (builder.length() > 29) builder.append(", ");
    builder.append("reference=").append(reference);
    if (groupingId != null) {
      builder.append(", ");
      builder.append("groupingId=").append(groupingId);
    }
    if (fhirVersion != null) {
      builder.append(", ");
      builder.append("fhirVersion=").append(fhirVersion);
    }
    if (exampleCanonical != null) {
      builder.append(", ");
      builder.append("exampleCanonical=").append(exampleCanonical);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (exampleBoolean != null) {
      builder.append(", ");
      builder.append("exampleBoolean=").append(exampleBoolean);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ImplementationGuide_Resource", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ImplementationGuide_Resource {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable com.fhir.Reference reference;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> groupingId = java.util.Optional.empty();
    boolean groupingIdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Implementationguide_resourceFhirversionItem>> fhirVersion = java.util.Optional.empty();
    boolean fhirVersionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> exampleCanonical = java.util.Optional.empty();
    boolean exampleCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> exampleBoolean = java.util.Optional.empty();
    boolean exampleBooleanIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    public void setReference(com.fhir.Reference reference) {
      this.reference = reference;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("groupingId")
    public void setGroupingId(java.util.Optional<com.fhir.id> groupingId) {
      this.groupingId = groupingId;
      this.groupingIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("fhirVersion")
    public void setFhirVersion(java.util.Optional<java.util.List<com.fhir.Implementationguide_resourceFhirversionItem>> fhirVersion) {
      this.fhirVersion = fhirVersion;
      this.fhirVersionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("exampleCanonical")
    public void setExampleCanonical(java.util.Optional<java.lang.String> exampleCanonical) {
      this.exampleCanonical = exampleCanonical;
      this.exampleCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("exampleBoolean")
    public void setExampleBoolean(java.util.Optional<java.lang.Boolean> exampleBoolean) {
      this.exampleBoolean = exampleBoolean;
      this.exampleBooleanIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference reference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> groupingId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Implementationguide_resourceFhirversionItem>> fhirVersion() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> exampleCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> exampleBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableImplementationGuide_Resource fromJson(Json json) {
    ImmutableImplementationGuide_Resource.Builder builder = ((ImmutableImplementationGuide_Resource.Builder) ImmutableImplementationGuide_Resource.builder());
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.reference != null) {
      builder.reference(json.reference);
    }
    if (json.groupingIdIsSet) {
      builder.groupingId(json.groupingId);
    }
    if (json.fhirVersionIsSet) {
      builder.fhirVersion(json.fhirVersion);
    }
    if (json.exampleCanonicalIsSet) {
      builder.exampleCanonical(json.exampleCanonical);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.exampleBooleanIsSet) {
      builder.exampleBoolean(json.exampleBoolean);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableImplementationGuide_Resource) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImplementationGuide_Resource} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImplementationGuide_Resource instance
   */
  public static ImplementationGuide_Resource copyOf(ImplementationGuide_Resource instance) {
    if (instance instanceof ImmutableImplementationGuide_Resource) {
      return (ImmutableImplementationGuide_Resource) instance;
    }
    return ((ImmutableImplementationGuide_Resource.Builder) ImmutableImplementationGuide_Resource.builder())
        .name(instance.name())
        .reference(instance.reference())
        .groupingId(instance.groupingId())
        .fhirVersion(instance.fhirVersion())
        .exampleCanonical(instance.exampleCanonical())
        .id(instance.id())
        .description(instance.description())
        .extension(instance.extension())
        .exampleBoolean(instance.exampleBoolean())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ImplementationGuide_Resource ImplementationGuide_Resource}.
   * <pre>
   * ImmutableImplementationGuide_Resource.builder()
   *    .name(String) // optional {@link ImplementationGuide_Resource#name() name}
   *    .reference(com.fhir.Reference) // required {@link ImplementationGuide_Resource#reference() reference}
   *    .groupingId(com.fhir.id) // optional {@link ImplementationGuide_Resource#groupingId() groupingId}
   *    .fhirVersion(List&amp;lt;com.fhir.Implementationguide_resourceFhirversionItem&amp;gt;) // optional {@link ImplementationGuide_Resource#fhirVersion() fhirVersion}
   *    .exampleCanonical(String) // optional {@link ImplementationGuide_Resource#exampleCanonical() exampleCanonical}
   *    .id(String) // optional {@link ImplementationGuide_Resource#id() id}
   *    .description(String) // optional {@link ImplementationGuide_Resource#description() description}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Resource#extension() extension}
   *    .exampleBoolean(Boolean) // optional {@link ImplementationGuide_Resource#exampleBoolean() exampleBoolean}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Resource#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ImplementationGuide_Resource builder
   */
  public static ReferenceBuildStage builder() {
    return new ImmutableImplementationGuide_Resource.Builder();
  }

  /**
   * Builds instances of type {@link ImplementationGuide_Resource ImplementationGuide_Resource}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ImplementationGuide_Resource", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ReferenceBuildStage, BuildFinal {
    private static final long INIT_BIT_REFERENCE = 0x1L;
    private static final long OPT_BIT_NAME = 0x1L;
    private static final long OPT_BIT_GROUPING_ID = 0x2L;
    private static final long OPT_BIT_FHIR_VERSION = 0x4L;
    private static final long OPT_BIT_EXAMPLE_CANONICAL = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_DESCRIPTION = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_EXAMPLE_BOOLEAN = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.Reference reference;
    private @javax.annotation.Nullable com.fhir.id groupingId;
    private @javax.annotation.Nullable java.util.List<com.fhir.Implementationguide_resourceFhirversionItem> fhirVersion;
    private @javax.annotation.Nullable java.lang.String exampleCanonical;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.Boolean exampleBoolean;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.lang.String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<java.lang.String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link ImplementationGuide_Resource#reference() reference} attribute.
     * @param reference The value for reference 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    public final Builder reference(com.fhir.Reference reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = java.util.Objects.requireNonNull(reference, "reference");
      initBits &= ~INIT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#groupingId() groupingId} to groupingId.
     * @param groupingId The value for groupingId
     * @return {@code this} builder for chained invocation
     */
    public final Builder groupingId(com.fhir.id groupingId) {
      checkNotIsSet(groupingIdIsSet(), "groupingId");
      this.groupingId = java.util.Objects.requireNonNull(groupingId, "groupingId");
      optBits |= OPT_BIT_GROUPING_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#groupingId() groupingId} to groupingId.
     * @param groupingId The value for groupingId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupingId")
    public final Builder groupingId(java.util.Optional<? extends com.fhir.id> groupingId) {
      checkNotIsSet(groupingIdIsSet(), "groupingId");
      this.groupingId = groupingId.orElse(null);
      optBits |= OPT_BIT_GROUPING_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for chained invocation
     */
    public final Builder fhirVersion(java.util.List<com.fhir.Implementationguide_resourceFhirversionItem> fhirVersion) {
      checkNotIsSet(fhirVersionIsSet(), "fhirVersion");
      this.fhirVersion = java.util.Objects.requireNonNull(fhirVersion, "fhirVersion");
      optBits |= OPT_BIT_FHIR_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fhirVersion")
    public final Builder fhirVersion(java.util.Optional<? extends java.util.List<com.fhir.Implementationguide_resourceFhirversionItem>> fhirVersion) {
      checkNotIsSet(fhirVersionIsSet(), "fhirVersion");
      this.fhirVersion = fhirVersion.orElse(null);
      optBits |= OPT_BIT_FHIR_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#exampleCanonical() exampleCanonical} to exampleCanonical.
     * @param exampleCanonical The value for exampleCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder exampleCanonical(java.lang.String exampleCanonical) {
      checkNotIsSet(exampleCanonicalIsSet(), "exampleCanonical");
      this.exampleCanonical = java.util.Objects.requireNonNull(exampleCanonical, "exampleCanonical");
      optBits |= OPT_BIT_EXAMPLE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#exampleCanonical() exampleCanonical} to exampleCanonical.
     * @param exampleCanonical The value for exampleCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exampleCanonical")
    public final Builder exampleCanonical(java.util.Optional<java.lang.String> exampleCanonical) {
      checkNotIsSet(exampleCanonicalIsSet(), "exampleCanonical");
      this.exampleCanonical = exampleCanonical.orElse(null);
      optBits |= OPT_BIT_EXAMPLE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Resource#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Resource#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_Resource#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_Resource#exampleBoolean() exampleBoolean} to exampleBoolean.
     * @param exampleBoolean The value for exampleBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder exampleBoolean(boolean exampleBoolean) {
      checkNotIsSet(exampleBooleanIsSet(), "exampleBoolean");
      this.exampleBoolean = exampleBoolean;
      optBits |= OPT_BIT_EXAMPLE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#exampleBoolean() exampleBoolean} to exampleBoolean.
     * @param exampleBoolean The value for exampleBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exampleBoolean")
    public final Builder exampleBoolean(java.util.Optional<java.lang.Boolean> exampleBoolean) {
      checkNotIsSet(exampleBooleanIsSet(), "exampleBoolean");
      this.exampleBoolean = exampleBoolean.orElse(null);
      optBits |= OPT_BIT_EXAMPLE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide_Resource#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ImplementationGuide_Resource ImplementationGuide_Resource}.
     * @return An immutable instance of ImplementationGuide_Resource
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ImplementationGuide_Resource build() {
      checkRequiredAttributes();
      return new ImmutableImplementationGuide_Resource(
          name,
          reference,
          groupingId,
          fhirVersion,
          exampleCanonical,
          id,
          description,
          extension,
          exampleBoolean,
          modifierExtension);
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean groupingIdIsSet() {
      return (optBits & OPT_BIT_GROUPING_ID) != 0;
    }

    private boolean fhirVersionIsSet() {
      return (optBits & OPT_BIT_FHIR_VERSION) != 0;
    }

    private boolean exampleCanonicalIsSet() {
      return (optBits & OPT_BIT_EXAMPLE_CANONICAL) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean exampleBooleanIsSet() {
      return (optBits & OPT_BIT_EXAMPLE_BOOLEAN) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean referenceIsSet() {
      return (initBits & INIT_BIT_REFERENCE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ImplementationGuide_Resource is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!referenceIsSet()) attributes.add("reference");
      return "Cannot build ImplementationGuide_Resource, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ImplementationGuide_Resource", generator = "Immutables")
  public interface ReferenceBuildStage {
    /**
     * Initializes the value for the {@link ImplementationGuide_Resource#reference() reference} attribute.
     * @param reference The value for reference 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reference(com.fhir.Reference reference);
  }

  @org.immutables.value.Generated(from = "ImplementationGuide_Resource", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#groupingId() groupingId} to groupingId.
     * @param groupingId The value for groupingId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal groupingId(com.fhir.id groupingId);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#groupingId() groupingId} to groupingId.
     * @param groupingId The value for groupingId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal groupingId(java.util.Optional<? extends com.fhir.id> groupingId);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fhirVersion(java.util.List<com.fhir.Implementationguide_resourceFhirversionItem> fhirVersion);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fhirVersion(java.util.Optional<? extends java.util.List<com.fhir.Implementationguide_resourceFhirversionItem>> fhirVersion);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#exampleCanonical() exampleCanonical} to exampleCanonical.
     * @param exampleCanonical The value for exampleCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exampleCanonical(java.lang.String exampleCanonical);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#exampleCanonical() exampleCanonical} to exampleCanonical.
     * @param exampleCanonical The value for exampleCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exampleCanonical(java.util.Optional<java.lang.String> exampleCanonical);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#exampleBoolean() exampleBoolean} to exampleBoolean.
     * @param exampleBoolean The value for exampleBoolean
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exampleBoolean(boolean exampleBoolean);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#exampleBoolean() exampleBoolean} to exampleBoolean.
     * @param exampleBoolean The value for exampleBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exampleBoolean(java.util.Optional<java.lang.Boolean> exampleBoolean);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImplementationGuide_Resource#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Builds a new {@link ImplementationGuide_Resource ImplementationGuide_Resource}.
     * @return An immutable instance of ImplementationGuide_Resource
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImplementationGuide_Resource build();
  }
}
