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
 * Immutable implementation of {@link TerminologyCapabilities_ValidateCode}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTerminologyCapabilities_ValidateCode.builder()}.
 */
@Generated(from = "TerminologyCapabilities_ValidateCode", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTerminologyCapabilities_ValidateCode
    implements TerminologyCapabilities_ValidateCode {
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean translations;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableTerminologyCapabilities_ValidateCode(
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Boolean translations,
      @Nullable List<Extension> modifierExtension) {
    this.id = id;
    this.extension = extension;
    this.translations = translations;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code translations} attribute
   */
  @JsonProperty("translations")
  @Override
  public Optional<Boolean> translations() {
    return Optional.ofNullable(translations);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_ValidateCode#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_ValidateCode withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTerminologyCapabilities_ValidateCode(newValue, this.extension, this.translations, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_ValidateCode#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_ValidateCode withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTerminologyCapabilities_ValidateCode(value, this.extension, this.translations, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_ValidateCode#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_ValidateCode withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTerminologyCapabilities_ValidateCode(this.id, newValue, this.translations, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_ValidateCode#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_ValidateCode withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTerminologyCapabilities_ValidateCode(this.id, value, this.translations, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_ValidateCode#translations() translations} attribute.
   * @param value The value for translations
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_ValidateCode withTranslations(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.translations, newValue)) return this;
    return new ImmutableTerminologyCapabilities_ValidateCode(this.id, this.extension, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_ValidateCode#translations() translations} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for translations
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_ValidateCode withTranslations(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.translations, value)) return this;
    return new ImmutableTerminologyCapabilities_ValidateCode(this.id, this.extension, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_ValidateCode#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_ValidateCode withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTerminologyCapabilities_ValidateCode(this.id, this.extension, this.translations, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_ValidateCode#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_ValidateCode withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTerminologyCapabilities_ValidateCode(this.id, this.extension, this.translations, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTerminologyCapabilities_ValidateCode} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTerminologyCapabilities_ValidateCode
        && equalTo((ImmutableTerminologyCapabilities_ValidateCode) another);
  }

  private boolean equalTo(ImmutableTerminologyCapabilities_ValidateCode another) {
    return Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(translations, another.translations)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code translations}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(translations);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code TerminologyCapabilities_ValidateCode} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TerminologyCapabilities_ValidateCode{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (translations != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("translations=").append(translations);
    }
    if (modifierExtension != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TerminologyCapabilities_ValidateCode", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TerminologyCapabilities_ValidateCode {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> translations = Optional.empty();
    boolean translationsIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
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
    @JsonProperty("translations")
    public void setTranslations(Optional<Boolean> translations) {
      this.translations = translations;
      this.translationsIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> translations() { throw new UnsupportedOperationException(); }
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
  static ImmutableTerminologyCapabilities_ValidateCode fromJson(Json json) {
    ImmutableTerminologyCapabilities_ValidateCode.Builder builder = ImmutableTerminologyCapabilities_ValidateCode.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.translationsIsSet) {
      builder.translations(json.translations);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableTerminologyCapabilities_ValidateCode) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TerminologyCapabilities_ValidateCode} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TerminologyCapabilities_ValidateCode instance
   */
  public static TerminologyCapabilities_ValidateCode copyOf(TerminologyCapabilities_ValidateCode instance) {
    if (instance instanceof ImmutableTerminologyCapabilities_ValidateCode) {
      return (ImmutableTerminologyCapabilities_ValidateCode) instance;
    }
    return ImmutableTerminologyCapabilities_ValidateCode.builder()
        .id(instance.id())
        .extension(instance.extension())
        .translations(instance.translations())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link TerminologyCapabilities_ValidateCode TerminologyCapabilities_ValidateCode}.
   * <pre>
   * ImmutableTerminologyCapabilities_ValidateCode.builder()
   *    .id(String) // optional {@link TerminologyCapabilities_ValidateCode#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities_ValidateCode#extension() extension}
   *    .translations(Boolean) // optional {@link TerminologyCapabilities_ValidateCode#translations() translations}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities_ValidateCode#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new TerminologyCapabilities_ValidateCode builder
   */
  public static ImmutableTerminologyCapabilities_ValidateCode.Builder builder() {
    return new ImmutableTerminologyCapabilities_ValidateCode.Builder();
  }

  /**
   * Builds instances of type {@link TerminologyCapabilities_ValidateCode TerminologyCapabilities_ValidateCode}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TerminologyCapabilities_ValidateCode", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_TRANSLATIONS = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean translations;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_ValidateCode#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities_ValidateCode#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities_ValidateCode#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities_ValidateCode#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities_ValidateCode#translations() translations} to translations.
     * @param translations The value for translations
     * @return {@code this} builder for chained invocation
     */
    public final Builder translations(boolean translations) {
      checkNotIsSet(translationsIsSet(), "translations");
      this.translations = translations;
      optBits |= OPT_BIT_TRANSLATIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_ValidateCode#translations() translations} to translations.
     * @param translations The value for translations
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("translations")
    public final Builder translations(Optional<Boolean> translations) {
      checkNotIsSet(translationsIsSet(), "translations");
      this.translations = translations.orElse(null);
      optBits |= OPT_BIT_TRANSLATIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_ValidateCode#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities_ValidateCode#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link TerminologyCapabilities_ValidateCode TerminologyCapabilities_ValidateCode}.
     * @return An immutable instance of TerminologyCapabilities_ValidateCode
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TerminologyCapabilities_ValidateCode build() {
      return new ImmutableTerminologyCapabilities_ValidateCode(id, extension, translations, modifierExtension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean translationsIsSet() {
      return (optBits & OPT_BIT_TRANSLATIONS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TerminologyCapabilities_ValidateCode is strict, attribute is already set: ".concat(name));
    }
  }
}
