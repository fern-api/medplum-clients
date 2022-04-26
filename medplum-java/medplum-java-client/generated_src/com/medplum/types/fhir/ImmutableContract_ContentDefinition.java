package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Contract_ContentDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContract_ContentDefinition.builder()}.
 */
@Generated(from = "Contract_ContentDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContract_ContentDefinition
    implements Contract_ContentDefinition {
  private final @Nullable DateTime publicationDate;
  private final @Nullable CodeableConcept subType;
  private final @Nullable List<Extension> extension;
  private final CodeableConcept type;
  private final @Nullable Reference publisher;
  private final @Nullable Markdown copyright;
  private final @Nullable Code publicationStatus;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableContract_ContentDefinition(
      @Nullable DateTime publicationDate,
      @Nullable CodeableConcept subType,
      @Nullable List<Extension> extension,
      CodeableConcept type,
      @Nullable Reference publisher,
      @Nullable Markdown copyright,
      @Nullable Code publicationStatus,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension) {
    this.publicationDate = publicationDate;
    this.subType = subType;
    this.extension = extension;
    this.type = type;
    this.publisher = publisher;
    this.copyright = copyright;
    this.publicationStatus = publicationStatus;
    this.id = id;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code subType} attribute
   */
  @JsonProperty("subType")
  @Override
  public Optional<CodeableConcept> subType() {
    return Optional.ofNullable(subType);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
  }

  /**
   * @return The value of the {@code publisher} attribute
   */
  @JsonProperty("publisher")
  @Override
  public Optional<Reference> publisher() {
    return Optional.ofNullable(publisher);
  }

  /**
   * @return The value of the {@code copyright} attribute
   */
  @JsonProperty("copyright")
  @Override
  public Optional<Markdown> copyright() {
    return Optional.ofNullable(copyright);
  }

  /**
   * @return The value of the {@code publicationStatus} attribute
   */
  @JsonProperty("publicationStatus")
  @Override
  public Optional<Code> publicationStatus() {
    return Optional.ofNullable(publicationStatus);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ContentDefinition#publicationDate() publicationDate} attribute.
   * @param value The value for publicationDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ContentDefinition withPublicationDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "publicationDate");
    if (this.publicationDate == newValue) return this;
    return new ImmutableContract_ContentDefinition(
        newValue,
        this.subType,
        this.extension,
        this.type,
        this.publisher,
        this.copyright,
        this.publicationStatus,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ContentDefinition#publicationDate() publicationDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publicationDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ContentDefinition withPublicationDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.publicationDate == value) return this;
    return new ImmutableContract_ContentDefinition(
        value,
        this.subType,
        this.extension,
        this.type,
        this.publisher,
        this.copyright,
        this.publicationStatus,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ContentDefinition#subType() subType} attribute.
   * @param value The value for subType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ContentDefinition withSubType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "subType");
    if (this.subType == newValue) return this;
    return new ImmutableContract_ContentDefinition(
        this.publicationDate,
        newValue,
        this.extension,
        this.type,
        this.publisher,
        this.copyright,
        this.publicationStatus,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ContentDefinition#subType() subType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ContentDefinition withSubType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.subType == value) return this;
    return new ImmutableContract_ContentDefinition(
        this.publicationDate,
        value,
        this.extension,
        this.type,
        this.publisher,
        this.copyright,
        this.publicationStatus,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ContentDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ContentDefinition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContract_ContentDefinition(
        this.publicationDate,
        this.subType,
        newValue,
        this.type,
        this.publisher,
        this.copyright,
        this.publicationStatus,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ContentDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ContentDefinition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContract_ContentDefinition(
        this.publicationDate,
        this.subType,
        value,
        this.type,
        this.publisher,
        this.copyright,
        this.publicationStatus,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Contract_ContentDefinition#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableContract_ContentDefinition withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableContract_ContentDefinition(
        this.publicationDate,
        this.subType,
        this.extension,
        newValue,
        this.publisher,
        this.copyright,
        this.publicationStatus,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ContentDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ContentDefinition withPublisher(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "publisher");
    if (this.publisher == newValue) return this;
    return new ImmutableContract_ContentDefinition(
        this.publicationDate,
        this.subType,
        this.extension,
        this.type,
        newValue,
        this.copyright,
        this.publicationStatus,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ContentDefinition#publisher() publisher} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ContentDefinition withPublisher(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.publisher == value) return this;
    return new ImmutableContract_ContentDefinition(
        this.publicationDate,
        this.subType,
        this.extension,
        this.type,
        value,
        this.copyright,
        this.publicationStatus,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ContentDefinition#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ContentDefinition withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableContract_ContentDefinition(
        this.publicationDate,
        this.subType,
        this.extension,
        this.type,
        this.publisher,
        newValue,
        this.publicationStatus,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ContentDefinition#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ContentDefinition withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableContract_ContentDefinition(
        this.publicationDate,
        this.subType,
        this.extension,
        this.type,
        this.publisher,
        value,
        this.publicationStatus,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ContentDefinition#publicationStatus() publicationStatus} attribute.
   * @param value The value for publicationStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ContentDefinition withPublicationStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "publicationStatus");
    if (this.publicationStatus == newValue) return this;
    return new ImmutableContract_ContentDefinition(
        this.publicationDate,
        this.subType,
        this.extension,
        this.type,
        this.publisher,
        this.copyright,
        newValue,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ContentDefinition#publicationStatus() publicationStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publicationStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ContentDefinition withPublicationStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.publicationStatus == value) return this;
    return new ImmutableContract_ContentDefinition(
        this.publicationDate,
        this.subType,
        this.extension,
        this.type,
        this.publisher,
        this.copyright,
        value,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ContentDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ContentDefinition withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableContract_ContentDefinition(
        this.publicationDate,
        this.subType,
        this.extension,
        this.type,
        this.publisher,
        this.copyright,
        this.publicationStatus,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ContentDefinition#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ContentDefinition withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableContract_ContentDefinition(
        this.publicationDate,
        this.subType,
        this.extension,
        this.type,
        this.publisher,
        this.copyright,
        this.publicationStatus,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_ContentDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_ContentDefinition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableContract_ContentDefinition(
        this.publicationDate,
        this.subType,
        this.extension,
        this.type,
        this.publisher,
        this.copyright,
        this.publicationStatus,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_ContentDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_ContentDefinition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableContract_ContentDefinition(
        this.publicationDate,
        this.subType,
        this.extension,
        this.type,
        this.publisher,
        this.copyright,
        this.publicationStatus,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContract_ContentDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContract_ContentDefinition
        && equalTo((ImmutableContract_ContentDefinition) another);
  }

  private boolean equalTo(ImmutableContract_ContentDefinition another) {
    return Objects.equals(publicationDate, another.publicationDate)
        && Objects.equals(subType, another.subType)
        && Objects.equals(extension, another.extension)
        && type.equals(another.type)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(copyright, another.copyright)
        && Objects.equals(publicationStatus, another.publicationStatus)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code publicationDate}, {@code subType}, {@code extension}, {@code type}, {@code publisher}, {@code copyright}, {@code publicationStatus}, {@code id}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(publicationDate);
    h += (h << 5) + Objects.hashCode(subType);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(copyright);
    h += (h << 5) + Objects.hashCode(publicationStatus);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Contract_ContentDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Contract_ContentDefinition{");
    if (publicationDate != null) {
      builder.append("publicationDate=").append(publicationDate);
    }
    if (subType != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("subType=").append(subType);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 27) builder.append(", ");
    builder.append("type=").append(type);
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (publicationStatus != null) {
      builder.append(", ");
      builder.append("publicationStatus=").append(publicationStatus);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
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
  @Generated(from = "Contract_ContentDefinition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Contract_ContentDefinition {
    @Nullable Optional<DateTime> publicationDate = Optional.empty();
    boolean publicationDateIsSet;
    @Nullable Optional<CodeableConcept> subType = Optional.empty();
    boolean subTypeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable CodeableConcept type;
    @Nullable Optional<Reference> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @Nullable Optional<Code> publicationStatus = Optional.empty();
    boolean publicationStatusIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("publicationDate")
    public void setPublicationDate(Optional<DateTime> publicationDate) {
      this.publicationDate = publicationDate;
      this.publicationDateIsSet = true;
    }
    @JsonProperty("subType")
    public void setSubType(Optional<CodeableConcept> subType) {
      this.subType = subType;
      this.subTypeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<Reference> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @JsonProperty("publicationStatus")
    public void setPublicationStatus(Optional<Code> publicationStatus) {
      this.publicationStatus = publicationStatus;
      this.publicationStatusIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<DateTime> publicationDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> subType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> publicationStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableContract_ContentDefinition fromJson(Json json) {
    ImmutableContract_ContentDefinition.Builder builder = ((ImmutableContract_ContentDefinition.Builder) ImmutableContract_ContentDefinition.builder());
    if (json.publicationDateIsSet) {
      builder.publicationDate(json.publicationDate);
    }
    if (json.subTypeIsSet) {
      builder.subType(json.subType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.publicationStatusIsSet) {
      builder.publicationStatus(json.publicationStatus);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableContract_ContentDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Contract_ContentDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Contract_ContentDefinition instance
   */
  public static Contract_ContentDefinition copyOf(Contract_ContentDefinition instance) {
    if (instance instanceof ImmutableContract_ContentDefinition) {
      return (ImmutableContract_ContentDefinition) instance;
    }
    return ((ImmutableContract_ContentDefinition.Builder) ImmutableContract_ContentDefinition.builder())
        .publicationDate(instance.publicationDate())
        .subType(instance.subType())
        .extension(instance.extension())
        .type(instance.type())
        .publisher(instance.publisher())
        .copyright(instance.copyright())
        .publicationStatus(instance.publicationStatus())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Contract_ContentDefinition Contract_ContentDefinition}.
   * <pre>
   * ImmutableContract_ContentDefinition.builder()
   *    .publicationDate(com.medplum.types.fhir.DateTime) // optional {@link Contract_ContentDefinition#publicationDate() publicationDate}
   *    .subType(com.medplum.types.fhir.CodeableConcept) // optional {@link Contract_ContentDefinition#subType() subType}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Contract_ContentDefinition#extension() extension}
   *    .type(com.medplum.types.fhir.CodeableConcept) // required {@link Contract_ContentDefinition#type() type}
   *    .publisher(com.medplum.types.fhir.Reference) // optional {@link Contract_ContentDefinition#publisher() publisher}
   *    .copyright(com.medplum.types.fhir.Markdown) // optional {@link Contract_ContentDefinition#copyright() copyright}
   *    .publicationStatus(com.medplum.types.fhir.Code) // optional {@link Contract_ContentDefinition#publicationStatus() publicationStatus}
   *    .id(String) // optional {@link Contract_ContentDefinition#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Contract_ContentDefinition#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new Contract_ContentDefinition builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableContract_ContentDefinition.Builder();
  }

  /**
   * Builds instances of type {@link Contract_ContentDefinition Contract_ContentDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Contract_ContentDefinition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_PUBLICATION_DATE = 0x1L;
    private static final long OPT_BIT_SUB_TYPE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_PUBLISHER = 0x8L;
    private static final long OPT_BIT_COPYRIGHT = 0x10L;
    private static final long OPT_BIT_PUBLICATION_STATUS = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable DateTime publicationDate;
    private @Nullable CodeableConcept subType;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept type;
    private @Nullable Reference publisher;
    private @Nullable Markdown copyright;
    private @Nullable Code publicationStatus;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#publicationDate() publicationDate} to publicationDate.
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
     * Initializes the optional value {@link Contract_ContentDefinition#publicationDate() publicationDate} to publicationDate.
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
     * Initializes the optional value {@link Contract_ContentDefinition#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    public final Builder subType(CodeableConcept subType) {
      checkNotIsSet(subTypeIsSet(), "subType");
      this.subType = Objects.requireNonNull(subType, "subType");
      optBits |= OPT_BIT_SUB_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subType")
    public final Builder subType(Optional<? extends CodeableConcept> subType) {
      checkNotIsSet(subTypeIsSet(), "subType");
      this.subType = subType.orElse(null);
      optBits |= OPT_BIT_SUB_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_ContentDefinition#extension() extension} to extension.
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
     * Initializes the value for the {@link Contract_ContentDefinition#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    public final Builder publisher(Reference publisher) {
      checkNotIsSet(publisherIsSet(), "publisher");
      this.publisher = Objects.requireNonNull(publisher, "publisher");
      optBits |= OPT_BIT_PUBLISHER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("publisher")
    public final Builder publisher(Optional<? extends Reference> publisher) {
      checkNotIsSet(publisherIsSet(), "publisher");
      this.publisher = publisher.orElse(null);
      optBits |= OPT_BIT_PUBLISHER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    public final Builder copyright(Markdown copyright) {
      checkNotIsSet(copyrightIsSet(), "copyright");
      this.copyright = Objects.requireNonNull(copyright, "copyright");
      optBits |= OPT_BIT_COPYRIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("copyright")
    public final Builder copyright(Optional<? extends Markdown> copyright) {
      checkNotIsSet(copyrightIsSet(), "copyright");
      this.copyright = copyright.orElse(null);
      optBits |= OPT_BIT_COPYRIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#publicationStatus() publicationStatus} to publicationStatus.
     * @param publicationStatus The value for publicationStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder publicationStatus(Code publicationStatus) {
      checkNotIsSet(publicationStatusIsSet(), "publicationStatus");
      this.publicationStatus = Objects.requireNonNull(publicationStatus, "publicationStatus");
      optBits |= OPT_BIT_PUBLICATION_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#publicationStatus() publicationStatus} to publicationStatus.
     * @param publicationStatus The value for publicationStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("publicationStatus")
    public final Builder publicationStatus(Optional<? extends Code> publicationStatus) {
      checkNotIsSet(publicationStatusIsSet(), "publicationStatus");
      this.publicationStatus = publicationStatus.orElse(null);
      optBits |= OPT_BIT_PUBLICATION_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#id() id} to id.
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
     * Initializes the optional value {@link Contract_ContentDefinition#id() id} to id.
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
     * Initializes the optional value {@link Contract_ContentDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_ContentDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link Contract_ContentDefinition Contract_ContentDefinition}.
     * @return An immutable instance of Contract_ContentDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Contract_ContentDefinition build() {
      checkRequiredAttributes();
      return new ImmutableContract_ContentDefinition(
          publicationDate,
          subType,
          extension,
          type,
          publisher,
          copyright,
          publicationStatus,
          id,
          modifierExtension);
    }

    private boolean publicationDateIsSet() {
      return (optBits & OPT_BIT_PUBLICATION_DATE) != 0;
    }

    private boolean subTypeIsSet() {
      return (optBits & OPT_BIT_SUB_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean publicationStatusIsSet() {
      return (optBits & OPT_BIT_PUBLICATION_STATUS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Contract_ContentDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build Contract_ContentDefinition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Contract_ContentDefinition", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link Contract_ContentDefinition#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "Contract_ContentDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#publicationDate() publicationDate} to publicationDate.
     * @param publicationDate The value for publicationDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publicationDate(DateTime publicationDate);

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#publicationDate() publicationDate} to publicationDate.
     * @param publicationDate The value for publicationDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publicationDate(Optional<? extends DateTime> publicationDate);

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subType(CodeableConcept subType);

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subType(Optional<? extends CodeableConcept> subType);

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(Reference publisher);

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<? extends Reference> publisher);

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#publicationStatus() publicationStatus} to publicationStatus.
     * @param publicationStatus The value for publicationStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publicationStatus(Code publicationStatus);

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#publicationStatus() publicationStatus} to publicationStatus.
     * @param publicationStatus The value for publicationStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publicationStatus(Optional<? extends Code> publicationStatus);

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Contract_ContentDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link Contract_ContentDefinition Contract_ContentDefinition}.
     * @return An immutable instance of Contract_ContentDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Contract_ContentDefinition build();
  }
}
