package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Immunization_Education}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImmunization_Education.builder()}.
 */
@Generated(from = "Immunization_Education", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImmunization_Education implements Immunization_Education {
  private final @Nullable Uri reference;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable DateTime publicationDate;
  private final @Nullable List<Extension> extension;
  private final @Nullable DateTime presentationDate;
  private final @Nullable String documentType;
  private final @Nullable String id;

  private ImmutableImmunization_Education(
      @Nullable Uri reference,
      @Nullable List<Extension> modifierExtension,
      @Nullable DateTime publicationDate,
      @Nullable List<Extension> extension,
      @Nullable DateTime presentationDate,
      @Nullable String documentType,
      @Nullable String id) {
    this.reference = reference;
    this.modifierExtension = modifierExtension;
    this.publicationDate = publicationDate;
    this.extension = extension;
    this.presentationDate = presentationDate;
    this.documentType = documentType;
    this.id = id;
  }

  /**
   * @return The value of the {@code reference} attribute
   */
  @JsonProperty("reference")
  @Override
  public Optional<Uri> reference() {
    return Optional.ofNullable(reference);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code publicationDate} attribute
   */
  @JsonProperty("publicationDate")
  @Override
  public Optional<DateTime> publicationDate() {
    return Optional.ofNullable(publicationDate);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code presentationDate} attribute
   */
  @JsonProperty("presentationDate")
  @Override
  public Optional<DateTime> presentationDate() {
    return Optional.ofNullable(presentationDate);
  }

  /**
   * @return The value of the {@code documentType} attribute
   */
  @JsonProperty("documentType")
  @Override
  public Optional<String> documentType() {
    return Optional.ofNullable(documentType);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Education#reference() reference} attribute.
   * @param value The value for reference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withReference(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "reference");
    if (this.reference == newValue) return this;
    return new ImmutableImmunization_Education(
        newValue,
        this.modifierExtension,
        this.publicationDate,
        this.extension,
        this.presentationDate,
        this.documentType,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Education#reference() reference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_Education withReference(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.reference == value) return this;
    return new ImmutableImmunization_Education(
        value,
        this.modifierExtension,
        this.publicationDate,
        this.extension,
        this.presentationDate,
        this.documentType,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Education#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        newValue,
        this.publicationDate,
        this.extension,
        this.presentationDate,
        this.documentType,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Education#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_Education withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        value,
        this.publicationDate,
        this.extension,
        this.presentationDate,
        this.documentType,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Education#publicationDate() publicationDate} attribute.
   * @param value The value for publicationDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withPublicationDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "publicationDate");
    if (this.publicationDate == newValue) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.modifierExtension,
        newValue,
        this.extension,
        this.presentationDate,
        this.documentType,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Education#publicationDate() publicationDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publicationDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_Education withPublicationDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.publicationDate == value) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.modifierExtension,
        value,
        this.extension,
        this.presentationDate,
        this.documentType,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Education#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.modifierExtension,
        this.publicationDate,
        newValue,
        this.presentationDate,
        this.documentType,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Education#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_Education withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.modifierExtension,
        this.publicationDate,
        value,
        this.presentationDate,
        this.documentType,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Education#presentationDate() presentationDate} attribute.
   * @param value The value for presentationDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withPresentationDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "presentationDate");
    if (this.presentationDate == newValue) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.modifierExtension,
        this.publicationDate,
        this.extension,
        newValue,
        this.documentType,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Education#presentationDate() presentationDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for presentationDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_Education withPresentationDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.presentationDate == value) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.modifierExtension,
        this.publicationDate,
        this.extension,
        value,
        this.documentType,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Education#documentType() documentType} attribute.
   * @param value The value for documentType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withDocumentType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "documentType");
    if (Objects.equals(this.documentType, newValue)) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.modifierExtension,
        this.publicationDate,
        this.extension,
        this.presentationDate,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Education#documentType() documentType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withDocumentType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.documentType, value)) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.modifierExtension,
        this.publicationDate,
        this.extension,
        this.presentationDate,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_Education#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.modifierExtension,
        this.publicationDate,
        this.extension,
        this.presentationDate,
        this.documentType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_Education#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_Education withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImmunization_Education(
        this.reference,
        this.modifierExtension,
        this.publicationDate,
        this.extension,
        this.presentationDate,
        this.documentType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImmunization_Education} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImmunization_Education
        && equalTo((ImmutableImmunization_Education) another);
  }

  private boolean equalTo(ImmutableImmunization_Education another) {
    return Objects.equals(reference, another.reference)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(publicationDate, another.publicationDate)
        && Objects.equals(extension, another.extension)
        && Objects.equals(presentationDate, another.presentationDate)
        && Objects.equals(documentType, another.documentType)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code reference}, {@code modifierExtension}, {@code publicationDate}, {@code extension}, {@code presentationDate}, {@code documentType}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(reference);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(publicationDate);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(presentationDate);
    h += (h << 5) + Objects.hashCode(documentType);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Immunization_Education} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Immunization_Education{");
    if (reference != null) {
      builder.append("reference=").append(reference);
    }
    if (modifierExtension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (publicationDate != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("publicationDate=").append(publicationDate);
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
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Immunization_Education", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Immunization_Education {
    @Nullable Optional<Uri> reference = Optional.empty();
    boolean referenceIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<DateTime> publicationDate = Optional.empty();
    boolean publicationDateIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<DateTime> presentationDate = Optional.empty();
    boolean presentationDateIsSet;
    @Nullable Optional<String> documentType = Optional.empty();
    boolean documentTypeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("reference")
    public void setReference(Optional<Uri> reference) {
      this.reference = reference;
      this.referenceIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("publicationDate")
    public void setPublicationDate(Optional<DateTime> publicationDate) {
      this.publicationDate = publicationDate;
      this.publicationDateIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("presentationDate")
    public void setPresentationDate(Optional<DateTime> presentationDate) {
      this.presentationDate = presentationDate;
      this.presentationDateIsSet = true;
    }
    @JsonProperty("documentType")
    public void setDocumentType(Optional<String> documentType) {
      this.documentType = documentType;
      this.documentTypeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<Uri> reference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> publicationDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> presentationDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> documentType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImmunization_Education fromJson(Json json) {
    ImmutableImmunization_Education.Builder builder = ImmutableImmunization_Education.builder();
    if (json.referenceIsSet) {
      builder.reference(json.reference);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.publicationDateIsSet) {
      builder.publicationDate(json.publicationDate);
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
    if (json.idIsSet) {
      builder.id(json.id);
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
        .modifierExtension(instance.modifierExtension())
        .publicationDate(instance.publicationDate())
        .extension(instance.extension())
        .presentationDate(instance.presentationDate())
        .documentType(instance.documentType())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Immunization_Education Immunization_Education}.
   * <pre>
   * ImmutableImmunization_Education.builder()
   *    .reference(com.medplum.types.fhir.Uri) // optional {@link Immunization_Education#reference() reference}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Immunization_Education#modifierExtension() modifierExtension}
   *    .publicationDate(com.medplum.types.fhir.DateTime) // optional {@link Immunization_Education#publicationDate() publicationDate}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Immunization_Education#extension() extension}
   *    .presentationDate(com.medplum.types.fhir.DateTime) // optional {@link Immunization_Education#presentationDate() presentationDate}
   *    .documentType(String) // optional {@link Immunization_Education#documentType() documentType}
   *    .id(String) // optional {@link Immunization_Education#id() id}
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
  @Generated(from = "Immunization_Education", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_REFERENCE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_PUBLICATION_DATE = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_PRESENTATION_DATE = 0x10L;
    private static final long OPT_BIT_DOCUMENT_TYPE = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private long optBits;

    private @Nullable Uri reference;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable DateTime publicationDate;
    private @Nullable List<Extension> extension;
    private @Nullable DateTime presentationDate;
    private @Nullable String documentType;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Immunization_Education#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reference(Uri reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = Objects.requireNonNull(reference, "reference");
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reference")
    public final Builder reference(Optional<? extends Uri> reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = reference.orElse(null);
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#publicationDate() publicationDate} to publicationDate.
     * @param publicationDate The value for publicationDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder publicationDate(DateTime publicationDate) {
      checkNotIsSet(publicationDateIsSet(), "publicationDate");
      this.publicationDate = Objects.requireNonNull(publicationDate, "publicationDate");
      optBits |= OPT_BIT_PUBLICATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#publicationDate() publicationDate} to publicationDate.
     * @param publicationDate The value for publicationDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("publicationDate")
    public final Builder publicationDate(Optional<? extends DateTime> publicationDate) {
      checkNotIsSet(publicationDateIsSet(), "publicationDate");
      this.publicationDate = publicationDate.orElse(null);
      optBits |= OPT_BIT_PUBLICATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
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
    public final Builder presentationDate(DateTime presentationDate) {
      checkNotIsSet(presentationDateIsSet(), "presentationDate");
      this.presentationDate = Objects.requireNonNull(presentationDate, "presentationDate");
      optBits |= OPT_BIT_PRESENTATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#presentationDate() presentationDate} to presentationDate.
     * @param presentationDate The value for presentationDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("presentationDate")
    public final Builder presentationDate(Optional<? extends DateTime> presentationDate) {
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
    public final Builder documentType(String documentType) {
      checkNotIsSet(documentTypeIsSet(), "documentType");
      this.documentType = Objects.requireNonNull(documentType, "documentType");
      optBits |= OPT_BIT_DOCUMENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#documentType() documentType} to documentType.
     * @param documentType The value for documentType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("documentType")
    public final Builder documentType(Optional<String> documentType) {
      checkNotIsSet(documentTypeIsSet(), "documentType");
      this.documentType = documentType.orElse(null);
      optBits |= OPT_BIT_DOCUMENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_Education#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Builds a new {@link Immunization_Education Immunization_Education}.
     * @return An immutable instance of Immunization_Education
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Immunization_Education build() {
      return new ImmutableImmunization_Education(reference, modifierExtension, publicationDate, extension, presentationDate, documentType, id);
    }

    private boolean referenceIsSet() {
      return (optBits & OPT_BIT_REFERENCE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean publicationDateIsSet() {
      return (optBits & OPT_BIT_PUBLICATION_DATE) != 0;
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

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Immunization_Education is strict, attribute is already set: ".concat(name));
    }
  }
}
