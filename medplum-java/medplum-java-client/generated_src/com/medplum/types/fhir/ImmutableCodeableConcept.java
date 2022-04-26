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
 * Immutable implementation of {@link CodeableConcept}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCodeableConcept.builder()}.
 */
@Generated(from = "CodeableConcept", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCodeableConcept implements CodeableConcept {
  private final @Nullable List<Coding> coding;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable String text;

  private ImmutableCodeableConcept(
      @Nullable List<Coding> coding,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable String text) {
    this.coding = coding;
    this.id = id;
    this.extension = extension;
    this.text = text;
  }

  /**
   * @return The value of the {@code coding} attribute
   */
  @JsonProperty("coding")
  @Override
  public Optional<List<Coding>> coding() {
    return Optional.ofNullable(coding);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<String> text() {
    return Optional.ofNullable(text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeableConcept#coding() coding} attribute.
   * @param value The value for coding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeableConcept withCoding(List<Coding> value) {
    @Nullable List<Coding> newValue = Objects.requireNonNull(value, "coding");
    if (this.coding == newValue) return this;
    return new ImmutableCodeableConcept(newValue, this.id, this.extension, this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeableConcept#coding() coding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for coding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeableConcept withCoding(Optional<? extends List<Coding>> optional) {
    @Nullable List<Coding> value = optional.orElse(null);
    if (this.coding == value) return this;
    return new ImmutableCodeableConcept(value, this.id, this.extension, this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeableConcept#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeableConcept withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCodeableConcept(this.coding, newValue, this.extension, this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeableConcept#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeableConcept withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCodeableConcept(this.coding, value, this.extension, this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeableConcept#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeableConcept withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCodeableConcept(this.coding, this.id, newValue, this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeableConcept#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeableConcept withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCodeableConcept(this.coding, this.id, value, this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeableConcept#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeableConcept withText(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "text");
    if (Objects.equals(this.text, newValue)) return this;
    return new ImmutableCodeableConcept(this.coding, this.id, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeableConcept#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeableConcept withText(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.text, value)) return this;
    return new ImmutableCodeableConcept(this.coding, this.id, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCodeableConcept} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCodeableConcept
        && equalTo((ImmutableCodeableConcept) another);
  }

  private boolean equalTo(ImmutableCodeableConcept another) {
    return Objects.equals(coding, another.coding)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(text, another.text);
  }

  /**
   * Computes a hash code from attributes: {@code coding}, {@code id}, {@code extension}, {@code text}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(coding);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(text);
    return h;
  }

  /**
   * Prints the immutable value {@code CodeableConcept} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CodeableConcept{");
    if (coding != null) {
      builder.append("coding=").append(coding);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (text != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("text=").append(text);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CodeableConcept", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CodeableConcept {
    @Nullable Optional<List<Coding>> coding = Optional.empty();
    boolean codingIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> text = Optional.empty();
    boolean textIsSet;
    @JsonProperty("coding")
    public void setCoding(Optional<List<Coding>> coding) {
      this.coding = coding;
      this.codingIsSet = true;
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
    @JsonProperty("text")
    public void setText(Optional<String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @Override
    public Optional<List<Coding>> coding() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> text() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCodeableConcept fromJson(Json json) {
    ImmutableCodeableConcept.Builder builder = ImmutableCodeableConcept.builder();
    if (json.codingIsSet) {
      builder.coding(json.coding);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    return (ImmutableCodeableConcept) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CodeableConcept} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CodeableConcept instance
   */
  public static CodeableConcept copyOf(CodeableConcept instance) {
    if (instance instanceof ImmutableCodeableConcept) {
      return (ImmutableCodeableConcept) instance;
    }
    return ImmutableCodeableConcept.builder()
        .coding(instance.coding())
        .id(instance.id())
        .extension(instance.extension())
        .text(instance.text())
        .build();
  }

  /**
   * Creates a builder for {@link CodeableConcept CodeableConcept}.
   * <pre>
   * ImmutableCodeableConcept.builder()
   *    .coding(List&amp;lt;com.medplum.types.fhir.Coding&amp;gt;) // optional {@link CodeableConcept#coding() coding}
   *    .id(String) // optional {@link CodeableConcept#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CodeableConcept#extension() extension}
   *    .text(String) // optional {@link CodeableConcept#text() text}
   *    .build();
   * </pre>
   * @return A new CodeableConcept builder
   */
  public static ImmutableCodeableConcept.Builder builder() {
    return new ImmutableCodeableConcept.Builder();
  }

  /**
   * Builds instances of type {@link CodeableConcept CodeableConcept}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CodeableConcept", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_CODING = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_TEXT = 0x8L;
    private long optBits;

    private @Nullable List<Coding> coding;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable String text;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CodeableConcept#coding() coding} to coding.
     * @param coding The value for coding
     * @return {@code this} builder for chained invocation
     */
    public final Builder coding(List<Coding> coding) {
      checkNotIsSet(codingIsSet(), "coding");
      this.coding = Objects.requireNonNull(coding, "coding");
      optBits |= OPT_BIT_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeableConcept#coding() coding} to coding.
     * @param coding The value for coding
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("coding")
    public final Builder coding(Optional<? extends List<Coding>> coding) {
      checkNotIsSet(codingIsSet(), "coding");
      this.coding = coding.orElse(null);
      optBits |= OPT_BIT_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeableConcept#id() id} to id.
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
     * Initializes the optional value {@link CodeableConcept#id() id} to id.
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
     * Initializes the optional value {@link CodeableConcept#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeableConcept#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeableConcept#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(String text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeableConcept#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<String> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Builds a new {@link CodeableConcept CodeableConcept}.
     * @return An immutable instance of CodeableConcept
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CodeableConcept build() {
      return new ImmutableCodeableConcept(coding, id, extension, text);
    }

    private boolean codingIsSet() {
      return (optBits & OPT_BIT_CODING) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CodeableConcept is strict, attribute is already set: ".concat(name));
    }
  }
}
