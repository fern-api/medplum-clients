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
 * Immutable implementation of {@link CapabilityStatement_Security}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCapabilityStatement_Security.builder()}.
 */
@Generated(from = "CapabilityStatement_Security", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCapabilityStatement_Security
    implements CapabilityStatement_Security {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Boolean cors;
  private final @Nullable Markdown description;
  private final @Nullable String id;
  private final @Nullable List<CodeableConcept> service;
  private final @Nullable List<Extension> extension;

  private ImmutableCapabilityStatement_Security(
      @Nullable List<Extension> modifierExtension,
      @Nullable Boolean cors,
      @Nullable Markdown description,
      @Nullable String id,
      @Nullable List<CodeableConcept> service,
      @Nullable List<Extension> extension) {
    this.modifierExtension = modifierExtension;
    this.cors = cors;
    this.description = description;
    this.id = id;
    this.service = service;
    this.extension = extension;
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
   * @return The value of the {@code cors} attribute
   */
  @JsonProperty("cors")
  @Override
  public Optional<Boolean> cors() {
    return Optional.ofNullable(cors);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code service} attribute
   */
  @JsonProperty("service")
  @Override
  public Optional<List<CodeableConcept>> service() {
    return Optional.ofNullable(service);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Security#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Security withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCapabilityStatement_Security(newValue, this.cors, this.description, this.id, this.service, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Security#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Security withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCapabilityStatement_Security(value, this.cors, this.description, this.id, this.service, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Security#cors() cors} attribute.
   * @param value The value for cors
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Security withCors(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.cors, newValue)) return this;
    return new ImmutableCapabilityStatement_Security(this.modifierExtension, newValue, this.description, this.id, this.service, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Security#cors() cors} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cors
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Security withCors(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.cors, value)) return this;
    return new ImmutableCapabilityStatement_Security(this.modifierExtension, value, this.description, this.id, this.service, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Security#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Security withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableCapabilityStatement_Security(this.modifierExtension, this.cors, newValue, this.id, this.service, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Security#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Security withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableCapabilityStatement_Security(this.modifierExtension, this.cors, value, this.id, this.service, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Security#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Security withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCapabilityStatement_Security(this.modifierExtension, this.cors, this.description, newValue, this.service, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Security#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Security withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCapabilityStatement_Security(this.modifierExtension, this.cors, this.description, value, this.service, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Security#service() service} attribute.
   * @param value The value for service
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Security withService(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "service");
    if (this.service == newValue) return this;
    return new ImmutableCapabilityStatement_Security(this.modifierExtension, this.cors, this.description, this.id, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Security#service() service} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for service
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Security withService(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.service == value) return this;
    return new ImmutableCapabilityStatement_Security(this.modifierExtension, this.cors, this.description, this.id, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Security#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Security withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCapabilityStatement_Security(this.modifierExtension, this.cors, this.description, this.id, this.service, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Security#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Security withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCapabilityStatement_Security(this.modifierExtension, this.cors, this.description, this.id, this.service, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCapabilityStatement_Security} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCapabilityStatement_Security
        && equalTo((ImmutableCapabilityStatement_Security) another);
  }

  private boolean equalTo(ImmutableCapabilityStatement_Security another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(cors, another.cors)
        && Objects.equals(description, another.description)
        && Objects.equals(id, another.id)
        && Objects.equals(service, another.service)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code cors}, {@code description}, {@code id}, {@code service}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(cors);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(service);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code CapabilityStatement_Security} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CapabilityStatement_Security{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (cors != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("cors=").append(cors);
    }
    if (description != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (service != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("service=").append(service);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CapabilityStatement_Security", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CapabilityStatement_Security {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Boolean> cors = Optional.empty();
    boolean corsIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<CodeableConcept>> service = Optional.empty();
    boolean serviceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("cors")
    public void setCors(Optional<Boolean> cors) {
      this.cors = cors;
      this.corsIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("service")
    public void setService(Optional<List<CodeableConcept>> service) {
      this.service = service;
      this.serviceIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> cors() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> service() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCapabilityStatement_Security fromJson(Json json) {
    ImmutableCapabilityStatement_Security.Builder builder = ImmutableCapabilityStatement_Security.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.corsIsSet) {
      builder.cors(json.cors);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.serviceIsSet) {
      builder.service(json.service);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableCapabilityStatement_Security) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CapabilityStatement_Security} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CapabilityStatement_Security instance
   */
  public static CapabilityStatement_Security copyOf(CapabilityStatement_Security instance) {
    if (instance instanceof ImmutableCapabilityStatement_Security) {
      return (ImmutableCapabilityStatement_Security) instance;
    }
    return ImmutableCapabilityStatement_Security.builder()
        .modifierExtension(instance.modifierExtension())
        .cors(instance.cors())
        .description(instance.description())
        .id(instance.id())
        .service(instance.service())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link CapabilityStatement_Security CapabilityStatement_Security}.
   * <pre>
   * ImmutableCapabilityStatement_Security.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Security#modifierExtension() modifierExtension}
   *    .cors(Boolean) // optional {@link CapabilityStatement_Security#cors() cors}
   *    .description(com.fhir.types.fhir.Markdown) // optional {@link CapabilityStatement_Security#description() description}
   *    .id(String) // optional {@link CapabilityStatement_Security#id() id}
   *    .service(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link CapabilityStatement_Security#service() service}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Security#extension() extension}
   *    .build();
   * </pre>
   * @return A new CapabilityStatement_Security builder
   */
  public static ImmutableCapabilityStatement_Security.Builder builder() {
    return new ImmutableCapabilityStatement_Security.Builder();
  }

  /**
   * Builds instances of type {@link CapabilityStatement_Security CapabilityStatement_Security}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CapabilityStatement_Security", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_CORS = 0x2L;
    private static final long OPT_BIT_DESCRIPTION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_SERVICE = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Boolean cors;
    private @Nullable Markdown description;
    private @Nullable String id;
    private @Nullable List<CodeableConcept> service;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Security#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Security#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Security#cors() cors} to cors.
     * @param cors The value for cors
     * @return {@code this} builder for chained invocation
     */
    public final Builder cors(boolean cors) {
      checkNotIsSet(corsIsSet(), "cors");
      this.cors = cors;
      optBits |= OPT_BIT_CORS;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Security#cors() cors} to cors.
     * @param cors The value for cors
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cors")
    public final Builder cors(Optional<Boolean> cors) {
      checkNotIsSet(corsIsSet(), "cors");
      this.cors = cors.orElse(null);
      optBits |= OPT_BIT_CORS;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Security#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(Markdown description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Security#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<? extends Markdown> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Security#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Security#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Security#service() service} to service.
     * @param service The value for service
     * @return {@code this} builder for chained invocation
     */
    public final Builder service(List<CodeableConcept> service) {
      checkNotIsSet(serviceIsSet(), "service");
      this.service = Objects.requireNonNull(service, "service");
      optBits |= OPT_BIT_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Security#service() service} to service.
     * @param service The value for service
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("service")
    public final Builder service(Optional<? extends List<CodeableConcept>> service) {
      checkNotIsSet(serviceIsSet(), "service");
      this.service = service.orElse(null);
      optBits |= OPT_BIT_SERVICE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Security#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_Security#extension() extension} to extension.
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
     * Builds a new {@link CapabilityStatement_Security CapabilityStatement_Security}.
     * @return An immutable instance of CapabilityStatement_Security
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CapabilityStatement_Security build() {
      return new ImmutableCapabilityStatement_Security(modifierExtension, cors, description, id, service, extension);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean corsIsSet() {
      return (optBits & OPT_BIT_CORS) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean serviceIsSet() {
      return (optBits & OPT_BIT_SERVICE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CapabilityStatement_Security is strict, attribute is already set: ".concat(name));
    }
  }
}
