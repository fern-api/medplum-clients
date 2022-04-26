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
 * Immutable implementation of {@link Annotation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAnnotation.builder()}.
 */
@Generated(from = "Annotation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAnnotation implements Annotation {
  private final @Nullable DateTime time;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable String authorString;
  private final @Nullable Markdown text;
  private final @Nullable Reference authorReference;

  private ImmutableAnnotation(
      @Nullable DateTime time,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable String authorString,
      @Nullable Markdown text,
      @Nullable Reference authorReference) {
    this.time = time;
    this.id = id;
    this.extension = extension;
    this.authorString = authorString;
    this.text = text;
    this.authorReference = authorReference;
  }

  /**
   * @return The value of the {@code time} attribute
   */
  @JsonProperty("time")
  @Override
  public Optional<DateTime> time() {
    return Optional.ofNullable(time);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code authorString} attribute
   */
  @JsonProperty("authorString")
  @Override
  public Optional<String> authorString() {
    return Optional.ofNullable(authorString);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Markdown> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code authorReference} attribute
   */
  @JsonProperty("authorReference")
  @Override
  public Optional<Reference> authorReference() {
    return Optional.ofNullable(authorReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Annotation#time() time} attribute.
   * @param value The value for time
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnnotation withTime(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "time");
    if (this.time == newValue) return this;
    return new ImmutableAnnotation(newValue, this.id, this.extension, this.authorString, this.text, this.authorReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Annotation#time() time} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for time
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAnnotation withTime(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.time == value) return this;
    return new ImmutableAnnotation(value, this.id, this.extension, this.authorString, this.text, this.authorReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Annotation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnnotation withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAnnotation(this.time, newValue, this.extension, this.authorString, this.text, this.authorReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Annotation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnnotation withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAnnotation(this.time, value, this.extension, this.authorString, this.text, this.authorReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Annotation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnnotation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAnnotation(this.time, this.id, newValue, this.authorString, this.text, this.authorReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Annotation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAnnotation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAnnotation(this.time, this.id, value, this.authorString, this.text, this.authorReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Annotation#authorString() authorString} attribute.
   * @param value The value for authorString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnnotation withAuthorString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "authorString");
    if (Objects.equals(this.authorString, newValue)) return this;
    return new ImmutableAnnotation(this.time, this.id, this.extension, newValue, this.text, this.authorReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Annotation#authorString() authorString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authorString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnnotation withAuthorString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.authorString, value)) return this;
    return new ImmutableAnnotation(this.time, this.id, this.extension, value, this.text, this.authorReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Annotation#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnnotation withText(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableAnnotation(this.time, this.id, this.extension, this.authorString, newValue, this.authorReference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Annotation#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAnnotation withText(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableAnnotation(this.time, this.id, this.extension, this.authorString, value, this.authorReference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Annotation#authorReference() authorReference} attribute.
   * @param value The value for authorReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAnnotation withAuthorReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "authorReference");
    if (this.authorReference == newValue) return this;
    return new ImmutableAnnotation(this.time, this.id, this.extension, this.authorString, this.text, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Annotation#authorReference() authorReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authorReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAnnotation withAuthorReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.authorReference == value) return this;
    return new ImmutableAnnotation(this.time, this.id, this.extension, this.authorString, this.text, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAnnotation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAnnotation
        && equalTo((ImmutableAnnotation) another);
  }

  private boolean equalTo(ImmutableAnnotation another) {
    return Objects.equals(time, another.time)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(authorString, another.authorString)
        && Objects.equals(text, another.text)
        && Objects.equals(authorReference, another.authorReference);
  }

  /**
   * Computes a hash code from attributes: {@code time}, {@code id}, {@code extension}, {@code authorString}, {@code text}, {@code authorReference}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(time);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(authorString);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(authorReference);
    return h;
  }

  /**
   * Prints the immutable value {@code Annotation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Annotation{");
    if (time != null) {
      builder.append("time=").append(time);
    }
    if (id != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (authorString != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("authorString=").append(authorString);
    }
    if (text != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (authorReference != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("authorReference=").append(authorReference);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Annotation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Annotation {
    @Nullable Optional<DateTime> time = Optional.empty();
    boolean timeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> authorString = Optional.empty();
    boolean authorStringIsSet;
    @Nullable Optional<Markdown> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Reference> authorReference = Optional.empty();
    boolean authorReferenceIsSet;
    @JsonProperty("time")
    public void setTime(Optional<DateTime> time) {
      this.time = time;
      this.timeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("authorString")
    public void setAuthorString(Optional<String> authorString) {
      this.authorString = authorString;
      this.authorStringIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Markdown> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("authorReference")
    public void setAuthorReference(Optional<Reference> authorReference) {
      this.authorReference = authorReference;
      this.authorReferenceIsSet = true;
    }
    @Override
    public Optional<DateTime> time() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> authorString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> authorReference() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAnnotation fromJson(Json json) {
    ImmutableAnnotation.Builder builder = ImmutableAnnotation.builder();
    if (json.timeIsSet) {
      builder.time(json.time);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.authorStringIsSet) {
      builder.authorString(json.authorString);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.authorReferenceIsSet) {
      builder.authorReference(json.authorReference);
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
        .time(instance.time())
        .id(instance.id())
        .extension(instance.extension())
        .authorString(instance.authorString())
        .text(instance.text())
        .authorReference(instance.authorReference())
        .build();
  }

  /**
   * Creates a builder for {@link Annotation Annotation}.
   * <pre>
   * ImmutableAnnotation.builder()
   *    .time(com.fhir.types.fhir.DateTime) // optional {@link Annotation#time() time}
   *    .id(String) // optional {@link Annotation#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Annotation#extension() extension}
   *    .authorString(String) // optional {@link Annotation#authorString() authorString}
   *    .text(com.fhir.types.fhir.Markdown) // optional {@link Annotation#text() text}
   *    .authorReference(com.fhir.types.fhir.Reference) // optional {@link Annotation#authorReference() authorReference}
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
  @Generated(from = "Annotation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TIME = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_AUTHOR_STRING = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_AUTHOR_REFERENCE = 0x20L;
    private long optBits;

    private @Nullable DateTime time;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable String authorString;
    private @Nullable Markdown text;
    private @Nullable Reference authorReference;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Annotation#time() time} to time.
     * @param time The value for time
     * @return {@code this} builder for chained invocation
     */
    public final Builder time(DateTime time) {
      checkNotIsSet(timeIsSet(), "time");
      this.time = Objects.requireNonNull(time, "time");
      optBits |= OPT_BIT_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Annotation#time() time} to time.
     * @param time The value for time
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("time")
    public final Builder time(Optional<? extends DateTime> time) {
      checkNotIsSet(timeIsSet(), "time");
      this.time = time.orElse(null);
      optBits |= OPT_BIT_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Annotation#id() id} to id.
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
     * Initializes the optional value {@link Annotation#id() id} to id.
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
     * Initializes the optional value {@link Annotation#extension() extension} to extension.
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
     * Initializes the optional value {@link Annotation#extension() extension} to extension.
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
     * Initializes the optional value {@link Annotation#authorString() authorString} to authorString.
     * @param authorString The value for authorString
     * @return {@code this} builder for chained invocation
     */
    public final Builder authorString(String authorString) {
      checkNotIsSet(authorStringIsSet(), "authorString");
      this.authorString = Objects.requireNonNull(authorString, "authorString");
      optBits |= OPT_BIT_AUTHOR_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Annotation#authorString() authorString} to authorString.
     * @param authorString The value for authorString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authorString")
    public final Builder authorString(Optional<String> authorString) {
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
    public final Builder text(Markdown text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Annotation#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<? extends Markdown> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Annotation#authorReference() authorReference} to authorReference.
     * @param authorReference The value for authorReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder authorReference(Reference authorReference) {
      checkNotIsSet(authorReferenceIsSet(), "authorReference");
      this.authorReference = Objects.requireNonNull(authorReference, "authorReference");
      optBits |= OPT_BIT_AUTHOR_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Annotation#authorReference() authorReference} to authorReference.
     * @param authorReference The value for authorReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authorReference")
    public final Builder authorReference(Optional<? extends Reference> authorReference) {
      checkNotIsSet(authorReferenceIsSet(), "authorReference");
      this.authorReference = authorReference.orElse(null);
      optBits |= OPT_BIT_AUTHOR_REFERENCE;
      return this;
    }

    /**
     * Builds a new {@link Annotation Annotation}.
     * @return An immutable instance of Annotation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Annotation build() {
      return new ImmutableAnnotation(time, id, extension, authorString, text, authorReference);
    }

    private boolean timeIsSet() {
      return (optBits & OPT_BIT_TIME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean authorStringIsSet() {
      return (optBits & OPT_BIT_AUTHOR_STRING) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean authorReferenceIsSet() {
      return (optBits & OPT_BIT_AUTHOR_REFERENCE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Annotation is strict, attribute is already set: ".concat(name));
    }
  }
}
