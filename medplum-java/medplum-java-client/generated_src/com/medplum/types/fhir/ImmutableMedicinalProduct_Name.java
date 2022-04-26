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
 * Immutable implementation of {@link MedicinalProduct_Name}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProduct_Name.builder()}.
 */
@Generated(from = "MedicinalProduct_Name", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProduct_Name implements MedicinalProduct_Name {
  private final @Nullable String productName;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<MedicinalProduct_CountryLanguage> countryLanguage;
  private final @Nullable List<MedicinalProduct_NamePart> namePart;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableMedicinalProduct_Name(
      @Nullable String productName,
      @Nullable List<Extension> extension,
      @Nullable List<MedicinalProduct_CountryLanguage> countryLanguage,
      @Nullable List<MedicinalProduct_NamePart> namePart,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension) {
    this.productName = productName;
    this.extension = extension;
    this.countryLanguage = countryLanguage;
    this.namePart = namePart;
    this.id = id;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code productName} attribute
   */
  @JsonProperty("productName")
  @Override
  public Optional<String> productName() {
    return Optional.ofNullable(productName);
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
   * @return The value of the {@code countryLanguage} attribute
   */
  @JsonProperty("countryLanguage")
  @Override
  public Optional<List<MedicinalProduct_CountryLanguage>> countryLanguage() {
    return Optional.ofNullable(countryLanguage);
  }

  /**
   * @return The value of the {@code namePart} attribute
   */
  @JsonProperty("namePart")
  @Override
  public Optional<List<MedicinalProduct_NamePart>> namePart() {
    return Optional.ofNullable(namePart);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_Name#productName() productName} attribute.
   * @param value The value for productName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_Name withProductName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "productName");
    if (Objects.equals(this.productName, newValue)) return this;
    return new ImmutableMedicinalProduct_Name(newValue, this.extension, this.countryLanguage, this.namePart, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_Name#productName() productName} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_Name withProductName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.productName, value)) return this;
    return new ImmutableMedicinalProduct_Name(value, this.extension, this.countryLanguage, this.namePart, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_Name#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_Name withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProduct_Name(
        this.productName,
        newValue,
        this.countryLanguage,
        this.namePart,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_Name#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_Name withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProduct_Name(this.productName, value, this.countryLanguage, this.namePart, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_Name#countryLanguage() countryLanguage} attribute.
   * @param value The value for countryLanguage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_Name withCountryLanguage(List<MedicinalProduct_CountryLanguage> value) {
    @Nullable List<MedicinalProduct_CountryLanguage> newValue = Objects.requireNonNull(value, "countryLanguage");
    if (this.countryLanguage == newValue) return this;
    return new ImmutableMedicinalProduct_Name(this.productName, this.extension, newValue, this.namePart, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_Name#countryLanguage() countryLanguage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for countryLanguage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_Name withCountryLanguage(Optional<? extends List<MedicinalProduct_CountryLanguage>> optional) {
    @Nullable List<MedicinalProduct_CountryLanguage> value = optional.orElse(null);
    if (this.countryLanguage == value) return this;
    return new ImmutableMedicinalProduct_Name(this.productName, this.extension, value, this.namePart, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_Name#namePart() namePart} attribute.
   * @param value The value for namePart
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_Name withNamePart(List<MedicinalProduct_NamePart> value) {
    @Nullable List<MedicinalProduct_NamePart> newValue = Objects.requireNonNull(value, "namePart");
    if (this.namePart == newValue) return this;
    return new ImmutableMedicinalProduct_Name(
        this.productName,
        this.extension,
        this.countryLanguage,
        newValue,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_Name#namePart() namePart} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for namePart
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_Name withNamePart(Optional<? extends List<MedicinalProduct_NamePart>> optional) {
    @Nullable List<MedicinalProduct_NamePart> value = optional.orElse(null);
    if (this.namePart == value) return this;
    return new ImmutableMedicinalProduct_Name(this.productName, this.extension, this.countryLanguage, value, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_Name#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_Name withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProduct_Name(
        this.productName,
        this.extension,
        this.countryLanguage,
        this.namePart,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_Name#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_Name withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProduct_Name(
        this.productName,
        this.extension,
        this.countryLanguage,
        this.namePart,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_Name#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_Name withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProduct_Name(this.productName, this.extension, this.countryLanguage, this.namePart, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_Name#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_Name withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProduct_Name(this.productName, this.extension, this.countryLanguage, this.namePart, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProduct_Name} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProduct_Name
        && equalTo((ImmutableMedicinalProduct_Name) another);
  }

  private boolean equalTo(ImmutableMedicinalProduct_Name another) {
    return Objects.equals(productName, another.productName)
        && Objects.equals(extension, another.extension)
        && Objects.equals(countryLanguage, another.countryLanguage)
        && Objects.equals(namePart, another.namePart)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code productName}, {@code extension}, {@code countryLanguage}, {@code namePart}, {@code id}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(productName);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(countryLanguage);
    h += (h << 5) + Objects.hashCode(namePart);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProduct_Name} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProduct_Name{");
    if (productName != null) {
      builder.append("productName=").append(productName);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (countryLanguage != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("countryLanguage=").append(countryLanguage);
    }
    if (namePart != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("namePart=").append(namePart);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProduct_Name", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProduct_Name {
    @Nullable Optional<String> productName = Optional.empty();
    boolean productNameIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<MedicinalProduct_CountryLanguage>> countryLanguage = Optional.empty();
    boolean countryLanguageIsSet;
    @Nullable Optional<List<MedicinalProduct_NamePart>> namePart = Optional.empty();
    boolean namePartIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("productName")
    public void setProductName(Optional<String> productName) {
      this.productName = productName;
      this.productNameIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("countryLanguage")
    public void setCountryLanguage(Optional<List<MedicinalProduct_CountryLanguage>> countryLanguage) {
      this.countryLanguage = countryLanguage;
      this.countryLanguageIsSet = true;
    }
    @JsonProperty("namePart")
    public void setNamePart(Optional<List<MedicinalProduct_NamePart>> namePart) {
      this.namePart = namePart;
      this.namePartIsSet = true;
    }
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
    @Override
    public Optional<String> productName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicinalProduct_CountryLanguage>> countryLanguage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicinalProduct_NamePart>> namePart() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicinalProduct_Name fromJson(Json json) {
    ImmutableMedicinalProduct_Name.Builder builder = ImmutableMedicinalProduct_Name.builder();
    if (json.productNameIsSet) {
      builder.productName(json.productName);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.countryLanguageIsSet) {
      builder.countryLanguage(json.countryLanguage);
    }
    if (json.namePartIsSet) {
      builder.namePart(json.namePart);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableMedicinalProduct_Name) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProduct_Name} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProduct_Name instance
   */
  public static MedicinalProduct_Name copyOf(MedicinalProduct_Name instance) {
    if (instance instanceof ImmutableMedicinalProduct_Name) {
      return (ImmutableMedicinalProduct_Name) instance;
    }
    return ImmutableMedicinalProduct_Name.builder()
        .productName(instance.productName())
        .extension(instance.extension())
        .countryLanguage(instance.countryLanguage())
        .namePart(instance.namePart())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProduct_Name MedicinalProduct_Name}.
   * <pre>
   * ImmutableMedicinalProduct_Name.builder()
   *    .productName(String) // optional {@link MedicinalProduct_Name#productName() productName}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct_Name#extension() extension}
   *    .countryLanguage(List&amp;lt;com.medplum.types.fhir.MedicinalProduct_CountryLanguage&amp;gt;) // optional {@link MedicinalProduct_Name#countryLanguage() countryLanguage}
   *    .namePart(List&amp;lt;com.medplum.types.fhir.MedicinalProduct_NamePart&amp;gt;) // optional {@link MedicinalProduct_Name#namePart() namePart}
   *    .id(String) // optional {@link MedicinalProduct_Name#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct_Name#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new MedicinalProduct_Name builder
   */
  public static ImmutableMedicinalProduct_Name.Builder builder() {
    return new ImmutableMedicinalProduct_Name.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProduct_Name MedicinalProduct_Name}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProduct_Name", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_PRODUCT_NAME = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_COUNTRY_LANGUAGE = 0x4L;
    private static final long OPT_BIT_NAME_PART = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable String productName;
    private @Nullable List<Extension> extension;
    private @Nullable List<MedicinalProduct_CountryLanguage> countryLanguage;
    private @Nullable List<MedicinalProduct_NamePart> namePart;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_Name#productName() productName} to productName.
     * @param productName The value for productName
     * @return {@code this} builder for chained invocation
     */
    public final Builder productName(String productName) {
      checkNotIsSet(productNameIsSet(), "productName");
      this.productName = Objects.requireNonNull(productName, "productName");
      optBits |= OPT_BIT_PRODUCT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_Name#productName() productName} to productName.
     * @param productName The value for productName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productName")
    public final Builder productName(Optional<String> productName) {
      checkNotIsSet(productNameIsSet(), "productName");
      this.productName = productName.orElse(null);
      optBits |= OPT_BIT_PRODUCT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_Name#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProduct_Name#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProduct_Name#countryLanguage() countryLanguage} to countryLanguage.
     * @param countryLanguage The value for countryLanguage
     * @return {@code this} builder for chained invocation
     */
    public final Builder countryLanguage(List<MedicinalProduct_CountryLanguage> countryLanguage) {
      checkNotIsSet(countryLanguageIsSet(), "countryLanguage");
      this.countryLanguage = Objects.requireNonNull(countryLanguage, "countryLanguage");
      optBits |= OPT_BIT_COUNTRY_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_Name#countryLanguage() countryLanguage} to countryLanguage.
     * @param countryLanguage The value for countryLanguage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("countryLanguage")
    public final Builder countryLanguage(Optional<? extends List<MedicinalProduct_CountryLanguage>> countryLanguage) {
      checkNotIsSet(countryLanguageIsSet(), "countryLanguage");
      this.countryLanguage = countryLanguage.orElse(null);
      optBits |= OPT_BIT_COUNTRY_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_Name#namePart() namePart} to namePart.
     * @param namePart The value for namePart
     * @return {@code this} builder for chained invocation
     */
    public final Builder namePart(List<MedicinalProduct_NamePart> namePart) {
      checkNotIsSet(namePartIsSet(), "namePart");
      this.namePart = Objects.requireNonNull(namePart, "namePart");
      optBits |= OPT_BIT_NAME_PART;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_Name#namePart() namePart} to namePart.
     * @param namePart The value for namePart
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("namePart")
    public final Builder namePart(Optional<? extends List<MedicinalProduct_NamePart>> namePart) {
      checkNotIsSet(namePartIsSet(), "namePart");
      this.namePart = namePart.orElse(null);
      optBits |= OPT_BIT_NAME_PART;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_Name#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProduct_Name#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProduct_Name#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProduct_Name#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link MedicinalProduct_Name MedicinalProduct_Name}.
     * @return An immutable instance of MedicinalProduct_Name
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProduct_Name build() {
      return new ImmutableMedicinalProduct_Name(productName, extension, countryLanguage, namePart, id, modifierExtension);
    }

    private boolean productNameIsSet() {
      return (optBits & OPT_BIT_PRODUCT_NAME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean countryLanguageIsSet() {
      return (optBits & OPT_BIT_COUNTRY_LANGUAGE) != 0;
    }

    private boolean namePartIsSet() {
      return (optBits & OPT_BIT_NAME_PART) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProduct_Name is strict, attribute is already set: ".concat(name));
    }
  }
}
