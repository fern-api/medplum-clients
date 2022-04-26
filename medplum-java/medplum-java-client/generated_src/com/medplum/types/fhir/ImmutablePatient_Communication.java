package com.medplum.types.fhir;

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
 * Immutable implementation of {@link Patient_Communication}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePatient_Communication.builder()}.
 */
@Generated(from = "Patient_Communication", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePatient_Communication implements Patient_Communication {
  private final @Nullable String id;
  private final CodeableConcept language;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean preferred;

  private ImmutablePatient_Communication(
      @Nullable String id,
      CodeableConcept language,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable Boolean preferred) {
    this.id = id;
    this.language = language;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.preferred = preferred;
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public CodeableConcept language() {
    return language;
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
   * @return The value of the {@code preferred} attribute
   */
  @JsonProperty("preferred")
  @Override
  public Optional<Boolean> preferred() {
    return Optional.ofNullable(preferred);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient_Communication#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Communication withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePatient_Communication(newValue, this.language, this.modifierExtension, this.extension, this.preferred);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient_Communication#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Communication withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePatient_Communication(value, this.language, this.modifierExtension, this.extension, this.preferred);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Patient_Communication#language() language} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for language
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePatient_Communication withLanguage(CodeableConcept value) {
    if (this.language == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "language");
    return new ImmutablePatient_Communication(this.id, newValue, this.modifierExtension, this.extension, this.preferred);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient_Communication#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Communication withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePatient_Communication(this.id, this.language, newValue, this.extension, this.preferred);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient_Communication#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient_Communication withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePatient_Communication(this.id, this.language, value, this.extension, this.preferred);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient_Communication#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Communication withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePatient_Communication(this.id, this.language, this.modifierExtension, newValue, this.preferred);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient_Communication#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient_Communication withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePatient_Communication(this.id, this.language, this.modifierExtension, value, this.preferred);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient_Communication#preferred() preferred} attribute.
   * @param value The value for preferred
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Communication withPreferred(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.preferred, newValue)) return this;
    return new ImmutablePatient_Communication(this.id, this.language, this.modifierExtension, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient_Communication#preferred() preferred} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preferred
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Communication withPreferred(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.preferred, value)) return this;
    return new ImmutablePatient_Communication(this.id, this.language, this.modifierExtension, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePatient_Communication} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePatient_Communication
        && equalTo((ImmutablePatient_Communication) another);
  }

  private boolean equalTo(ImmutablePatient_Communication another) {
    return Objects.equals(id, another.id)
        && language.equals(another.language)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(preferred, another.preferred);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code language}, {@code modifierExtension}, {@code extension}, {@code preferred}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + language.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(preferred);
    return h;
  }

  /**
   * Prints the immutable value {@code Patient_Communication} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Patient_Communication{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("language=").append(language);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (preferred != null) {
      builder.append(", ");
      builder.append("preferred=").append(preferred);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Patient_Communication", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Patient_Communication {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable CodeableConcept language;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> preferred = Optional.empty();
    boolean preferredIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(CodeableConcept language) {
      this.language = language;
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
    @JsonProperty("preferred")
    public void setPreferred(Optional<Boolean> preferred) {
      this.preferred = preferred;
      this.preferredIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> preferred() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePatient_Communication fromJson(Json json) {
    ImmutablePatient_Communication.Builder builder = ((ImmutablePatient_Communication.Builder) ImmutablePatient_Communication.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.language != null) {
      builder.language(json.language);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.preferredIsSet) {
      builder.preferred(json.preferred);
    }
    return (ImmutablePatient_Communication) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Patient_Communication} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Patient_Communication instance
   */
  public static Patient_Communication copyOf(Patient_Communication instance) {
    if (instance instanceof ImmutablePatient_Communication) {
      return (ImmutablePatient_Communication) instance;
    }
    return ((ImmutablePatient_Communication.Builder) ImmutablePatient_Communication.builder())
        .id(instance.id())
        .language(instance.language())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .preferred(instance.preferred())
        .build();
  }

  /**
   * Creates a builder for {@link Patient_Communication Patient_Communication}.
   * <pre>
   * ImmutablePatient_Communication.builder()
   *    .id(String) // optional {@link Patient_Communication#id() id}
   *    .language(com.medplum.types.fhir.CodeableConcept) // required {@link Patient_Communication#language() language}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Patient_Communication#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Patient_Communication#extension() extension}
   *    .preferred(Boolean) // optional {@link Patient_Communication#preferred() preferred}
   *    .build();
   * </pre>
   * @return A new Patient_Communication builder
   */
  public static LanguageBuildStage builder() {
    return new ImmutablePatient_Communication.Builder();
  }

  /**
   * Builds instances of type {@link Patient_Communication Patient_Communication}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Patient_Communication", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements LanguageBuildStage, BuildFinal {
    private static final long INIT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_PREFERRED = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String id;
    private @Nullable CodeableConcept language;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean preferred;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Patient_Communication#id() id} to id.
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
     * Initializes the optional value {@link Patient_Communication#id() id} to id.
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
     * Initializes the value for the {@link Patient_Communication#language() language} attribute.
     * @param language The value for language 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(CodeableConcept language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      initBits &= ~INIT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient_Communication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Patient_Communication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Patient_Communication#extension() extension} to extension.
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
     * Initializes the optional value {@link Patient_Communication#extension() extension} to extension.
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
     * Initializes the optional value {@link Patient_Communication#preferred() preferred} to preferred.
     * @param preferred The value for preferred
     * @return {@code this} builder for chained invocation
     */
    public final Builder preferred(boolean preferred) {
      checkNotIsSet(preferredIsSet(), "preferred");
      this.preferred = preferred;
      optBits |= OPT_BIT_PREFERRED;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient_Communication#preferred() preferred} to preferred.
     * @param preferred The value for preferred
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("preferred")
    public final Builder preferred(Optional<Boolean> preferred) {
      checkNotIsSet(preferredIsSet(), "preferred");
      this.preferred = preferred.orElse(null);
      optBits |= OPT_BIT_PREFERRED;
      return this;
    }

    /**
     * Builds a new {@link Patient_Communication Patient_Communication}.
     * @return An immutable instance of Patient_Communication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Patient_Communication build() {
      checkRequiredAttributes();
      return new ImmutablePatient_Communication(id, language, modifierExtension, extension, preferred);
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

    private boolean preferredIsSet() {
      return (optBits & OPT_BIT_PREFERRED) != 0;
    }

    private boolean languageIsSet() {
      return (initBits & INIT_BIT_LANGUAGE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Patient_Communication is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!languageIsSet()) attributes.add("language");
      return "Cannot build Patient_Communication, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Patient_Communication", generator = "Immutables")
  public interface LanguageBuildStage {
    /**
     * Initializes the value for the {@link Patient_Communication#language() language} attribute.
     * @param language The value for language 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(CodeableConcept language);
  }

  @Generated(from = "Patient_Communication", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Patient_Communication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Patient_Communication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Patient_Communication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Patient_Communication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Patient_Communication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Patient_Communication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Patient_Communication#preferred() preferred} to preferred.
     * @param preferred The value for preferred
     * @return {@code this} builder for chained invocation
     */
    BuildFinal preferred(boolean preferred);

    /**
     * Initializes the optional value {@link Patient_Communication#preferred() preferred} to preferred.
     * @param preferred The value for preferred
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal preferred(Optional<Boolean> preferred);

    /**
     * Builds a new {@link Patient_Communication Patient_Communication}.
     * @return An immutable instance of Patient_Communication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Patient_Communication build();
  }
}
