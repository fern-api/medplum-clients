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
 * Immutable implementation of {@link CodeSystem_Designation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCodeSystem_Designation.builder()}.
 */
@Generated(from = "CodeSystem_Designation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCodeSystem_Designation implements CodeSystem_Designation {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String value;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code language;
  private final @Nullable Coding use;

  private ImmutableCodeSystem_Designation(
      @Nullable List<Extension> modifierExtension,
      @Nullable String value,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Code language,
      @Nullable Coding use) {
    this.modifierExtension = modifierExtension;
    this.value = value;
    this.id = id;
    this.extension = extension;
    this.language = language;
    this.use = use;
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
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<String> value() {
    return Optional.ofNullable(value);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @JsonProperty("use")
  @Override
  public Optional<Coding> use() {
    return Optional.ofNullable(use);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Designation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Designation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCodeSystem_Designation(newValue, this.value, this.id, this.extension, this.language, this.use);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Designation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Designation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCodeSystem_Designation(value, this.value, this.id, this.extension, this.language, this.use);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Designation#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Designation withValue(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "value");
    if (Objects.equals(this.value, newValue)) return this;
    return new ImmutableCodeSystem_Designation(this.modifierExtension, newValue, this.id, this.extension, this.language, this.use);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Designation#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Designation withValue(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.value, value)) return this;
    return new ImmutableCodeSystem_Designation(this.modifierExtension, value, this.id, this.extension, this.language, this.use);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Designation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Designation withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCodeSystem_Designation(this.modifierExtension, this.value, newValue, this.extension, this.language, this.use);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Designation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Designation withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCodeSystem_Designation(this.modifierExtension, this.value, value, this.extension, this.language, this.use);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Designation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Designation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCodeSystem_Designation(this.modifierExtension, this.value, this.id, newValue, this.language, this.use);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Designation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Designation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCodeSystem_Designation(this.modifierExtension, this.value, this.id, value, this.language, this.use);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Designation#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Designation withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCodeSystem_Designation(this.modifierExtension, this.value, this.id, this.extension, newValue, this.use);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Designation#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Designation withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCodeSystem_Designation(this.modifierExtension, this.value, this.id, this.extension, value, this.use);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Designation#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Designation withUse(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableCodeSystem_Designation(this.modifierExtension, this.value, this.id, this.extension, this.language, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Designation#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Designation withUse(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableCodeSystem_Designation(this.modifierExtension, this.value, this.id, this.extension, this.language, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCodeSystem_Designation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCodeSystem_Designation
        && equalTo((ImmutableCodeSystem_Designation) another);
  }

  private boolean equalTo(ImmutableCodeSystem_Designation another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(value, another.value)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(language, another.language)
        && Objects.equals(use, another.use);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code value}, {@code id}, {@code extension}, {@code language}, {@code use}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(use);
    return h;
  }

  /**
   * Prints the immutable value {@code CodeSystem_Designation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CodeSystem_Designation{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (value != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (language != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (use != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("use=").append(use);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CodeSystem_Designation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CodeSystem_Designation {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Coding> use = Optional.empty();
    boolean useIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<String> value) {
      this.value = value;
      this.valueIsSet = true;
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
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("use")
    public void setUse(Optional<Coding> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> use() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCodeSystem_Designation fromJson(Json json) {
    ImmutableCodeSystem_Designation.Builder builder = ImmutableCodeSystem_Designation.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    return (ImmutableCodeSystem_Designation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CodeSystem_Designation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CodeSystem_Designation instance
   */
  public static CodeSystem_Designation copyOf(CodeSystem_Designation instance) {
    if (instance instanceof ImmutableCodeSystem_Designation) {
      return (ImmutableCodeSystem_Designation) instance;
    }
    return ImmutableCodeSystem_Designation.builder()
        .modifierExtension(instance.modifierExtension())
        .value(instance.value())
        .id(instance.id())
        .extension(instance.extension())
        .language(instance.language())
        .use(instance.use())
        .build();
  }

  /**
   * Creates a builder for {@link CodeSystem_Designation CodeSystem_Designation}.
   * <pre>
   * ImmutableCodeSystem_Designation.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CodeSystem_Designation#modifierExtension() modifierExtension}
   *    .value(String) // optional {@link CodeSystem_Designation#value() value}
   *    .id(String) // optional {@link CodeSystem_Designation#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CodeSystem_Designation#extension() extension}
   *    .language(com.fhir.types.fhir.Code) // optional {@link CodeSystem_Designation#language() language}
   *    .use(com.fhir.types.fhir.Coding) // optional {@link CodeSystem_Designation#use() use}
   *    .build();
   * </pre>
   * @return A new CodeSystem_Designation builder
   */
  public static ImmutableCodeSystem_Designation.Builder builder() {
    return new ImmutableCodeSystem_Designation.Builder();
  }

  /**
   * Builds instances of type {@link CodeSystem_Designation CodeSystem_Designation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CodeSystem_Designation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_VALUE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_LANGUAGE = 0x10L;
    private static final long OPT_BIT_USE = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String value;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Code language;
    private @Nullable Coding use;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CodeSystem_Designation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem_Designation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem_Designation#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(String value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Designation#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<String> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Designation#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem_Designation#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem_Designation#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem_Designation#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem_Designation#language() language} to language.
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
     * Initializes the optional value {@link CodeSystem_Designation#language() language} to language.
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
     * Initializes the optional value {@link CodeSystem_Designation#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(Coding use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Designation#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("use")
    public final Builder use(Optional<? extends Coding> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Builds a new {@link CodeSystem_Designation CodeSystem_Designation}.
     * @return An immutable instance of CodeSystem_Designation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CodeSystem_Designation build() {
      return new ImmutableCodeSystem_Designation(modifierExtension, value, id, extension, language, use);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CodeSystem_Designation is strict, attribute is already set: ".concat(name));
    }
  }
}
