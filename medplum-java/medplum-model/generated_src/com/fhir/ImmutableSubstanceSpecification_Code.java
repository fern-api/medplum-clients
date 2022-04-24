//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link SubstanceSpecification_Code}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSpecification_Code.builder()}.
 */
@org.immutables.value.Generated(from = "SubstanceSpecification_Code", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSpecification_Code implements com.fhir.SubstanceSpecification_Code {
  private final @javax.annotation.Nullable java.lang.String comment;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> source;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.dateTime statusDate;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

  private ImmutableSubstanceSpecification_Code(
      @javax.annotation.Nullable java.lang.String comment,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> source,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable com.fhir.CodeableConcept status,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.dateTime statusDate,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension) {
    this.comment = comment;
    this.source = source;
    this.code = code;
    this.status = status;
    this.modifierExtension = modifierExtension;
    this.statusDate = statusDate;
    this.id = id;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("comment")
  @Override
  public java.util.Optional<java.lang.String> comment() {
    return java.util.Optional.ofNullable(comment);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("source")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> source() {
    return java.util.Optional.ofNullable(source);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code statusDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusDate")
  @Override
  public java.util.Optional<com.fhir.dateTime> statusDate() {
    return java.util.Optional.ofNullable(statusDate);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Code#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Code withComment(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "comment");
    if (java.util.Objects.equals(this.comment, newValue)) return this;
    return new ImmutableSubstanceSpecification_Code(
        newValue,
        this.source,
        this.code,
        this.status,
        this.modifierExtension,
        this.statusDate,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Code#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Code withComment(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.comment, value)) return this;
    return new ImmutableSubstanceSpecification_Code(
        value,
        this.source,
        this.code,
        this.status,
        this.modifierExtension,
        this.statusDate,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Code#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Code withSource(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableSubstanceSpecification_Code(
        this.comment,
        newValue,
        this.code,
        this.status,
        this.modifierExtension,
        this.statusDate,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Code#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Code withSource(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableSubstanceSpecification_Code(
        this.comment,
        value,
        this.code,
        this.status,
        this.modifierExtension,
        this.statusDate,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Code#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Code withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableSubstanceSpecification_Code(
        this.comment,
        this.source,
        newValue,
        this.status,
        this.modifierExtension,
        this.statusDate,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Code#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Code withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableSubstanceSpecification_Code(
        this.comment,
        this.source,
        value,
        this.status,
        this.modifierExtension,
        this.statusDate,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Code#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Code withStatus(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSubstanceSpecification_Code(
        this.comment,
        this.source,
        this.code,
        newValue,
        this.modifierExtension,
        this.statusDate,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Code#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Code withStatus(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSubstanceSpecification_Code(
        this.comment,
        this.source,
        this.code,
        value,
        this.modifierExtension,
        this.statusDate,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Code#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Code withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSpecification_Code(
        this.comment,
        this.source,
        this.code,
        this.status,
        newValue,
        this.statusDate,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Code#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Code withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSpecification_Code(
        this.comment,
        this.source,
        this.code,
        this.status,
        value,
        this.statusDate,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Code#statusDate() statusDate} attribute.
   * @param value The value for statusDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Code withStatusDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "statusDate");
    if (this.statusDate == newValue) return this;
    return new ImmutableSubstanceSpecification_Code(
        this.comment,
        this.source,
        this.code,
        this.status,
        this.modifierExtension,
        newValue,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Code#statusDate() statusDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Code withStatusDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.statusDate == value) return this;
    return new ImmutableSubstanceSpecification_Code(
        this.comment,
        this.source,
        this.code,
        this.status,
        this.modifierExtension,
        value,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Code#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Code withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceSpecification_Code(
        this.comment,
        this.source,
        this.code,
        this.status,
        this.modifierExtension,
        this.statusDate,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Code#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Code withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceSpecification_Code(
        this.comment,
        this.source,
        this.code,
        this.status,
        this.modifierExtension,
        this.statusDate,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Code#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Code withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSpecification_Code(
        this.comment,
        this.source,
        this.code,
        this.status,
        this.modifierExtension,
        this.statusDate,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Code#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Code withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSpecification_Code(
        this.comment,
        this.source,
        this.code,
        this.status,
        this.modifierExtension,
        this.statusDate,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSpecification_Code} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSpecification_Code
        && equalTo((ImmutableSubstanceSpecification_Code) another);
  }

  private boolean equalTo(ImmutableSubstanceSpecification_Code another) {
    return java.util.Objects.equals(comment, another.comment)
        && java.util.Objects.equals(source, another.source)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(statusDate, another.statusDate)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code comment}, {@code source}, {@code code}, {@code status}, {@code modifierExtension}, {@code statusDate}, {@code id}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(comment);
    h += (h << 5) + java.util.Objects.hashCode(source);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(statusDate);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSpecification_Code} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("SubstanceSpecification_Code{");
    if (comment != null) {
      builder.append("comment=").append(comment);
    }
    if (source != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (code != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (status != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (modifierExtension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (statusDate != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("statusDate=").append(statusDate);
    }
    if (id != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "SubstanceSpecification_Code", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.SubstanceSpecification_Code {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> comment = java.util.Optional.empty();
    boolean commentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> source = java.util.Optional.empty();
    boolean sourceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> statusDate = java.util.Optional.empty();
    boolean statusDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public void setComment(java.util.Optional<java.lang.String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public void setSource(java.util.Optional<java.util.List<com.fhir.Reference>> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.CodeableConcept> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusDate")
    public void setStatusDate(java.util.Optional<com.fhir.dateTime> statusDate) {
      this.statusDate = statusDate;
      this.statusDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> source() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> statusDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSpecification_Code fromJson(Json json) {
    ImmutableSubstanceSpecification_Code.Builder builder = ImmutableSubstanceSpecification_Code.builder();
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.statusDateIsSet) {
      builder.statusDate(json.statusDate);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableSubstanceSpecification_Code) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSpecification_Code} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSpecification_Code instance
   */
  public static SubstanceSpecification_Code copyOf(SubstanceSpecification_Code instance) {
    if (instance instanceof ImmutableSubstanceSpecification_Code) {
      return (ImmutableSubstanceSpecification_Code) instance;
    }
    return ImmutableSubstanceSpecification_Code.builder()
        .comment(instance.comment())
        .source(instance.source())
        .code(instance.code())
        .status(instance.status())
        .modifierExtension(instance.modifierExtension())
        .statusDate(instance.statusDate())
        .id(instance.id())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSpecification_Code SubstanceSpecification_Code}.
   * <pre>
   * ImmutableSubstanceSpecification_Code.builder()
   *    .comment(String) // optional {@link SubstanceSpecification_Code#comment() comment}
   *    .source(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link SubstanceSpecification_Code#source() source}
   *    .code(com.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Code#code() code}
   *    .status(com.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Code#status() status}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Code#modifierExtension() modifierExtension}
   *    .statusDate(com.fhir.dateTime) // optional {@link SubstanceSpecification_Code#statusDate() statusDate}
   *    .id(String) // optional {@link SubstanceSpecification_Code#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Code#extension() extension}
   *    .build();
   * </pre>
   * @return A new SubstanceSpecification_Code builder
   */
  public static ImmutableSubstanceSpecification_Code.Builder builder() {
    return new ImmutableSubstanceSpecification_Code.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSpecification_Code SubstanceSpecification_Code}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "SubstanceSpecification_Code", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_COMMENT = 0x1L;
    private static final long OPT_BIT_SOURCE = 0x2L;
    private static final long OPT_BIT_CODE = 0x4L;
    private static final long OPT_BIT_STATUS = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_STATUS_DATE = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String comment;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> source;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable com.fhir.CodeableConcept status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.dateTime statusDate;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Code#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(java.lang.String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = java.util.Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Code#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public final Builder comment(java.util.Optional<java.lang.String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Code#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(java.util.List<com.fhir.Reference> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = java.util.Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Code#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public final Builder source(java.util.Optional<? extends java.util.List<com.fhir.Reference>> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Code#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Code#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Code#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.CodeableConcept status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Code#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.CodeableConcept> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Code#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Code#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Code#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusDate(com.fhir.dateTime statusDate) {
      checkNotIsSet(statusDateIsSet(), "statusDate");
      this.statusDate = java.util.Objects.requireNonNull(statusDate, "statusDate");
      optBits |= OPT_BIT_STATUS_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Code#statusDate() statusDate} to statusDate.
     * @param statusDate The value for statusDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusDate")
    public final Builder statusDate(java.util.Optional<? extends com.fhir.dateTime> statusDate) {
      checkNotIsSet(statusDateIsSet(), "statusDate");
      this.statusDate = statusDate.orElse(null);
      optBits |= OPT_BIT_STATUS_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Code#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_Code#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_Code#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Code#extension() extension} to extension.
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
     * Builds a new {@link SubstanceSpecification_Code SubstanceSpecification_Code}.
     * @return An immutable instance of SubstanceSpecification_Code
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.SubstanceSpecification_Code build() {
      return new ImmutableSubstanceSpecification_Code(comment, source, code, status, modifierExtension, statusDate, id, extension);
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusDateIsSet() {
      return (optBits & OPT_BIT_STATUS_DATE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of SubstanceSpecification_Code is strict, attribute is already set: ".concat(name));
    }
  }
}
