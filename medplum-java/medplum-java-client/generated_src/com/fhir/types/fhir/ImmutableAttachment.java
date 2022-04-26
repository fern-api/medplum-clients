package com.fhir.types.fhir;

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
 * Immutable implementation of {@link Attachment}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAttachment.builder()}.
 */
@Generated(from = "Attachment", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAttachment implements Attachment {
  private final @Nullable UnsignedInt size;
  private final @Nullable Base64Binary hash;
  private final @Nullable Url url;
  private final @Nullable String title;
  private final @Nullable String id;
  private final @Nullable Base64Binary data;
  private final @Nullable Code contentType;
  private final @Nullable Code language;
  private final @Nullable List<Extension> extension;
  private final @Nullable DateTime creation;

  private ImmutableAttachment(
      @Nullable UnsignedInt size,
      @Nullable Base64Binary hash,
      @Nullable Url url,
      @Nullable String title,
      @Nullable String id,
      @Nullable Base64Binary data,
      @Nullable Code contentType,
      @Nullable Code language,
      @Nullable List<Extension> extension,
      @Nullable DateTime creation) {
    this.size = size;
    this.hash = hash;
    this.url = url;
    this.title = title;
    this.id = id;
    this.data = data;
    this.contentType = contentType;
    this.language = language;
    this.extension = extension;
    this.creation = creation;
  }

  /**
   * @return The value of the {@code size} attribute
   */
  @JsonProperty("size")
  @Override
  public Optional<UnsignedInt> size() {
    return Optional.ofNullable(size);
  }

  /**
   * @return The value of the {@code hash} attribute
   */
  @JsonProperty("hash")
  @Override
  public Optional<Base64Binary> hash() {
    return Optional.ofNullable(hash);
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Url> url() {
    return Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
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
   * @return The value of the {@code data} attribute
   */
  @JsonProperty("data")
  @Override
  public Optional<Base64Binary> data() {
    return Optional.ofNullable(data);
  }

  /**
   * @return The value of the {@code contentType} attribute
   */
  @JsonProperty("contentType")
  @Override
  public Optional<Code> contentType() {
    return Optional.ofNullable(contentType);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code creation} attribute
   */
  @JsonProperty("creation")
  @Override
  public Optional<DateTime> creation() {
    return Optional.ofNullable(creation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#size() size} attribute.
   * @param value The value for size
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withSize(UnsignedInt value) {
    @Nullable UnsignedInt newValue = Objects.requireNonNull(value, "size");
    if (this.size == newValue) return this;
    return new ImmutableAttachment(
        newValue,
        this.hash,
        this.url,
        this.title,
        this.id,
        this.data,
        this.contentType,
        this.language,
        this.extension,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#size() size} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for size
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAttachment withSize(Optional<? extends UnsignedInt> optional) {
    @Nullable UnsignedInt value = optional.orElse(null);
    if (this.size == value) return this;
    return new ImmutableAttachment(
        value,
        this.hash,
        this.url,
        this.title,
        this.id,
        this.data,
        this.contentType,
        this.language,
        this.extension,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#hash() hash} attribute.
   * @param value The value for hash
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withHash(Base64Binary value) {
    @Nullable Base64Binary newValue = Objects.requireNonNull(value, "hash");
    if (this.hash == newValue) return this;
    return new ImmutableAttachment(
        this.size,
        newValue,
        this.url,
        this.title,
        this.id,
        this.data,
        this.contentType,
        this.language,
        this.extension,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#hash() hash} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hash
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAttachment withHash(Optional<? extends Base64Binary> optional) {
    @Nullable Base64Binary value = optional.orElse(null);
    if (this.hash == value) return this;
    return new ImmutableAttachment(
        this.size,
        value,
        this.url,
        this.title,
        this.id,
        this.data,
        this.contentType,
        this.language,
        this.extension,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withUrl(Url value) {
    @Nullable Url newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableAttachment(
        this.size,
        this.hash,
        newValue,
        this.title,
        this.id,
        this.data,
        this.contentType,
        this.language,
        this.extension,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAttachment withUrl(Optional<? extends Url> optional) {
    @Nullable Url value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableAttachment(
        this.size,
        this.hash,
        value,
        this.title,
        this.id,
        this.data,
        this.contentType,
        this.language,
        this.extension,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableAttachment(
        this.size,
        this.hash,
        this.url,
        newValue,
        this.id,
        this.data,
        this.contentType,
        this.language,
        this.extension,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableAttachment(
        this.size,
        this.hash,
        this.url,
        value,
        this.id,
        this.data,
        this.contentType,
        this.language,
        this.extension,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAttachment(
        this.size,
        this.hash,
        this.url,
        this.title,
        newValue,
        this.data,
        this.contentType,
        this.language,
        this.extension,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAttachment(
        this.size,
        this.hash,
        this.url,
        this.title,
        value,
        this.data,
        this.contentType,
        this.language,
        this.extension,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#data() data} attribute.
   * @param value The value for data
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withData(Base64Binary value) {
    @Nullable Base64Binary newValue = Objects.requireNonNull(value, "data");
    if (this.data == newValue) return this;
    return new ImmutableAttachment(
        this.size,
        this.hash,
        this.url,
        this.title,
        this.id,
        newValue,
        this.contentType,
        this.language,
        this.extension,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#data() data} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for data
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAttachment withData(Optional<? extends Base64Binary> optional) {
    @Nullable Base64Binary value = optional.orElse(null);
    if (this.data == value) return this;
    return new ImmutableAttachment(
        this.size,
        this.hash,
        this.url,
        this.title,
        this.id,
        value,
        this.contentType,
        this.language,
        this.extension,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#contentType() contentType} attribute.
   * @param value The value for contentType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withContentType(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "contentType");
    if (this.contentType == newValue) return this;
    return new ImmutableAttachment(
        this.size,
        this.hash,
        this.url,
        this.title,
        this.id,
        this.data,
        newValue,
        this.language,
        this.extension,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#contentType() contentType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAttachment withContentType(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.contentType == value) return this;
    return new ImmutableAttachment(
        this.size,
        this.hash,
        this.url,
        this.title,
        this.id,
        this.data,
        value,
        this.language,
        this.extension,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableAttachment(
        this.size,
        this.hash,
        this.url,
        this.title,
        this.id,
        this.data,
        this.contentType,
        newValue,
        this.extension,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAttachment withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableAttachment(
        this.size,
        this.hash,
        this.url,
        this.title,
        this.id,
        this.data,
        this.contentType,
        value,
        this.extension,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAttachment(
        this.size,
        this.hash,
        this.url,
        this.title,
        this.id,
        this.data,
        this.contentType,
        this.language,
        newValue,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAttachment withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAttachment(
        this.size,
        this.hash,
        this.url,
        this.title,
        this.id,
        this.data,
        this.contentType,
        this.language,
        value,
        this.creation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#creation() creation} attribute.
   * @param value The value for creation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withCreation(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "creation");
    if (this.creation == newValue) return this;
    return new ImmutableAttachment(
        this.size,
        this.hash,
        this.url,
        this.title,
        this.id,
        this.data,
        this.contentType,
        this.language,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#creation() creation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for creation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAttachment withCreation(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.creation == value) return this;
    return new ImmutableAttachment(
        this.size,
        this.hash,
        this.url,
        this.title,
        this.id,
        this.data,
        this.contentType,
        this.language,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAttachment} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAttachment
        && equalTo((ImmutableAttachment) another);
  }

  private boolean equalTo(ImmutableAttachment another) {
    return Objects.equals(size, another.size)
        && Objects.equals(hash, another.hash)
        && Objects.equals(url, another.url)
        && Objects.equals(title, another.title)
        && Objects.equals(id, another.id)
        && Objects.equals(data, another.data)
        && Objects.equals(contentType, another.contentType)
        && Objects.equals(language, another.language)
        && Objects.equals(extension, another.extension)
        && Objects.equals(creation, another.creation);
  }

  /**
   * Computes a hash code from attributes: {@code size}, {@code hash}, {@code url}, {@code title}, {@code id}, {@code data}, {@code contentType}, {@code language}, {@code extension}, {@code creation}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(size);
    h += (h << 5) + Objects.hashCode(hash);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(data);
    h += (h << 5) + Objects.hashCode(contentType);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(creation);
    return h;
  }

  /**
   * Prints the immutable value {@code Attachment} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Attachment{");
    if (size != null) {
      builder.append("size=").append(size);
    }
    if (hash != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("hash=").append(hash);
    }
    if (url != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (title != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (id != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (data != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("data=").append(data);
    }
    if (contentType != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("contentType=").append(contentType);
    }
    if (language != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (extension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (creation != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("creation=").append(creation);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Attachment", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Attachment {
    @Nullable Optional<UnsignedInt> size = Optional.empty();
    boolean sizeIsSet;
    @Nullable Optional<Base64Binary> hash = Optional.empty();
    boolean hashIsSet;
    @Nullable Optional<Url> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Base64Binary> data = Optional.empty();
    boolean dataIsSet;
    @Nullable Optional<Code> contentType = Optional.empty();
    boolean contentTypeIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<DateTime> creation = Optional.empty();
    boolean creationIsSet;
    @JsonProperty("size")
    public void setSize(Optional<UnsignedInt> size) {
      this.size = size;
      this.sizeIsSet = true;
    }
    @JsonProperty("hash")
    public void setHash(Optional<Base64Binary> hash) {
      this.hash = hash;
      this.hashIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Url> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("data")
    public void setData(Optional<Base64Binary> data) {
      this.data = data;
      this.dataIsSet = true;
    }
    @JsonProperty("contentType")
    public void setContentType(Optional<Code> contentType) {
      this.contentType = contentType;
      this.contentTypeIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("creation")
    public void setCreation(Optional<DateTime> creation) {
      this.creation = creation;
      this.creationIsSet = true;
    }
    @Override
    public Optional<UnsignedInt> size() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Base64Binary> hash() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Url> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Base64Binary> data() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> contentType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> creation() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAttachment fromJson(Json json) {
    ImmutableAttachment.Builder builder = ImmutableAttachment.builder();
    if (json.sizeIsSet) {
      builder.size(json.size);
    }
    if (json.hashIsSet) {
      builder.hash(json.hash);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.dataIsSet) {
      builder.data(json.data);
    }
    if (json.contentTypeIsSet) {
      builder.contentType(json.contentType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.creationIsSet) {
      builder.creation(json.creation);
    }
    return (ImmutableAttachment) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Attachment} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Attachment instance
   */
  public static Attachment copyOf(Attachment instance) {
    if (instance instanceof ImmutableAttachment) {
      return (ImmutableAttachment) instance;
    }
    return ImmutableAttachment.builder()
        .size(instance.size())
        .hash(instance.hash())
        .url(instance.url())
        .title(instance.title())
        .id(instance.id())
        .data(instance.data())
        .contentType(instance.contentType())
        .language(instance.language())
        .extension(instance.extension())
        .creation(instance.creation())
        .build();
  }

  /**
   * Creates a builder for {@link Attachment Attachment}.
   * <pre>
   * ImmutableAttachment.builder()
   *    .size(com.fhir.types.fhir.UnsignedInt) // optional {@link Attachment#size() size}
   *    .hash(com.fhir.types.fhir.Base64Binary) // optional {@link Attachment#hash() hash}
   *    .url(com.fhir.types.fhir.Url) // optional {@link Attachment#url() url}
   *    .title(String) // optional {@link Attachment#title() title}
   *    .id(String) // optional {@link Attachment#id() id}
   *    .data(com.fhir.types.fhir.Base64Binary) // optional {@link Attachment#data() data}
   *    .contentType(com.fhir.types.fhir.Code) // optional {@link Attachment#contentType() contentType}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Attachment#language() language}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Attachment#extension() extension}
   *    .creation(com.fhir.types.fhir.DateTime) // optional {@link Attachment#creation() creation}
   *    .build();
   * </pre>
   * @return A new Attachment builder
   */
  public static ImmutableAttachment.Builder builder() {
    return new ImmutableAttachment.Builder();
  }

  /**
   * Builds instances of type {@link Attachment Attachment}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Attachment", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SIZE = 0x1L;
    private static final long OPT_BIT_HASH = 0x2L;
    private static final long OPT_BIT_URL = 0x4L;
    private static final long OPT_BIT_TITLE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_DATA = 0x20L;
    private static final long OPT_BIT_CONTENT_TYPE = 0x40L;
    private static final long OPT_BIT_LANGUAGE = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private static final long OPT_BIT_CREATION = 0x200L;
    private long optBits;

    private @Nullable UnsignedInt size;
    private @Nullable Base64Binary hash;
    private @Nullable Url url;
    private @Nullable String title;
    private @Nullable String id;
    private @Nullable Base64Binary data;
    private @Nullable Code contentType;
    private @Nullable Code language;
    private @Nullable List<Extension> extension;
    private @Nullable DateTime creation;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Attachment#size() size} to size.
     * @param size The value for size
     * @return {@code this} builder for chained invocation
     */
    public final Builder size(UnsignedInt size) {
      checkNotIsSet(sizeIsSet(), "size");
      this.size = Objects.requireNonNull(size, "size");
      optBits |= OPT_BIT_SIZE;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#size() size} to size.
     * @param size The value for size
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("size")
    public final Builder size(Optional<? extends UnsignedInt> size) {
      checkNotIsSet(sizeIsSet(), "size");
      this.size = size.orElse(null);
      optBits |= OPT_BIT_SIZE;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#hash() hash} to hash.
     * @param hash The value for hash
     * @return {@code this} builder for chained invocation
     */
    public final Builder hash(Base64Binary hash) {
      checkNotIsSet(hashIsSet(), "hash");
      this.hash = Objects.requireNonNull(hash, "hash");
      optBits |= OPT_BIT_HASH;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#hash() hash} to hash.
     * @param hash The value for hash
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("hash")
    public final Builder hash(Optional<? extends Base64Binary> hash) {
      checkNotIsSet(hashIsSet(), "hash");
      this.hash = hash.orElse(null);
      optBits |= OPT_BIT_HASH;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(Url url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("url")
    public final Builder url(Optional<? extends Url> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("title")
    public final Builder title(Optional<String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#id() id} to id.
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
     * Initializes the optional value {@link Attachment#id() id} to id.
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
     * Initializes the optional value {@link Attachment#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for chained invocation
     */
    public final Builder data(Base64Binary data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = Objects.requireNonNull(data, "data");
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("data")
    public final Builder data(Optional<? extends Base64Binary> data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = data.orElse(null);
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for chained invocation
     */
    public final Builder contentType(Code contentType) {
      checkNotIsSet(contentTypeIsSet(), "contentType");
      this.contentType = Objects.requireNonNull(contentType, "contentType");
      optBits |= OPT_BIT_CONTENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contentType")
    public final Builder contentType(Optional<? extends Code> contentType) {
      checkNotIsSet(contentTypeIsSet(), "contentType");
      this.contentType = contentType.orElse(null);
      optBits |= OPT_BIT_CONTENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#extension() extension} to extension.
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
     * Initializes the optional value {@link Attachment#extension() extension} to extension.
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
     * Initializes the optional value {@link Attachment#creation() creation} to creation.
     * @param creation The value for creation
     * @return {@code this} builder for chained invocation
     */
    public final Builder creation(DateTime creation) {
      checkNotIsSet(creationIsSet(), "creation");
      this.creation = Objects.requireNonNull(creation, "creation");
      optBits |= OPT_BIT_CREATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#creation() creation} to creation.
     * @param creation The value for creation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("creation")
    public final Builder creation(Optional<? extends DateTime> creation) {
      checkNotIsSet(creationIsSet(), "creation");
      this.creation = creation.orElse(null);
      optBits |= OPT_BIT_CREATION;
      return this;
    }

    /**
     * Builds a new {@link Attachment Attachment}.
     * @return An immutable instance of Attachment
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Attachment build() {
      return new ImmutableAttachment(size, hash, url, title, id, data, contentType, language, extension, creation);
    }

    private boolean sizeIsSet() {
      return (optBits & OPT_BIT_SIZE) != 0;
    }

    private boolean hashIsSet() {
      return (optBits & OPT_BIT_HASH) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean dataIsSet() {
      return (optBits & OPT_BIT_DATA) != 0;
    }

    private boolean contentTypeIsSet() {
      return (optBits & OPT_BIT_CONTENT_TYPE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean creationIsSet() {
      return (optBits & OPT_BIT_CREATION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Attachment is strict, attribute is already set: ".concat(name));
    }
  }
}
