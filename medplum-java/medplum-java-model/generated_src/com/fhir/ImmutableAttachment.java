//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Attachment}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAttachment.builder()}.
 */
@org.immutables.value.Generated(from = "Attachment", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAttachment implements com.fhir.Attachment {
  private final @javax.annotation.Nullable com.fhir.unsignedInt size;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable com.fhir.url url;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.code contentType;
  private final @javax.annotation.Nullable com.fhir.base64Binary hash;
  private final @javax.annotation.Nullable com.fhir.dateTime creation;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.base64Binary data;

  private ImmutableAttachment(
      @javax.annotation.Nullable com.fhir.unsignedInt size,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable com.fhir.url url,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.code contentType,
      @javax.annotation.Nullable com.fhir.base64Binary hash,
      @javax.annotation.Nullable com.fhir.dateTime creation,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.base64Binary data) {
    this.size = size;
    this.title = title;
    this.url = url;
    this.id = id;
    this.extension = extension;
    this.contentType = contentType;
    this.hash = hash;
    this.creation = creation;
    this.language = language;
    this.data = data;
  }

  /**
   * @return The value of the {@code size} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("size")
  @Override
  public java.util.Optional<com.fhir.unsignedInt> size() {
    return java.util.Optional.ofNullable(size);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  @Override
  public java.util.Optional<java.lang.String> title() {
    return java.util.Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.url> url() {
    return java.util.Optional.ofNullable(url);
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
   * @return The value of the {@code contentType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contentType")
  @Override
  public java.util.Optional<com.fhir.code> contentType() {
    return java.util.Optional.ofNullable(contentType);
  }

  /**
   * @return The value of the {@code hash} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("hash")
  @Override
  public java.util.Optional<com.fhir.base64Binary> hash() {
    return java.util.Optional.ofNullable(hash);
  }

  /**
   * @return The value of the {@code creation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("creation")
  @Override
  public java.util.Optional<com.fhir.dateTime> creation() {
    return java.util.Optional.ofNullable(creation);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code data} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("data")
  @Override
  public java.util.Optional<com.fhir.base64Binary> data() {
    return java.util.Optional.ofNullable(data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#size() size} attribute.
   * @param value The value for size
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withSize(com.fhir.unsignedInt value) {
    @javax.annotation.Nullable com.fhir.unsignedInt newValue = java.util.Objects.requireNonNull(value, "size");
    if (this.size == newValue) return this;
    return new ImmutableAttachment(
        newValue,
        this.title,
        this.url,
        this.id,
        this.extension,
        this.contentType,
        this.hash,
        this.creation,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#size() size} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for size
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAttachment withSize(java.util.Optional<? extends com.fhir.unsignedInt> optional) {
    @javax.annotation.Nullable com.fhir.unsignedInt value = optional.orElse(null);
    if (this.size == value) return this;
    return new ImmutableAttachment(
        value,
        this.title,
        this.url,
        this.id,
        this.extension,
        this.contentType,
        this.hash,
        this.creation,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableAttachment(
        this.size,
        newValue,
        this.url,
        this.id,
        this.extension,
        this.contentType,
        this.hash,
        this.creation,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableAttachment(
        this.size,
        value,
        this.url,
        this.id,
        this.extension,
        this.contentType,
        this.hash,
        this.creation,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withUrl(com.fhir.url value) {
    @javax.annotation.Nullable com.fhir.url newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableAttachment(
        this.size,
        this.title,
        newValue,
        this.id,
        this.extension,
        this.contentType,
        this.hash,
        this.creation,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAttachment withUrl(java.util.Optional<? extends com.fhir.url> optional) {
    @javax.annotation.Nullable com.fhir.url value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableAttachment(
        this.size,
        this.title,
        value,
        this.id,
        this.extension,
        this.contentType,
        this.hash,
        this.creation,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableAttachment(
        this.size,
        this.title,
        this.url,
        newValue,
        this.extension,
        this.contentType,
        this.hash,
        this.creation,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableAttachment(
        this.size,
        this.title,
        this.url,
        value,
        this.extension,
        this.contentType,
        this.hash,
        this.creation,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAttachment(
        this.size,
        this.title,
        this.url,
        this.id,
        newValue,
        this.contentType,
        this.hash,
        this.creation,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAttachment withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAttachment(
        this.size,
        this.title,
        this.url,
        this.id,
        value,
        this.contentType,
        this.hash,
        this.creation,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#contentType() contentType} attribute.
   * @param value The value for contentType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withContentType(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "contentType");
    if (this.contentType == newValue) return this;
    return new ImmutableAttachment(
        this.size,
        this.title,
        this.url,
        this.id,
        this.extension,
        newValue,
        this.hash,
        this.creation,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#contentType() contentType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAttachment withContentType(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.contentType == value) return this;
    return new ImmutableAttachment(
        this.size,
        this.title,
        this.url,
        this.id,
        this.extension,
        value,
        this.hash,
        this.creation,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#hash() hash} attribute.
   * @param value The value for hash
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withHash(com.fhir.base64Binary value) {
    @javax.annotation.Nullable com.fhir.base64Binary newValue = java.util.Objects.requireNonNull(value, "hash");
    if (this.hash == newValue) return this;
    return new ImmutableAttachment(
        this.size,
        this.title,
        this.url,
        this.id,
        this.extension,
        this.contentType,
        newValue,
        this.creation,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#hash() hash} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hash
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAttachment withHash(java.util.Optional<? extends com.fhir.base64Binary> optional) {
    @javax.annotation.Nullable com.fhir.base64Binary value = optional.orElse(null);
    if (this.hash == value) return this;
    return new ImmutableAttachment(
        this.size,
        this.title,
        this.url,
        this.id,
        this.extension,
        this.contentType,
        value,
        this.creation,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#creation() creation} attribute.
   * @param value The value for creation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withCreation(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "creation");
    if (this.creation == newValue) return this;
    return new ImmutableAttachment(
        this.size,
        this.title,
        this.url,
        this.id,
        this.extension,
        this.contentType,
        this.hash,
        newValue,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#creation() creation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for creation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAttachment withCreation(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.creation == value) return this;
    return new ImmutableAttachment(
        this.size,
        this.title,
        this.url,
        this.id,
        this.extension,
        this.contentType,
        this.hash,
        value,
        this.language,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableAttachment(
        this.size,
        this.title,
        this.url,
        this.id,
        this.extension,
        this.contentType,
        this.hash,
        this.creation,
        newValue,
        this.data);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAttachment withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableAttachment(
        this.size,
        this.title,
        this.url,
        this.id,
        this.extension,
        this.contentType,
        this.hash,
        this.creation,
        value,
        this.data);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Attachment#data() data} attribute.
   * @param value The value for data
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAttachment withData(com.fhir.base64Binary value) {
    @javax.annotation.Nullable com.fhir.base64Binary newValue = java.util.Objects.requireNonNull(value, "data");
    if (this.data == newValue) return this;
    return new ImmutableAttachment(
        this.size,
        this.title,
        this.url,
        this.id,
        this.extension,
        this.contentType,
        this.hash,
        this.creation,
        this.language,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Attachment#data() data} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for data
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAttachment withData(java.util.Optional<? extends com.fhir.base64Binary> optional) {
    @javax.annotation.Nullable com.fhir.base64Binary value = optional.orElse(null);
    if (this.data == value) return this;
    return new ImmutableAttachment(
        this.size,
        this.title,
        this.url,
        this.id,
        this.extension,
        this.contentType,
        this.hash,
        this.creation,
        this.language,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAttachment} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAttachment
        && equalTo((ImmutableAttachment) another);
  }

  private boolean equalTo(ImmutableAttachment another) {
    return java.util.Objects.equals(size, another.size)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(contentType, another.contentType)
        && java.util.Objects.equals(hash, another.hash)
        && java.util.Objects.equals(creation, another.creation)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(data, another.data);
  }

  /**
   * Computes a hash code from attributes: {@code size}, {@code title}, {@code url}, {@code id}, {@code extension}, {@code contentType}, {@code hash}, {@code creation}, {@code language}, {@code data}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(size);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(contentType);
    h += (h << 5) + java.util.Objects.hashCode(hash);
    h += (h << 5) + java.util.Objects.hashCode(creation);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(data);
    return h;
  }

  /**
   * Prints the immutable value {@code Attachment} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Attachment{");
    if (size != null) {
      builder.append("size=").append(size);
    }
    if (title != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (url != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (id != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (contentType != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("contentType=").append(contentType);
    }
    if (hash != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("hash=").append(hash);
    }
    if (creation != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("creation=").append(creation);
    }
    if (language != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (data != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("data=").append(data);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Attachment", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Attachment {
    @javax.annotation.Nullable java.util.Optional<com.fhir.unsignedInt> size = java.util.Optional.empty();
    boolean sizeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.url> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> contentType = java.util.Optional.empty();
    boolean contentTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.base64Binary> hash = java.util.Optional.empty();
    boolean hashIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> creation = java.util.Optional.empty();
    boolean creationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.base64Binary> data = java.util.Optional.empty();
    boolean dataIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    public void setSize(java.util.Optional<com.fhir.unsignedInt> size) {
      this.size = size;
      this.sizeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.url> url) {
      this.url = url;
      this.urlIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    public void setContentType(java.util.Optional<com.fhir.code> contentType) {
      this.contentType = contentType;
      this.contentTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("hash")
    public void setHash(java.util.Optional<com.fhir.base64Binary> hash) {
      this.hash = hash;
      this.hashIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("creation")
    public void setCreation(java.util.Optional<com.fhir.dateTime> creation) {
      this.creation = creation;
      this.creationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    public void setData(java.util.Optional<com.fhir.base64Binary> data) {
      this.data = data;
      this.dataIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.unsignedInt> size() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.url> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> contentType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.base64Binary> hash() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> creation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.base64Binary> data() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableAttachment fromJson(Json json) {
    ImmutableAttachment.Builder builder = ImmutableAttachment.builder();
    if (json.sizeIsSet) {
      builder.size(json.size);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.contentTypeIsSet) {
      builder.contentType(json.contentType);
    }
    if (json.hashIsSet) {
      builder.hash(json.hash);
    }
    if (json.creationIsSet) {
      builder.creation(json.creation);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.dataIsSet) {
      builder.data(json.data);
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
        .title(instance.title())
        .url(instance.url())
        .id(instance.id())
        .extension(instance.extension())
        .contentType(instance.contentType())
        .hash(instance.hash())
        .creation(instance.creation())
        .language(instance.language())
        .data(instance.data())
        .build();
  }

  /**
   * Creates a builder for {@link Attachment Attachment}.
   * <pre>
   * ImmutableAttachment.builder()
   *    .size(com.fhir.unsignedInt) // optional {@link Attachment#size() size}
   *    .title(String) // optional {@link Attachment#title() title}
   *    .url(com.fhir.url) // optional {@link Attachment#url() url}
   *    .id(String) // optional {@link Attachment#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Attachment#extension() extension}
   *    .contentType(com.fhir.code) // optional {@link Attachment#contentType() contentType}
   *    .hash(com.fhir.base64Binary) // optional {@link Attachment#hash() hash}
   *    .creation(com.fhir.dateTime) // optional {@link Attachment#creation() creation}
   *    .language(com.fhir.code) // optional {@link Attachment#language() language}
   *    .data(com.fhir.base64Binary) // optional {@link Attachment#data() data}
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
  @org.immutables.value.Generated(from = "Attachment", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SIZE = 0x1L;
    private static final long OPT_BIT_TITLE = 0x2L;
    private static final long OPT_BIT_URL = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_CONTENT_TYPE = 0x20L;
    private static final long OPT_BIT_HASH = 0x40L;
    private static final long OPT_BIT_CREATION = 0x80L;
    private static final long OPT_BIT_LANGUAGE = 0x100L;
    private static final long OPT_BIT_DATA = 0x200L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.unsignedInt size;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable com.fhir.url url;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.code contentType;
    private @javax.annotation.Nullable com.fhir.base64Binary hash;
    private @javax.annotation.Nullable com.fhir.dateTime creation;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.base64Binary data;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Attachment#size() size} to size.
     * @param size The value for size
     * @return {@code this} builder for chained invocation
     */
    public final Builder size(com.fhir.unsignedInt size) {
      checkNotIsSet(sizeIsSet(), "size");
      this.size = java.util.Objects.requireNonNull(size, "size");
      optBits |= OPT_BIT_SIZE;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#size() size} to size.
     * @param size The value for size
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    public final Builder size(java.util.Optional<? extends com.fhir.unsignedInt> size) {
      checkNotIsSet(sizeIsSet(), "size");
      this.size = size.orElse(null);
      optBits |= OPT_BIT_SIZE;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(java.lang.String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = java.util.Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public final Builder title(java.util.Optional<java.lang.String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(com.fhir.url url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = java.util.Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public final Builder url(java.util.Optional<? extends com.fhir.url> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#id() id} to id.
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
     * Initializes the optional value {@link Attachment#id() id} to id.
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
     * Initializes the optional value {@link Attachment#extension() extension} to extension.
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
     * Initializes the optional value {@link Attachment#extension() extension} to extension.
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
     * Initializes the optional value {@link Attachment#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for chained invocation
     */
    public final Builder contentType(com.fhir.code contentType) {
      checkNotIsSet(contentTypeIsSet(), "contentType");
      this.contentType = java.util.Objects.requireNonNull(contentType, "contentType");
      optBits |= OPT_BIT_CONTENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    public final Builder contentType(java.util.Optional<? extends com.fhir.code> contentType) {
      checkNotIsSet(contentTypeIsSet(), "contentType");
      this.contentType = contentType.orElse(null);
      optBits |= OPT_BIT_CONTENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#hash() hash} to hash.
     * @param hash The value for hash
     * @return {@code this} builder for chained invocation
     */
    public final Builder hash(com.fhir.base64Binary hash) {
      checkNotIsSet(hashIsSet(), "hash");
      this.hash = java.util.Objects.requireNonNull(hash, "hash");
      optBits |= OPT_BIT_HASH;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#hash() hash} to hash.
     * @param hash The value for hash
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hash")
    public final Builder hash(java.util.Optional<? extends com.fhir.base64Binary> hash) {
      checkNotIsSet(hashIsSet(), "hash");
      this.hash = hash.orElse(null);
      optBits |= OPT_BIT_HASH;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#creation() creation} to creation.
     * @param creation The value for creation
     * @return {@code this} builder for chained invocation
     */
    public final Builder creation(com.fhir.dateTime creation) {
      checkNotIsSet(creationIsSet(), "creation");
      this.creation = java.util.Objects.requireNonNull(creation, "creation");
      optBits |= OPT_BIT_CREATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#creation() creation} to creation.
     * @param creation The value for creation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("creation")
    public final Builder creation(java.util.Optional<? extends com.fhir.dateTime> creation) {
      checkNotIsSet(creationIsSet(), "creation");
      this.creation = creation.orElse(null);
      optBits |= OPT_BIT_CREATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for chained invocation
     */
    public final Builder data(com.fhir.base64Binary data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = java.util.Objects.requireNonNull(data, "data");
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Attachment#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    public final Builder data(java.util.Optional<? extends com.fhir.base64Binary> data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = data.orElse(null);
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Builds a new {@link Attachment Attachment}.
     * @return An immutable instance of Attachment
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Attachment build() {
      return new ImmutableAttachment(size, title, url, id, extension, contentType, hash, creation, language, data);
    }

    private boolean sizeIsSet() {
      return (optBits & OPT_BIT_SIZE) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean contentTypeIsSet() {
      return (optBits & OPT_BIT_CONTENT_TYPE) != 0;
    }

    private boolean hashIsSet() {
      return (optBits & OPT_BIT_HASH) != 0;
    }

    private boolean creationIsSet() {
      return (optBits & OPT_BIT_CREATION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean dataIsSet() {
      return (optBits & OPT_BIT_DATA) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Attachment is strict, attribute is already set: ".concat(name));
    }
  }
}
