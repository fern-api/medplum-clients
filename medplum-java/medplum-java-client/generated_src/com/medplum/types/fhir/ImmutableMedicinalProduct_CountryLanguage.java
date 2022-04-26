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
 * Immutable implementation of {@link MedicinalProduct_CountryLanguage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProduct_CountryLanguage.builder()}.
 */
@Generated(from = "MedicinalProduct_CountryLanguage", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProduct_CountryLanguage
    implements MedicinalProduct_CountryLanguage {
  private final @Nullable List<Extension> extension;
  private final CodeableConcept language;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept jurisdiction;
  private final CodeableConcept country;
  private final @Nullable String id;

  private ImmutableMedicinalProduct_CountryLanguage(
      @Nullable List<Extension> extension,
      CodeableConcept language,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept jurisdiction,
      CodeableConcept country,
      @Nullable String id) {
    this.extension = extension;
    this.language = language;
    this.modifierExtension = modifierExtension;
    this.jurisdiction = jurisdiction;
    this.country = country;
    this.id = id;
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<CodeableConcept> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
  }

  /**
   * @return The value of the {@code country} attribute
   */
  @JsonProperty("country")
  @Override
  public CodeableConcept country() {
    return country;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_CountryLanguage#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_CountryLanguage withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProduct_CountryLanguage(newValue, this.language, this.modifierExtension, this.jurisdiction, this.country, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_CountryLanguage#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_CountryLanguage withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProduct_CountryLanguage(value, this.language, this.modifierExtension, this.jurisdiction, this.country, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProduct_CountryLanguage#language() language} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for language
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProduct_CountryLanguage withLanguage(CodeableConcept value) {
    if (this.language == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "language");
    return new ImmutableMedicinalProduct_CountryLanguage(this.extension, newValue, this.modifierExtension, this.jurisdiction, this.country, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_CountryLanguage#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_CountryLanguage withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProduct_CountryLanguage(this.extension, this.language, newValue, this.jurisdiction, this.country, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_CountryLanguage#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_CountryLanguage withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProduct_CountryLanguage(this.extension, this.language, value, this.jurisdiction, this.country, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_CountryLanguage#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_CountryLanguage withJurisdiction(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableMedicinalProduct_CountryLanguage(this.extension, this.language, this.modifierExtension, newValue, this.country, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_CountryLanguage#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_CountryLanguage withJurisdiction(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableMedicinalProduct_CountryLanguage(this.extension, this.language, this.modifierExtension, value, this.country, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProduct_CountryLanguage#country() country} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for country
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProduct_CountryLanguage withCountry(CodeableConcept value) {
    if (this.country == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "country");
    return new ImmutableMedicinalProduct_CountryLanguage(this.extension, this.language, this.modifierExtension, this.jurisdiction, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_CountryLanguage#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_CountryLanguage withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProduct_CountryLanguage(
        this.extension,
        this.language,
        this.modifierExtension,
        this.jurisdiction,
        this.country,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_CountryLanguage#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_CountryLanguage withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProduct_CountryLanguage(this.extension, this.language, this.modifierExtension, this.jurisdiction, this.country, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProduct_CountryLanguage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProduct_CountryLanguage
        && equalTo((ImmutableMedicinalProduct_CountryLanguage) another);
  }

  private boolean equalTo(ImmutableMedicinalProduct_CountryLanguage another) {
    return Objects.equals(extension, another.extension)
        && language.equals(another.language)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && country.equals(another.country)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code language}, {@code modifierExtension}, {@code jurisdiction}, {@code country}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + language.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + country.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProduct_CountryLanguage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProduct_CountryLanguage{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 33) builder.append(", ");
    builder.append("language=").append(language);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    builder.append(", ");
    builder.append("country=").append(country);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProduct_CountryLanguage", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProduct_CountryLanguage {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable CodeableConcept language;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable CodeableConcept country;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
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
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<CodeableConcept> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("country")
    public void setCountry(CodeableConcept country) {
      this.country = country;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept country() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicinalProduct_CountryLanguage fromJson(Json json) {
    ImmutableMedicinalProduct_CountryLanguage.Builder builder = ((ImmutableMedicinalProduct_CountryLanguage.Builder) ImmutableMedicinalProduct_CountryLanguage.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.language != null) {
      builder.language(json.language);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.country != null) {
      builder.country(json.country);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableMedicinalProduct_CountryLanguage) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProduct_CountryLanguage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProduct_CountryLanguage instance
   */
  public static MedicinalProduct_CountryLanguage copyOf(MedicinalProduct_CountryLanguage instance) {
    if (instance instanceof ImmutableMedicinalProduct_CountryLanguage) {
      return (ImmutableMedicinalProduct_CountryLanguage) instance;
    }
    return ((ImmutableMedicinalProduct_CountryLanguage.Builder) ImmutableMedicinalProduct_CountryLanguage.builder())
        .extension(instance.extension())
        .language(instance.language())
        .modifierExtension(instance.modifierExtension())
        .jurisdiction(instance.jurisdiction())
        .country(instance.country())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProduct_CountryLanguage MedicinalProduct_CountryLanguage}.
   * <pre>
   * ImmutableMedicinalProduct_CountryLanguage.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct_CountryLanguage#extension() extension}
   *    .language(com.medplum.types.fhir.CodeableConcept) // required {@link MedicinalProduct_CountryLanguage#language() language}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct_CountryLanguage#modifierExtension() modifierExtension}
   *    .jurisdiction(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProduct_CountryLanguage#jurisdiction() jurisdiction}
   *    .country(com.medplum.types.fhir.CodeableConcept) // required {@link MedicinalProduct_CountryLanguage#country() country}
   *    .id(String) // optional {@link MedicinalProduct_CountryLanguage#id() id}
   *    .build();
   * </pre>
   * @return A new MedicinalProduct_CountryLanguage builder
   */
  public static LanguageBuildStage builder() {
    return new ImmutableMedicinalProduct_CountryLanguage.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProduct_CountryLanguage MedicinalProduct_CountryLanguage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProduct_CountryLanguage", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements LanguageBuildStage, CountryBuildStage, BuildFinal {
    private static final long INIT_BIT_LANGUAGE = 0x1L;
    private static final long INIT_BIT_COUNTRY = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_JURISDICTION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept language;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept jurisdiction;
    private @Nullable CodeableConcept country;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_CountryLanguage#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProduct_CountryLanguage#extension() extension} to extension.
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
     * Initializes the value for the {@link MedicinalProduct_CountryLanguage#language() language} attribute.
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
     * Initializes the optional value {@link MedicinalProduct_CountryLanguage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProduct_CountryLanguage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProduct_CountryLanguage#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdiction(CodeableConcept jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = Objects.requireNonNull(jurisdiction, "jurisdiction");
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_CountryLanguage#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("jurisdiction")
    public final Builder jurisdiction(Optional<? extends CodeableConcept> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = jurisdiction.orElse(null);
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProduct_CountryLanguage#country() country} attribute.
     * @param country The value for country 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("country")
    public final Builder country(CodeableConcept country) {
      checkNotIsSet(countryIsSet(), "country");
      this.country = Objects.requireNonNull(country, "country");
      initBits &= ~INIT_BIT_COUNTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_CountryLanguage#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProduct_CountryLanguage#id() id} to id.
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
     * Builds a new {@link MedicinalProduct_CountryLanguage MedicinalProduct_CountryLanguage}.
     * @return An immutable instance of MedicinalProduct_CountryLanguage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProduct_CountryLanguage build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProduct_CountryLanguage(extension, language, modifierExtension, jurisdiction, country, id);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean languageIsSet() {
      return (initBits & INIT_BIT_LANGUAGE) == 0;
    }

    private boolean countryIsSet() {
      return (initBits & INIT_BIT_COUNTRY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProduct_CountryLanguage is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!languageIsSet()) attributes.add("language");
      if (!countryIsSet()) attributes.add("country");
      return "Cannot build MedicinalProduct_CountryLanguage, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProduct_CountryLanguage", generator = "Immutables")
  public interface LanguageBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProduct_CountryLanguage#language() language} attribute.
     * @param language The value for language 
     * @return {@code this} builder for use in a chained invocation
     */
    CountryBuildStage language(CodeableConcept language);
  }

  @Generated(from = "MedicinalProduct_CountryLanguage", generator = "Immutables")
  public interface CountryBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProduct_CountryLanguage#country() country} attribute.
     * @param country The value for country 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal country(CodeableConcept country);
  }

  @Generated(from = "MedicinalProduct_CountryLanguage", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProduct_CountryLanguage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProduct_CountryLanguage#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProduct_CountryLanguage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProduct_CountryLanguage#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProduct_CountryLanguage#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(CodeableConcept jurisdiction);

    /**
     * Initializes the optional value {@link MedicinalProduct_CountryLanguage#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link MedicinalProduct_CountryLanguage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicinalProduct_CountryLanguage#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link MedicinalProduct_CountryLanguage MedicinalProduct_CountryLanguage}.
     * @return An immutable instance of MedicinalProduct_CountryLanguage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProduct_CountryLanguage build();
  }
}
