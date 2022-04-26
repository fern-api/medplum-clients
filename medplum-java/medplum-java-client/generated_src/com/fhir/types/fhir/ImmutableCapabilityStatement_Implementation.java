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
 * Immutable implementation of {@link CapabilityStatement_Implementation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCapabilityStatement_Implementation.builder()}.
 */
@Generated(from = "CapabilityStatement_Implementation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCapabilityStatement_Implementation
    implements CapabilityStatement_Implementation {
  private final @Nullable Reference custodian;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Url url;
  private final @Nullable List<Extension> extension;
  private final @Nullable String description;

  private ImmutableCapabilityStatement_Implementation(
      @Nullable Reference custodian,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Url url,
      @Nullable List<Extension> extension,
      @Nullable String description) {
    this.custodian = custodian;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.url = url;
    this.extension = extension;
    this.description = description;
  }

  /**
   * @return The value of the {@code custodian} attribute
   */
  @JsonProperty("custodian")
  @Override
  public Optional<Reference> custodian() {
    return Optional.ofNullable(custodian);
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
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Url> url() {
    return Optional.ofNullable(url);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Implementation#custodian() custodian} attribute.
   * @param value The value for custodian
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Implementation withCustodian(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "custodian");
    if (this.custodian == newValue) return this;
    return new ImmutableCapabilityStatement_Implementation(newValue, this.id, this.modifierExtension, this.url, this.extension, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Implementation#custodian() custodian} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for custodian
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Implementation withCustodian(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.custodian == value) return this;
    return new ImmutableCapabilityStatement_Implementation(value, this.id, this.modifierExtension, this.url, this.extension, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Implementation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Implementation withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCapabilityStatement_Implementation(this.custodian, newValue, this.modifierExtension, this.url, this.extension, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Implementation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Implementation withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCapabilityStatement_Implementation(this.custodian, value, this.modifierExtension, this.url, this.extension, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Implementation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Implementation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCapabilityStatement_Implementation(this.custodian, this.id, newValue, this.url, this.extension, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Implementation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Implementation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCapabilityStatement_Implementation(this.custodian, this.id, value, this.url, this.extension, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Implementation#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Implementation withUrl(Url value) {
    @Nullable Url newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableCapabilityStatement_Implementation(this.custodian, this.id, this.modifierExtension, newValue, this.extension, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Implementation#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Implementation withUrl(Optional<? extends Url> optional) {
    @Nullable Url value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableCapabilityStatement_Implementation(this.custodian, this.id, this.modifierExtension, value, this.extension, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Implementation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Implementation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCapabilityStatement_Implementation(this.custodian, this.id, this.modifierExtension, this.url, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Implementation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Implementation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCapabilityStatement_Implementation(this.custodian, this.id, this.modifierExtension, this.url, value, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Implementation#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Implementation withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableCapabilityStatement_Implementation(this.custodian, this.id, this.modifierExtension, this.url, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Implementation#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Implementation withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableCapabilityStatement_Implementation(this.custodian, this.id, this.modifierExtension, this.url, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCapabilityStatement_Implementation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCapabilityStatement_Implementation
        && equalTo((ImmutableCapabilityStatement_Implementation) another);
  }

  private boolean equalTo(ImmutableCapabilityStatement_Implementation another) {
    return Objects.equals(custodian, another.custodian)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(url, another.url)
        && Objects.equals(extension, another.extension)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code custodian}, {@code id}, {@code modifierExtension}, {@code url}, {@code extension}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(custodian);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code CapabilityStatement_Implementation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CapabilityStatement_Implementation{");
    if (custodian != null) {
      builder.append("custodian=").append(custodian);
    }
    if (id != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (url != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (extension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (description != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("description=").append(description);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CapabilityStatement_Implementation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CapabilityStatement_Implementation {
    @Nullable Optional<Reference> custodian = Optional.empty();
    boolean custodianIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Url> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @JsonProperty("custodian")
    public void setCustodian(Optional<Reference> custodian) {
      this.custodian = custodian;
      this.custodianIsSet = true;
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
    @JsonProperty("url")
    public void setUrl(Optional<Url> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @Override
    public Optional<Reference> custodian() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Url> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCapabilityStatement_Implementation fromJson(Json json) {
    ImmutableCapabilityStatement_Implementation.Builder builder = ImmutableCapabilityStatement_Implementation.builder();
    if (json.custodianIsSet) {
      builder.custodian(json.custodian);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    return (ImmutableCapabilityStatement_Implementation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CapabilityStatement_Implementation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CapabilityStatement_Implementation instance
   */
  public static CapabilityStatement_Implementation copyOf(CapabilityStatement_Implementation instance) {
    if (instance instanceof ImmutableCapabilityStatement_Implementation) {
      return (ImmutableCapabilityStatement_Implementation) instance;
    }
    return ImmutableCapabilityStatement_Implementation.builder()
        .custodian(instance.custodian())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .url(instance.url())
        .extension(instance.extension())
        .description(instance.description())
        .build();
  }

  /**
   * Creates a builder for {@link CapabilityStatement_Implementation CapabilityStatement_Implementation}.
   * <pre>
   * ImmutableCapabilityStatement_Implementation.builder()
   *    .custodian(com.fhir.types.fhir.Reference) // optional {@link CapabilityStatement_Implementation#custodian() custodian}
   *    .id(String) // optional {@link CapabilityStatement_Implementation#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Implementation#modifierExtension() modifierExtension}
   *    .url(com.fhir.types.fhir.Url) // optional {@link CapabilityStatement_Implementation#url() url}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Implementation#extension() extension}
   *    .description(String) // optional {@link CapabilityStatement_Implementation#description() description}
   *    .build();
   * </pre>
   * @return A new CapabilityStatement_Implementation builder
   */
  public static ImmutableCapabilityStatement_Implementation.Builder builder() {
    return new ImmutableCapabilityStatement_Implementation.Builder();
  }

  /**
   * Builds instances of type {@link CapabilityStatement_Implementation CapabilityStatement_Implementation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CapabilityStatement_Implementation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_CUSTODIAN = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_URL = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_DESCRIPTION = 0x20L;
    private long optBits;

    private @Nullable Reference custodian;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Url url;
    private @Nullable List<Extension> extension;
    private @Nullable String description;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Implementation#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for chained invocation
     */
    public final Builder custodian(Reference custodian) {
      checkNotIsSet(custodianIsSet(), "custodian");
      this.custodian = Objects.requireNonNull(custodian, "custodian");
      optBits |= OPT_BIT_CUSTODIAN;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Implementation#custodian() custodian} to custodian.
     * @param custodian The value for custodian
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("custodian")
    public final Builder custodian(Optional<? extends Reference> custodian) {
      checkNotIsSet(custodianIsSet(), "custodian");
      this.custodian = custodian.orElse(null);
      optBits |= OPT_BIT_CUSTODIAN;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Implementation#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Implementation#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Implementation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Implementation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Implementation#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(Url url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Implementation#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("url")
    public final Builder url(Optional<? extends Url> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Implementation#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_Implementation#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_Implementation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Implementation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Builds a new {@link CapabilityStatement_Implementation CapabilityStatement_Implementation}.
     * @return An immutable instance of CapabilityStatement_Implementation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CapabilityStatement_Implementation build() {
      return new ImmutableCapabilityStatement_Implementation(custodian, id, modifierExtension, url, extension, description);
    }

    private boolean custodianIsSet() {
      return (optBits & OPT_BIT_CUSTODIAN) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CapabilityStatement_Implementation is strict, attribute is already set: ".concat(name));
    }
  }
}
