//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Annotation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAnnotation.builder()}.
 */
@org.immutables.value.Generated(from = "Annotation", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAnnotation implements com.fhir.Annotation {
  private final @javax.annotation.Nullable com.fhir.Reference authorReference;
  private final @javax.annotation.Nullable java.lang.String authorString;
  private final @javax.annotation.Nullable com.fhir.markdown text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.dateTime time;

  private ImmutableAnnotation(
      @javax.annotation.Nullable com.fhir.Reference authorReference,
      @javax.annotation.Nullable java.lang.String authorString,
      @javax.annotation.Nullable com.fhir.markdown text,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.dateTime time) {
    this.authorReference = authorReference;
    this.authorString = authorString;
    this.text = text;
    this.extension = extension;
    this.id = id;
    this.time = time;
  }

  /**
   * @return The value of the {@code authorReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authorReference")
  @Override
  public java.util.Optional<com.fhir.Reference> authorReference() {
    return java.util.Optional.ofNullable(authorReference);
  }

  /**
   * @return The value of the {@code authorString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authorString")
  @Override
  public java.util.Optional<java.lang.String> authorString() {
    return java.util.Optional.ofNullable(authorString);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.markdown> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code time} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("time")
  @Override
  public java.util.Optional<com.fhir.dateTime> time() {
    return java.util.Optional.ofNullable(time);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Annotation#authorReference() authorReference} attribute.
   * @param value The value for authorReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnnotation withAuthorReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "authorReference");
    if (this.authorReference == newValue) return this;
    return new ImmutableAnnotation(newValue, this.authorString, this.text, this.extension, this.id, this.time);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Annotation#authorReference() authorReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authorReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAnnotation withAuthorReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.authorReference == value) return this;
    return new ImmutableAnnotation(value, this.authorString, this.text, this.extension, this.id, this.time);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Annotation#authorString() authorString} attribute.
   * @param value The value for authorString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnnotation withAuthorString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "authorString");
    if (java.util.Objects.equals(this.authorString, newValue)) return this;
    return new ImmutableAnnotation(this.authorReference, newValue, this.text, this.extension, this.id, this.time);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Annotation#authorString() authorString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authorString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnnotation withAuthorString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.authorString, value)) return this;
    return new ImmutableAnnotation(this.authorReference, value, this.text, this.extension, this.id, this.time);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Annotation#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnnotation withText(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableAnnotation(this.authorReference, this.authorString, newValue, this.extension, this.id, this.time);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Annotation#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAnnotation withText(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableAnnotation(this.authorReference, this.authorString, value, this.extension, this.id, this.time);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Annotation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnnotation withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAnnotation(this.authorReference, this.authorString, this.text, newValue, this.id, this.time);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Annotation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAnnotation withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAnnotation(this.authorReference, this.authorString, this.text, value, this.id, this.time);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Annotation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnnotation withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableAnnotation(this.authorReference, this.authorString, this.text, this.extension, newValue, this.time);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Annotation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnnotation withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableAnnotation(this.authorReference, this.authorString, this.text, this.extension, value, this.time);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Annotation#time() time} attribute.
   * @param value The value for time
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnnotation withTime(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "time");
    if (this.time == newValue) return this;
    return new ImmutableAnnotation(this.authorReference, this.authorString, this.text, this.extension, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Annotation#time() time} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for time
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAnnotation withTime(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.time == value) return this;
    return new ImmutableAnnotation(this.authorReference, this.authorString, this.text, this.extension, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAnnotation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAnnotation
        && equalTo((ImmutableAnnotation) another);
  }

  private boolean equalTo(ImmutableAnnotation another) {
    return java.util.Objects.equals(authorReference, another.authorReference)
        && java.util.Objects.equals(authorString, another.authorString)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(time, another.time);
  }

  /**
   * Computes a hash code from attributes: {@code authorReference}, {@code authorString}, {@code text}, {@code extension}, {@code id}, {@code time}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(authorReference);
    h += (h << 5) + java.util.Objects.hashCode(authorString);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(time);
    return h;
  }

  /**
   * Prints the immutable value {@code Annotation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Annotation{");
    if (authorReference != null) {
      builder.append("authorReference=").append(authorReference);
    }
    if (authorString != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("authorString=").append(authorString);
    }
    if (text != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (extension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (time != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("time=").append(time);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Annotation", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Annotation {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> authorReference = java.util.Optional.empty();
    boolean authorReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> authorString = java.util.Optional.empty();
    boolean authorStringIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> time = java.util.Optional.empty();
    boolean timeIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("authorReference")
    public void setAuthorReference(java.util.Optional<com.fhir.Reference> authorReference) {
      this.authorReference = authorReference;
      this.authorReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authorString")
    public void setAuthorString(java.util.Optional<java.lang.String> authorString) {
      this.authorString = authorString;
      this.authorStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.markdown> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("time")
    public void setTime(java.util.Optional<com.fhir.dateTime> time) {
      this.time = time;
      this.timeIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Reference> authorReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> authorString() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> time() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableAnnotation fromJson(Json json) {
    ImmutableAnnotation.Builder builder = ImmutableAnnotation.builder();
    if (json.authorReferenceIsSet) {
      builder.authorReference(json.authorReference);
    }
    if (json.authorStringIsSet) {
      builder.authorString(json.authorString);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.timeIsSet) {
      builder.time(json.time);
    }
    return (ImmutableAnnotation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Annotation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Annotation instance
   */
  public static Annotation copyOf(Annotation instance) {
    if (instance instanceof ImmutableAnnotation) {
      return (ImmutableAnnotation) instance;
    }
    return ImmutableAnnotation.builder()
        .authorReference(instance.authorReference())
        .authorString(instance.authorString())
        .text(instance.text())
        .extension(instance.extension())
        .id(instance.id())
        .time(instance.time())
        .build();
  }

  /**
   * Creates a builder for {@link Annotation Annotation}.
   * <pre>
   * ImmutableAnnotation.builder()
   *    .authorReference(com.fhir.Reference) // optional {@link Annotation#authorReference() authorReference}
   *    .authorString(String) // optional {@link Annotation#authorString() authorString}
   *    .text(com.fhir.markdown) // optional {@link Annotation#text() text}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Annotation#extension() extension}
   *    .id(String) // optional {@link Annotation#id() id}
   *    .time(com.fhir.dateTime) // optional {@link Annotation#time() time}
   *    .build();
   * </pre>
   * @return A new Annotation builder
   */
  public static ImmutableAnnotation.Builder builder() {
    return new ImmutableAnnotation.Builder();
  }

  /**
   * Builds instances of type {@link Annotation Annotation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Annotation", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_AUTHOR_REFERENCE = 0x1L;
    private static final long OPT_BIT_AUTHOR_STRING = 0x2L;
    private static final long OPT_BIT_TEXT = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_TIME = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Reference authorReference;
    private @javax.annotation.Nullable java.lang.String authorString;
    private @javax.annotation.Nullable com.fhir.markdown text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.dateTime time;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Annotation#authorReference() authorReference} to authorReference.
     * @param authorReference The value for authorReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder authorReference(com.fhir.Reference authorReference) {
      checkNotIsSet(authorReferenceIsSet(), "authorReference");
      this.authorReference = java.util.Objects.requireNonNull(authorReference, "authorReference");
      optBits |= OPT_BIT_AUTHOR_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Annotation#authorReference() authorReference} to authorReference.
     * @param authorReference The value for authorReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authorReference")
    public final Builder authorReference(java.util.Optional<? extends com.fhir.Reference> authorReference) {
      checkNotIsSet(authorReferenceIsSet(), "authorReference");
      this.authorReference = authorReference.orElse(null);
      optBits |= OPT_BIT_AUTHOR_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Annotation#authorString() authorString} to authorString.
     * @param authorString The value for authorString
     * @return {@code this} builder for chained invocation
     */
    public final Builder authorString(java.lang.String authorString) {
      checkNotIsSet(authorStringIsSet(), "authorString");
      this.authorString = java.util.Objects.requireNonNull(authorString, "authorString");
      optBits |= OPT_BIT_AUTHOR_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Annotation#authorString() authorString} to authorString.
     * @param authorString The value for authorString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authorString")
    public final Builder authorString(java.util.Optional<java.lang.String> authorString) {
      checkNotIsSet(authorStringIsSet(), "authorString");
      this.authorString = authorString.orElse(null);
      optBits |= OPT_BIT_AUTHOR_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Annotation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(com.fhir.markdown text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Annotation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public final Builder text(java.util.Optional<? extends com.fhir.markdown> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Annotation#extension() extension} to extension.
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
     * Initializes the optional value {@link Annotation#extension() extension} to extension.
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
     * Initializes the optional value {@link Annotation#id() id} to id.
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
     * Initializes the optional value {@link Annotation#id() id} to id.
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
     * Initializes the optional value {@link Annotation#time() time} to time.
     * @param time The value for time
     * @return {@code this} builder for chained invocation
     */
    public final Builder time(com.fhir.dateTime time) {
      checkNotIsSet(timeIsSet(), "time");
      this.time = java.util.Objects.requireNonNull(time, "time");
      optBits |= OPT_BIT_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Annotation#time() time} to time.
     * @param time The value for time
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("time")
    public final Builder time(java.util.Optional<? extends com.fhir.dateTime> time) {
      checkNotIsSet(timeIsSet(), "time");
      this.time = time.orElse(null);
      optBits |= OPT_BIT_TIME;
      return this;
    }

    /**
     * Builds a new {@link Annotation Annotation}.
     * @return An immutable instance of Annotation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Annotation build() {
      return new ImmutableAnnotation(authorReference, authorString, text, extension, id, time);
    }

    private boolean authorReferenceIsSet() {
      return (optBits & OPT_BIT_AUTHOR_REFERENCE) != 0;
    }

    private boolean authorStringIsSet() {
      return (optBits & OPT_BIT_AUTHOR_STRING) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean timeIsSet() {
      return (optBits & OPT_BIT_TIME) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Annotation is strict, attribute is already set: ".concat(name));
    }
  }
}
