package com.fhir;

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
 * Immutable implementation of {@link SubstanceSpecification_Representation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSpecification_Representation.builder()}.
 */
@Generated(from = "SubstanceSpecification_Representation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSpecification_Representation
    implements SubstanceSpecification_Representation {
  private final @Nullable Attachment attachment;
  private final @Nullable String representation;
  private final @Nullable String id;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableSubstanceSpecification_Representation(
      @Nullable Attachment attachment,
      @Nullable String representation,
      @Nullable String id,
      @Nullable CodeableConcept type,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension) {
    this.attachment = attachment;
    this.representation = representation;
    this.id = id;
    this.type = type;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code attachment} attribute
   */
  @JsonProperty("attachment")
  @Override
  public Optional<Attachment> attachment() {
    return Optional.ofNullable(attachment);
  }

  /**
   * @return The value of the {@code representation} attribute
   */
  @JsonProperty("representation")
  @Override
  public Optional<String> representation() {
    return Optional.ofNullable(representation);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Representation#attachment() attachment} attribute.
   * @param value The value for attachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Representation withAttachment(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "attachment");
    if (this.attachment == newValue) return this;
    return new ImmutableSubstanceSpecification_Representation(newValue, this.representation, this.id, this.type, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Representation#attachment() attachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for attachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Representation withAttachment(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.attachment == value) return this;
    return new ImmutableSubstanceSpecification_Representation(value, this.representation, this.id, this.type, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Representation#representation() representation} attribute.
   * @param value The value for representation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Representation withRepresentation(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "representation");
    if (Objects.equals(this.representation, newValue)) return this;
    return new ImmutableSubstanceSpecification_Representation(this.attachment, newValue, this.id, this.type, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Representation#representation() representation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for representation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Representation withRepresentation(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.representation, value)) return this;
    return new ImmutableSubstanceSpecification_Representation(this.attachment, value, this.id, this.type, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Representation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Representation withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceSpecification_Representation(
        this.attachment,
        this.representation,
        newValue,
        this.type,
        this.extension,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Representation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Representation withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceSpecification_Representation(this.attachment, this.representation, value, this.type, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Representation#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Representation withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSubstanceSpecification_Representation(this.attachment, this.representation, this.id, newValue, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Representation#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Representation withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSubstanceSpecification_Representation(this.attachment, this.representation, this.id, value, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Representation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Representation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSpecification_Representation(this.attachment, this.representation, this.id, this.type, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Representation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Representation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSpecification_Representation(this.attachment, this.representation, this.id, this.type, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Representation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Representation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSpecification_Representation(this.attachment, this.representation, this.id, this.type, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Representation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Representation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSpecification_Representation(this.attachment, this.representation, this.id, this.type, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSpecification_Representation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSpecification_Representation
        && equalTo((ImmutableSubstanceSpecification_Representation) another);
  }

  private boolean equalTo(ImmutableSubstanceSpecification_Representation another) {
    return Objects.equals(attachment, another.attachment)
        && Objects.equals(representation, another.representation)
        && Objects.equals(id, another.id)
        && Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code attachment}, {@code representation}, {@code id}, {@code type}, {@code extension}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(attachment);
    h += (h << 5) + Objects.hashCode(representation);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSpecification_Representation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSpecification_Representation{");
    if (attachment != null) {
      builder.append("attachment=").append(attachment);
    }
    if (representation != null) {
      if (builder.length() > 38) builder.append(", ");
      builder.append("representation=").append(representation);
    }
    if (id != null) {
      if (builder.length() > 38) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 38) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 38) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 38) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSpecification_Representation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSpecification_Representation {
    @Nullable Optional<Attachment> attachment = Optional.empty();
    boolean attachmentIsSet;
    @Nullable Optional<String> representation = Optional.empty();
    boolean representationIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("attachment")
    public void setAttachment(Optional<Attachment> attachment) {
      this.attachment = attachment;
      this.attachmentIsSet = true;
    }
    @JsonProperty("representation")
    public void setRepresentation(Optional<String> representation) {
      this.representation = representation;
      this.representationIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<Attachment> attachment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> representation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableSubstanceSpecification_Representation fromJson(Json json) {
    ImmutableSubstanceSpecification_Representation.Builder builder = ImmutableSubstanceSpecification_Representation.builder();
    if (json.attachmentIsSet) {
      builder.attachment(json.attachment);
    }
    if (json.representationIsSet) {
      builder.representation(json.representation);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableSubstanceSpecification_Representation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSpecification_Representation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSpecification_Representation instance
   */
  public static SubstanceSpecification_Representation copyOf(SubstanceSpecification_Representation instance) {
    if (instance instanceof ImmutableSubstanceSpecification_Representation) {
      return (ImmutableSubstanceSpecification_Representation) instance;
    }
    return ImmutableSubstanceSpecification_Representation.builder()
        .attachment(instance.attachment())
        .representation(instance.representation())
        .id(instance.id())
        .type(instance.type())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSpecification_Representation SubstanceSpecification_Representation}.
   * <pre>
   * ImmutableSubstanceSpecification_Representation.builder()
   *    .attachment(com.fhir.Attachment) // optional {@link SubstanceSpecification_Representation#attachment() attachment}
   *    .representation(String) // optional {@link SubstanceSpecification_Representation#representation() representation}
   *    .id(String) // optional {@link SubstanceSpecification_Representation#id() id}
   *    .type(com.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Representation#type() type}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Representation#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Representation#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new SubstanceSpecification_Representation builder
   */
  public static ImmutableSubstanceSpecification_Representation.Builder builder() {
    return new ImmutableSubstanceSpecification_Representation.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSpecification_Representation SubstanceSpecification_Representation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSpecification_Representation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ATTACHMENT = 0x1L;
    private static final long OPT_BIT_REPRESENTATION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable Attachment attachment;
    private @Nullable String representation;
    private @Nullable String id;
    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Representation#attachment() attachment} to attachment.
     * @param attachment The value for attachment
     * @return {@code this} builder for chained invocation
     */
    public final Builder attachment(Attachment attachment) {
      checkNotIsSet(attachmentIsSet(), "attachment");
      this.attachment = Objects.requireNonNull(attachment, "attachment");
      optBits |= OPT_BIT_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Representation#attachment() attachment} to attachment.
     * @param attachment The value for attachment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("attachment")
    public final Builder attachment(Optional<? extends Attachment> attachment) {
      checkNotIsSet(attachmentIsSet(), "attachment");
      this.attachment = attachment.orElse(null);
      optBits |= OPT_BIT_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Representation#representation() representation} to representation.
     * @param representation The value for representation
     * @return {@code this} builder for chained invocation
     */
    public final Builder representation(String representation) {
      checkNotIsSet(representationIsSet(), "representation");
      this.representation = Objects.requireNonNull(representation, "representation");
      optBits |= OPT_BIT_REPRESENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Representation#representation() representation} to representation.
     * @param representation The value for representation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("representation")
    public final Builder representation(Optional<String> representation) {
      checkNotIsSet(representationIsSet(), "representation");
      this.representation = representation.orElse(null);
      optBits |= OPT_BIT_REPRESENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Representation#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_Representation#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_Representation#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Representation#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Representation#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Representation#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Representation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Representation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link SubstanceSpecification_Representation SubstanceSpecification_Representation}.
     * @return An immutable instance of SubstanceSpecification_Representation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSpecification_Representation build() {
      return new ImmutableSubstanceSpecification_Representation(attachment, representation, id, type, extension, modifierExtension);
    }

    private boolean attachmentIsSet() {
      return (optBits & OPT_BIT_ATTACHMENT) != 0;
    }

    private boolean representationIsSet() {
      return (optBits & OPT_BIT_REPRESENTATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSpecification_Representation is strict, attribute is already set: ".concat(name));
    }
  }
}
