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
 * Immutable implementation of {@link Bundle_Search}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBundle_Search.builder()}.
 */
@Generated(from = "Bundle_Search", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBundle_Search implements Bundle_Search {
  private final @Nullable Decimal score;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Bundle_SearchMode mode;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;

  private ImmutableBundle_Search(
      @Nullable Decimal score,
      @Nullable List<Extension> modifierExtension,
      @Nullable Bundle_SearchMode mode,
      @Nullable List<Extension> extension,
      @Nullable String id) {
    this.score = score;
    this.modifierExtension = modifierExtension;
    this.mode = mode;
    this.extension = extension;
    this.id = id;
  }

  /**
   * @return The value of the {@code score} attribute
   */
  @JsonProperty("score")
  @Override
  public Optional<Decimal> score() {
    return Optional.ofNullable(score);
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
   * @return The value of the {@code mode} attribute
   */
  @JsonProperty("mode")
  @Override
  public Optional<Bundle_SearchMode> mode() {
    return Optional.ofNullable(mode);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Search#score() score} attribute.
   * @param value The value for score
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Search withScore(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "score");
    if (this.score == newValue) return this;
    return new ImmutableBundle_Search(newValue, this.modifierExtension, this.mode, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Search#score() score} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for score
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Search withScore(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.score == value) return this;
    return new ImmutableBundle_Search(value, this.modifierExtension, this.mode, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Search#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Search withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableBundle_Search(this.score, newValue, this.mode, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Search#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Search withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableBundle_Search(this.score, value, this.mode, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Search#mode() mode} attribute.
   * @param value The value for mode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Search withMode(Bundle_SearchMode value) {
    @Nullable Bundle_SearchMode newValue = Objects.requireNonNull(value, "mode");
    if (this.mode == newValue) return this;
    return new ImmutableBundle_Search(this.score, this.modifierExtension, newValue, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Search#mode() mode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Search withMode(Optional<? extends Bundle_SearchMode> optional) {
    @Nullable Bundle_SearchMode value = optional.orElse(null);
    if (this.mode == value) return this;
    return new ImmutableBundle_Search(this.score, this.modifierExtension, value, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Search#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Search withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableBundle_Search(this.score, this.modifierExtension, this.mode, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Search#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Search withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableBundle_Search(this.score, this.modifierExtension, this.mode, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Search#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Search withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableBundle_Search(this.score, this.modifierExtension, this.mode, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Search#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Search withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableBundle_Search(this.score, this.modifierExtension, this.mode, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBundle_Search} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBundle_Search
        && equalTo((ImmutableBundle_Search) another);
  }

  private boolean equalTo(ImmutableBundle_Search another) {
    return Objects.equals(score, another.score)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(mode, another.mode)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code score}, {@code modifierExtension}, {@code mode}, {@code extension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(score);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(mode);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Bundle_Search} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Bundle_Search{");
    if (score != null) {
      builder.append("score=").append(score);
    }
    if (modifierExtension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (mode != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("mode=").append(mode);
    }
    if (extension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Bundle_Search", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Bundle_Search {
    @Nullable Optional<Decimal> score = Optional.empty();
    boolean scoreIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Bundle_SearchMode> mode = Optional.empty();
    boolean modeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("score")
    public void setScore(Optional<Decimal> score) {
      this.score = score;
      this.scoreIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("mode")
    public void setMode(Optional<Bundle_SearchMode> mode) {
      this.mode = mode;
      this.modeIsSet = true;
    }
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
    @Override
    public Optional<Decimal> score() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Bundle_SearchMode> mode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableBundle_Search fromJson(Json json) {
    ImmutableBundle_Search.Builder builder = ImmutableBundle_Search.builder();
    if (json.scoreIsSet) {
      builder.score(json.score);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.modeIsSet) {
      builder.mode(json.mode);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableBundle_Search) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Bundle_Search} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Bundle_Search instance
   */
  public static Bundle_Search copyOf(Bundle_Search instance) {
    if (instance instanceof ImmutableBundle_Search) {
      return (ImmutableBundle_Search) instance;
    }
    return ImmutableBundle_Search.builder()
        .score(instance.score())
        .modifierExtension(instance.modifierExtension())
        .mode(instance.mode())
        .extension(instance.extension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Bundle_Search Bundle_Search}.
   * <pre>
   * ImmutableBundle_Search.builder()
   *    .score(com.fhir.types.fhir.Decimal) // optional {@link Bundle_Search#score() score}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Bundle_Search#modifierExtension() modifierExtension}
   *    .mode(Bundle_SearchMode) // optional {@link Bundle_Search#mode() mode}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Bundle_Search#extension() extension}
   *    .id(String) // optional {@link Bundle_Search#id() id}
   *    .build();
   * </pre>
   * @return A new Bundle_Search builder
   */
  public static ImmutableBundle_Search.Builder builder() {
    return new ImmutableBundle_Search.Builder();
  }

  /**
   * Builds instances of type {@link Bundle_Search Bundle_Search}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Bundle_Search", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SCORE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODE = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private long optBits;

    private @Nullable Decimal score;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Bundle_SearchMode mode;
    private @Nullable List<Extension> extension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Bundle_Search#score() score} to score.
     * @param score The value for score
     * @return {@code this} builder for chained invocation
     */
    public final Builder score(Decimal score) {
      checkNotIsSet(scoreIsSet(), "score");
      this.score = Objects.requireNonNull(score, "score");
      optBits |= OPT_BIT_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Search#score() score} to score.
     * @param score The value for score
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("score")
    public final Builder score(Optional<? extends Decimal> score) {
      checkNotIsSet(scoreIsSet(), "score");
      this.score = score.orElse(null);
      optBits |= OPT_BIT_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Search#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Bundle_Search#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Bundle_Search#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    public final Builder mode(Bundle_SearchMode mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = Objects.requireNonNull(mode, "mode");
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Search#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("mode")
    public final Builder mode(Optional<? extends Bundle_SearchMode> mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = mode.orElse(null);
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Search#extension() extension} to extension.
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
     * Initializes the optional value {@link Bundle_Search#extension() extension} to extension.
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
     * Initializes the optional value {@link Bundle_Search#id() id} to id.
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
     * Initializes the optional value {@link Bundle_Search#id() id} to id.
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
     * Builds a new {@link Bundle_Search Bundle_Search}.
     * @return An immutable instance of Bundle_Search
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Bundle_Search build() {
      return new ImmutableBundle_Search(score, modifierExtension, mode, extension, id);
    }

    private boolean scoreIsSet() {
      return (optBits & OPT_BIT_SCORE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean modeIsSet() {
      return (optBits & OPT_BIT_MODE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Bundle_Search is strict, attribute is already set: ".concat(name));
    }
  }
}
