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
 * Immutable implementation of {@link TerminologyCapabilities_Closure}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTerminologyCapabilities_Closure.builder()}.
 */
@Generated(from = "TerminologyCapabilities_Closure", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTerminologyCapabilities_Closure
    implements TerminologyCapabilities_Closure {
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean translation;

  private ImmutableTerminologyCapabilities_Closure(
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable Boolean translation) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.translation = translation;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code translation} attribute
   */
  @JsonProperty("translation")
  @Override
  public Optional<Boolean> translation() {
    return Optional.ofNullable(translation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Closure#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Closure withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTerminologyCapabilities_Closure(newValue, this.modifierExtension, this.extension, this.translation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Closure#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Closure withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTerminologyCapabilities_Closure(value, this.modifierExtension, this.extension, this.translation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Closure#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Closure withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTerminologyCapabilities_Closure(this.id, newValue, this.extension, this.translation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Closure#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_Closure withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTerminologyCapabilities_Closure(this.id, value, this.extension, this.translation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Closure#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Closure withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTerminologyCapabilities_Closure(this.id, this.modifierExtension, newValue, this.translation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Closure#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_Closure withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTerminologyCapabilities_Closure(this.id, this.modifierExtension, value, this.translation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Closure#translation() translation} attribute.
   * @param value The value for translation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Closure withTranslation(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.translation, newValue)) return this;
    return new ImmutableTerminologyCapabilities_Closure(this.id, this.modifierExtension, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Closure#translation() translation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for translation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Closure withTranslation(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.translation, value)) return this;
    return new ImmutableTerminologyCapabilities_Closure(this.id, this.modifierExtension, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTerminologyCapabilities_Closure} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTerminologyCapabilities_Closure
        && equalTo((ImmutableTerminologyCapabilities_Closure) another);
  }

  private boolean equalTo(ImmutableTerminologyCapabilities_Closure another) {
    return Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(translation, another.translation);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code extension}, {@code translation}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(translation);
    return h;
  }

  /**
   * Prints the immutable value {@code TerminologyCapabilities_Closure} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TerminologyCapabilities_Closure{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (translation != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("translation=").append(translation);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TerminologyCapabilities_Closure", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TerminologyCapabilities_Closure {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> translation = Optional.empty();
    boolean translationIsSet;
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
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("translation")
    public void setTranslation(Optional<Boolean> translation) {
      this.translation = translation;
      this.translationIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> translation() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTerminologyCapabilities_Closure fromJson(Json json) {
    ImmutableTerminologyCapabilities_Closure.Builder builder = ImmutableTerminologyCapabilities_Closure.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.translationIsSet) {
      builder.translation(json.translation);
    }
    return (ImmutableTerminologyCapabilities_Closure) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TerminologyCapabilities_Closure} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TerminologyCapabilities_Closure instance
   */
  public static TerminologyCapabilities_Closure copyOf(TerminologyCapabilities_Closure instance) {
    if (instance instanceof ImmutableTerminologyCapabilities_Closure) {
      return (ImmutableTerminologyCapabilities_Closure) instance;
    }
    return ImmutableTerminologyCapabilities_Closure.builder()
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .translation(instance.translation())
        .build();
  }

  /**
   * Creates a builder for {@link TerminologyCapabilities_Closure TerminologyCapabilities_Closure}.
   * <pre>
   * ImmutableTerminologyCapabilities_Closure.builder()
   *    .id(String) // optional {@link TerminologyCapabilities_Closure#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities_Closure#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities_Closure#extension() extension}
   *    .translation(Boolean) // optional {@link TerminologyCapabilities_Closure#translation() translation}
   *    .build();
   * </pre>
   * @return A new TerminologyCapabilities_Closure builder
   */
  public static ImmutableTerminologyCapabilities_Closure.Builder builder() {
    return new ImmutableTerminologyCapabilities_Closure.Builder();
  }

  /**
   * Builds instances of type {@link TerminologyCapabilities_Closure TerminologyCapabilities_Closure}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TerminologyCapabilities_Closure", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_TRANSLATION = 0x8L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean translation;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Closure#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities_Closure#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities_Closure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities_Closure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities_Closure#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities_Closure#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities_Closure#translation() translation} to translation.
     * @param translation The value for translation
     * @return {@code this} builder for chained invocation
     */
    public final Builder translation(boolean translation) {
      checkNotIsSet(translationIsSet(), "translation");
      this.translation = translation;
      optBits |= OPT_BIT_TRANSLATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Closure#translation() translation} to translation.
     * @param translation The value for translation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("translation")
    public final Builder translation(Optional<Boolean> translation) {
      checkNotIsSet(translationIsSet(), "translation");
      this.translation = translation.orElse(null);
      optBits |= OPT_BIT_TRANSLATION;
      return this;
    }

    /**
     * Builds a new {@link TerminologyCapabilities_Closure TerminologyCapabilities_Closure}.
     * @return An immutable instance of TerminologyCapabilities_Closure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TerminologyCapabilities_Closure build() {
      return new ImmutableTerminologyCapabilities_Closure(id, modifierExtension, extension, translation);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean translationIsSet() {
      return (optBits & OPT_BIT_TRANSLATION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TerminologyCapabilities_Closure is strict, attribute is already set: ".concat(name));
    }
  }
}
