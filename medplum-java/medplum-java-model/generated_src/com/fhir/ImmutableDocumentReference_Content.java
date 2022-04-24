package com.fhir;

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
 * Immutable implementation of {@link DocumentReference_Content}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDocumentReference_Content.builder()}.
 */
@Generated(from = "DocumentReference_Content", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDocumentReference_Content implements DocumentReference_Content {
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable Coding format;
  private final @Nullable List<Extension> modifierExtension;
  private final Attachment attachment;

  private ImmutableDocumentReference_Content(
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable Coding format,
      @Nullable List<Extension> modifierExtension,
      Attachment attachment) {
    this.extension = extension;
    this.id = id;
    this.format = format;
    this.modifierExtension = modifierExtension;
    this.attachment = attachment;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code format} attribute
   */
  @JsonProperty("format")
  @Override
  public Optional<Coding> format() {
    return Optional.ofNullable(format);
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
   * @return The value of the {@code attachment} attribute
   */
  @JsonProperty("attachment")
  @Override
  public Attachment attachment() {
    return attachment;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_Content#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_Content withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDocumentReference_Content(newValue, this.id, this.format, this.modifierExtension, this.attachment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_Content#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference_Content withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDocumentReference_Content(value, this.id, this.format, this.modifierExtension, this.attachment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_Content#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_Content withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDocumentReference_Content(this.extension, newValue, this.format, this.modifierExtension, this.attachment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_Content#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_Content withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDocumentReference_Content(this.extension, value, this.format, this.modifierExtension, this.attachment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_Content#format() format} attribute.
   * @param value The value for format
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_Content withFormat(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "format");
    if (this.format == newValue) return this;
    return new ImmutableDocumentReference_Content(this.extension, this.id, newValue, this.modifierExtension, this.attachment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_Content#format() format} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for format
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference_Content withFormat(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.format == value) return this;
    return new ImmutableDocumentReference_Content(this.extension, this.id, value, this.modifierExtension, this.attachment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DocumentReference_Content#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDocumentReference_Content withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDocumentReference_Content(this.extension, this.id, this.format, newValue, this.attachment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DocumentReference_Content#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDocumentReference_Content withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDocumentReference_Content(this.extension, this.id, this.format, value, this.attachment);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DocumentReference_Content#attachment() attachment} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for attachment
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDocumentReference_Content withAttachment(Attachment value) {
    if (this.attachment == value) return this;
    Attachment newValue = Objects.requireNonNull(value, "attachment");
    return new ImmutableDocumentReference_Content(this.extension, this.id, this.format, this.modifierExtension, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDocumentReference_Content} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDocumentReference_Content
        && equalTo((ImmutableDocumentReference_Content) another);
  }

  private boolean equalTo(ImmutableDocumentReference_Content another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(format, another.format)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && attachment.equals(another.attachment);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code id}, {@code format}, {@code modifierExtension}, {@code attachment}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(format);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + attachment.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code DocumentReference_Content} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DocumentReference_Content{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (format != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("format=").append(format);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 26) builder.append(", ");
    builder.append("attachment=").append(attachment);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DocumentReference_Content", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DocumentReference_Content {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Coding> format = Optional.empty();
    boolean formatIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Attachment attachment;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("format")
    public void setFormat(Optional<Coding> format) {
      this.format = format;
      this.formatIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("attachment")
    public void setAttachment(Attachment attachment) {
      this.attachment = attachment;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> format() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Attachment attachment() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDocumentReference_Content fromJson(Json json) {
    ImmutableDocumentReference_Content.Builder builder = ((ImmutableDocumentReference_Content.Builder) ImmutableDocumentReference_Content.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.formatIsSet) {
      builder.format(json.format);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.attachment != null) {
      builder.attachment(json.attachment);
    }
    return (ImmutableDocumentReference_Content) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DocumentReference_Content} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DocumentReference_Content instance
   */
  public static DocumentReference_Content copyOf(DocumentReference_Content instance) {
    if (instance instanceof ImmutableDocumentReference_Content) {
      return (ImmutableDocumentReference_Content) instance;
    }
    return ((ImmutableDocumentReference_Content.Builder) ImmutableDocumentReference_Content.builder())
        .extension(instance.extension())
        .id(instance.id())
        .format(instance.format())
        .modifierExtension(instance.modifierExtension())
        .attachment(instance.attachment())
        .build();
  }

  /**
   * Creates a builder for {@link DocumentReference_Content DocumentReference_Content}.
   * <pre>
   * ImmutableDocumentReference_Content.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DocumentReference_Content#extension() extension}
   *    .id(String) // optional {@link DocumentReference_Content#id() id}
   *    .format(com.fhir.Coding) // optional {@link DocumentReference_Content#format() format}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DocumentReference_Content#modifierExtension() modifierExtension}
   *    .attachment(com.fhir.Attachment) // required {@link DocumentReference_Content#attachment() attachment}
   *    .build();
   * </pre>
   * @return A new DocumentReference_Content builder
   */
  public static AttachmentBuildStage builder() {
    return new ImmutableDocumentReference_Content.Builder();
  }

  /**
   * Builds instances of type {@link DocumentReference_Content DocumentReference_Content}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DocumentReference_Content", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements AttachmentBuildStage, BuildFinal {
    private static final long INIT_BIT_ATTACHMENT = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_FORMAT = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Coding format;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Attachment attachment;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DocumentReference_Content#extension() extension} to extension.
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
     * Initializes the optional value {@link DocumentReference_Content#extension() extension} to extension.
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
     * Initializes the optional value {@link DocumentReference_Content#id() id} to id.
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
     * Initializes the optional value {@link DocumentReference_Content#id() id} to id.
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
     * Initializes the optional value {@link DocumentReference_Content#format() format} to format.
     * @param format The value for format
     * @return {@code this} builder for chained invocation
     */
    public final Builder format(Coding format) {
      checkNotIsSet(formatIsSet(), "format");
      this.format = Objects.requireNonNull(format, "format");
      optBits |= OPT_BIT_FORMAT;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_Content#format() format} to format.
     * @param format The value for format
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("format")
    public final Builder format(Optional<? extends Coding> format) {
      checkNotIsSet(formatIsSet(), "format");
      this.format = format.orElse(null);
      optBits |= OPT_BIT_FORMAT;
      return this;
    }

    /**
     * Initializes the optional value {@link DocumentReference_Content#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DocumentReference_Content#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link DocumentReference_Content#attachment() attachment} attribute.
     * @param attachment The value for attachment 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("attachment")
    public final Builder attachment(Attachment attachment) {
      checkNotIsSet(attachmentIsSet(), "attachment");
      this.attachment = Objects.requireNonNull(attachment, "attachment");
      initBits &= ~INIT_BIT_ATTACHMENT;
      return this;
    }

    /**
     * Builds a new {@link DocumentReference_Content DocumentReference_Content}.
     * @return An immutable instance of DocumentReference_Content
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DocumentReference_Content build() {
      checkRequiredAttributes();
      return new ImmutableDocumentReference_Content(extension, id, format, modifierExtension, attachment);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean formatIsSet() {
      return (optBits & OPT_BIT_FORMAT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean attachmentIsSet() {
      return (initBits & INIT_BIT_ATTACHMENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DocumentReference_Content is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!attachmentIsSet()) attributes.add("attachment");
      return "Cannot build DocumentReference_Content, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "DocumentReference_Content", generator = "Immutables")
  public interface AttachmentBuildStage {
    /**
     * Initializes the value for the {@link DocumentReference_Content#attachment() attachment} attribute.
     * @param attachment The value for attachment 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal attachment(Attachment attachment);
  }

  @Generated(from = "DocumentReference_Content", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DocumentReference_Content#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link DocumentReference_Content#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link DocumentReference_Content#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link DocumentReference_Content#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link DocumentReference_Content#format() format} to format.
     * @param format The value for format
     * @return {@code this} builder for chained invocation
     */
    BuildFinal format(Coding format);

    /**
     * Initializes the optional value {@link DocumentReference_Content#format() format} to format.
     * @param format The value for format
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal format(Optional<? extends Coding> format);

    /**
     * Initializes the optional value {@link DocumentReference_Content#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DocumentReference_Content#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link DocumentReference_Content DocumentReference_Content}.
     * @return An immutable instance of DocumentReference_Content
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DocumentReference_Content build();
  }
}
