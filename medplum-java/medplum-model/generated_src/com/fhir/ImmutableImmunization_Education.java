//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Immunization_Education}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImmunization_Education.builder()}.
 */
@org.immutables.value.Generated(from = "Immunization_Education", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImmunization_Education implements com.fhir.Immunization_Education {
  private final @javax.annotation.Nullable com.fhir.uri reference;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.dateTime presentationDate;
  private final @javax.annotation.Nullable java.lang.String documentType;
  private final @javax.annotation.Nullable com.fhir.dateTime publicationDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableImmunization_Education(
      @javax.annotation.Nullable com.fhir.uri reference,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.dateTime presentationDate,
      @javax.annotation.Nullable java.lang.String documentType,
      @javax.annotation.Nullable com.fhir.dateTime publicationDate,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.reference = reference;
    this.id = id;
    this.extension = extension;
    this.presentationDate = presentationDate;
    this.documentType = documentType;
    this.publicationDate = publicationDate;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code reference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reference")
  @Override
  public java.util.Optional<com.fhir.uri> reference() {
    return java.util.Optional.ofNullable(reference);
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
   * @return The value of the {@code presentationDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("presentationDate")
  @Override
  public java.util.Optional<com.fhir.dateTime> presentationDate() {
    return java.util.Optional.ofNullable(presentationDate);
  }

  /**
   * @return The value of the {@code documentType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("documentType")
  @Override
  public java.util.Optional<java.lang.String> documentType() {
    return java.util.Optional.ofNullable(documentType);
  }

  /**
   * @return The value of the {@code publicationDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("publicationDate")
  @Override
  public java.util.Optional<com.fhir.dateTime> publicationDate() {
    return java.util.Optional.ofNullable(publicationDate);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Education#reference() reference} attribute.
   * @param value The value for reference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withReference(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "reference");
    if (this.reference == newValue) return this;
    return new ImmutableImmunization_Education(
        newValue,
        this.id,
        this.extension,
        this.presentationDate,
        this.documentType,
        this.publicationDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Education#reference() reference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_Education withReference(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.reference == value) return this;
    return new ImmutableImmunization_Education(
        value,
        this.id,
        this.extension,
        this.presentationDate,
        this.documentType,
        this.publicationDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Education#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        newValue,
        this.extension,
        this.presentationDate,
        this.documentType,
        this.publicationDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Education#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        value,
        this.extension,
        this.presentationDate,
        this.documentType,
        this.publicationDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Education#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.id,
        newValue,
        this.presentationDate,
        this.documentType,
        this.publicationDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Education#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_Education withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.id,
        value,
        this.presentationDate,
        this.documentType,
        this.publicationDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Education#presentationDate() presentationDate} attribute.
   * @param value The value for presentationDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withPresentationDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "presentationDate");
    if (this.presentationDate == newValue) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.id,
        this.extension,
        newValue,
        this.documentType,
        this.publicationDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Education#presentationDate() presentationDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for presentationDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_Education withPresentationDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.presentationDate == value) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.id,
        this.extension,
        value,
        this.documentType,
        this.publicationDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Education#documentType() documentType} attribute.
   * @param value The value for documentType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withDocumentType(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "documentType");
    if (java.util.Objects.equals(this.documentType, newValue)) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.id,
        this.extension,
        this.presentationDate,
        newValue,
        this.publicationDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Education#documentType() documentType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withDocumentType(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.documentType, value)) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.id,
        this.extension,
        this.presentationDate,
        value,
        this.publicationDate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Education#publicationDate() publicationDate} attribute.
   * @param value The value for publicationDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withPublicationDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "publicationDate");
    if (this.publicationDate == newValue) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.id,
        this.extension,
        this.presentationDate,
        this.documentType,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Education#publicationDate() publicationDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publicationDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_Education withPublicationDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.publicationDate == value) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.id,
        this.extension,
        this.presentationDate,
        this.documentType,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Education#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.id,
        this.extension,
        this.presentationDate,
        this.documentType,
        this.publicationDate,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Education#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_Education withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.id,
        this.extension,
        this.presentationDate,
        this.documentType,
        this.publicationDate,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImmunization_Education} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImmunization_Education
        && equalTo((ImmutableImmunization_Education) another);
  }

  private boolean equalTo(ImmutableImmunization_Education another) {
    return java.util.Objects.equals(reference, another.reference)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(presentationDate, another.presentationDate)
        && java.util.Objects.equals(documentType, another.documentType)
        && java.util.Objects.equals(publicationDate, another.publicationDate)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code reference}, {@code id}, {@code extension}, {@code presentationDate}, {@code documentType}, {@code publicationDate}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(reference);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(presentationDate);
    h += (h << 5) + java.util.Objects.hashCode(documentType);
    h += (h << 5) + java.util.Objects.hashCode(publicationDate);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Immunization_Education} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Immunization_Education{");
    if (reference != null) {
      builder.append("reference=").append(reference);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (presentationDate != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("presentationDate=").append(presentationDate);
    }
    if (documentType != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("documentType=").append(documentType);
    }
    if (publicationDate != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("publicationDate=").append(publicationDate);
    }
    if (modifierExtension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Immunization_Education", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Immunization_Education {
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> reference = java.util.Optional.empty();
    boolean referenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> presentationDate = java.util.Optional.empty();
    boolean presentationDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> documentType = java.util.Optional.empty();
    boolean documentTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> publicationDate = java.util.Optional.empty();
    boolean publicationDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    public void setReference(java.util.Optional<com.fhir.uri> reference) {
      this.reference = reference;
      this.referenceIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("presentationDate")
    public void setPresentationDate(java.util.Optional<com.fhir.dateTime> presentationDate) {
      this.presentationDate = presentationDate;
      this.presentationDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("documentType")
    public void setDocumentType(java.util.Optional<java.lang.String> documentType) {
      this.documentType = documentType;
      this.documentTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publicationDate")
    public void setPublicationDate(java.util.Optional<com.fhir.dateTime> publicationDate) {
      this.publicationDate = publicationDate;
      this.publicationDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.uri> reference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> presentationDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> documentType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> publicationDate() { throw new UnsupportedOperationException(); }
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
  static ImmutableImmunization_Education fromJson(Json json) {
    ImmutableImmunization_Education.Builder builder = ImmutableImmunization_Education.builder();
    if (json.referenceIsSet) {
      builder.reference(json.reference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.presentationDateIsSet) {
      builder.presentationDate(json.presentationDate);
    }
    if (json.documentTypeIsSet) {
      builder.documentType(json.documentType);
    }
    if (json.publicationDateIsSet) {
      builder.publicationDate(json.publicationDate);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableImmunization_Education) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Immunization_Education} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Immunization_Education instance
   */
  public static Immunization_Education copyOf(Immunization_Education instance) {
    if (instance instanceof ImmutableImmunization_Education) {
      return (ImmutableImmunization_Education) instance;
    }
    return ImmutableImmunization_Education.builder()
        .reference(instance.reference())
        .id(instance.id())
        .extension(instance.extension())
        .presentationDate(instance.presentationDate())
        .documentType(instance.documentType())
        .publicationDate(instance.publicationDate())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Immunization_Education Immunization_Education}.
   * <pre>
   * ImmutableImmunization_Education.builder()
   *    .reference(com.fhir.uri) // optional {@link Immunization_Education#reference() reference}
   *    .id(String) // optional {@link Immunization_Education#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Immunization_Education#extension() extension}
   *    .presentationDate(com.fhir.dateTime) // optional {@link Immunization_Education#presentationDate() presentationDate}
   *    .documentType(String) // optional {@link Immunization_Education#documentType() documentType}
   *    .publicationDate(com.fhir.dateTime) // optional {@link Immunization_Education#publicationDate() publicationDate}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Immunization_Education#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new Immunization_Education builder
   */
  public static ImmutableImmunization_Education.Builder builder() {
    return new ImmutableImmunization_Education.Builder();
  }

  /**
   * Builds instances of type {@link Immunization_Education Immunization_Education}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Immunization_Education", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_REFERENCE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_PRESENTATION_DATE = 0x8L;
    private static final long OPT_BIT_DOCUMENT_TYPE = 0x10L;
    private static final long OPT_BIT_PUBLICATION_DATE = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.uri reference;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.dateTime presentationDate;
    private @javax.annotation.Nullable java.lang.String documentType;
    private @javax.annotation.Nullable com.fhir.dateTime publicationDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Immunization_Education#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reference(com.fhir.uri reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = java.util.Objects.requireNonNull(reference, "reference");
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    public final Builder reference(java.util.Optional<? extends com.fhir.uri> reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = reference.orElse(null);
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#id() id} to id.
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
     * Initializes the optional value {@link Immunization_Education#id() id} to id.
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
     * Initializes the optional value {@link Immunization_Education#extension() extension} to extension.
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
     * Initializes the optional value {@link Immunization_Education#extension() extension} to extension.
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
     * Initializes the optional value {@link Immunization_Education#presentationDate() presentationDate} to presentationDate.
     * @param presentationDate The value for presentationDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder presentationDate(com.fhir.dateTime presentationDate) {
      checkNotIsSet(presentationDateIsSet(), "presentationDate");
      this.presentationDate = java.util.Objects.requireNonNull(presentationDate, "presentationDate");
      optBits |= OPT_BIT_PRESENTATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#presentationDate() presentationDate} to presentationDate.
     * @param presentationDate The value for presentationDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("presentationDate")
    public final Builder presentationDate(java.util.Optional<? extends com.fhir.dateTime> presentationDate) {
      checkNotIsSet(presentationDateIsSet(), "presentationDate");
      this.presentationDate = presentationDate.orElse(null);
      optBits |= OPT_BIT_PRESENTATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#documentType() documentType} to documentType.
     * @param documentType The value for documentType
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentType(java.lang.String documentType) {
      checkNotIsSet(documentTypeIsSet(), "documentType");
      this.documentType = java.util.Objects.requireNonNull(documentType, "documentType");
      optBits |= OPT_BIT_DOCUMENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#documentType() documentType} to documentType.
     * @param documentType The value for documentType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("documentType")
    public final Builder documentType(java.util.Optional<java.lang.String> documentType) {
      checkNotIsSet(documentTypeIsSet(), "documentType");
      this.documentType = documentType.orElse(null);
      optBits |= OPT_BIT_DOCUMENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#publicationDate() publicationDate} to publicationDate.
     * @param publicationDate The value for publicationDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder publicationDate(com.fhir.dateTime publicationDate) {
      checkNotIsSet(publicationDateIsSet(), "publicationDate");
      this.publicationDate = java.util.Objects.requireNonNull(publicationDate, "publicationDate");
      optBits |= OPT_BIT_PUBLICATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#publicationDate() publicationDate} to publicationDate.
     * @param publicationDate The value for publicationDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publicationDate")
    public final Builder publicationDate(java.util.Optional<? extends com.fhir.dateTime> publicationDate) {
      checkNotIsSet(publicationDateIsSet(), "publicationDate");
      this.publicationDate = publicationDate.orElse(null);
      optBits |= OPT_BIT_PUBLICATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Immunization_Education#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link Immunization_Education Immunization_Education}.
     * @return An immutable instance of Immunization_Education
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Immunization_Education build() {
      return new ImmutableImmunization_Education(reference, id, extension, presentationDate, documentType, publicationDate, modifierExtension);
    }

    private boolean referenceIsSet() {
      return (optBits & OPT_BIT_REFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean presentationDateIsSet() {
      return (optBits & OPT_BIT_PRESENTATION_DATE) != 0;
    }

    private boolean documentTypeIsSet() {
      return (optBits & OPT_BIT_DOCUMENT_TYPE) != 0;
    }

    private boolean publicationDateIsSet() {
      return (optBits & OPT_BIT_PUBLICATION_DATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Immunization_Education is strict, attribute is already set: ".concat(name));
    }
  }
}
