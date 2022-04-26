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
 * Immutable implementation of {@link DeviceDefinition_UdiDeviceIdentifier}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeviceDefinition_UdiDeviceIdentifier.builder()}.
 */
@Generated(from = "DeviceDefinition_UdiDeviceIdentifier", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDeviceDefinition_UdiDeviceIdentifier
    implements DeviceDefinition_UdiDeviceIdentifier {
  private final @Nullable String deviceIdentifier;
  private final @Nullable List<Extension> extension;
  private final @Nullable Uri jurisdiction;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Uri issuer;

  private ImmutableDeviceDefinition_UdiDeviceIdentifier(
      @Nullable String deviceIdentifier,
      @Nullable List<Extension> extension,
      @Nullable Uri jurisdiction,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Uri issuer) {
    this.deviceIdentifier = deviceIdentifier;
    this.extension = extension;
    this.jurisdiction = jurisdiction;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.issuer = issuer;
  }

  /**
   * @return The value of the {@code deviceIdentifier} attribute
   */
  @JsonProperty("deviceIdentifier")
  @Override
  public Optional<String> deviceIdentifier() {
    return Optional.ofNullable(deviceIdentifier);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<Uri> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code issuer} attribute
   */
  @JsonProperty("issuer")
  @Override
  public Optional<Uri> issuer() {
    return Optional.ofNullable(issuer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_UdiDeviceIdentifier#deviceIdentifier() deviceIdentifier} attribute.
   * @param value The value for deviceIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withDeviceIdentifier(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "deviceIdentifier");
    if (Objects.equals(this.deviceIdentifier, newValue)) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(newValue, this.extension, this.jurisdiction, this.id, this.modifierExtension, this.issuer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_UdiDeviceIdentifier#deviceIdentifier() deviceIdentifier} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for deviceIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withDeviceIdentifier(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.deviceIdentifier, value)) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(value, this.extension, this.jurisdiction, this.id, this.modifierExtension, this.issuer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_UdiDeviceIdentifier#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(
        this.deviceIdentifier,
        newValue,
        this.jurisdiction,
        this.id,
        this.modifierExtension,
        this.issuer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_UdiDeviceIdentifier#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(this.deviceIdentifier, value, this.jurisdiction, this.id, this.modifierExtension, this.issuer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_UdiDeviceIdentifier#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withJurisdiction(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(this.deviceIdentifier, this.extension, newValue, this.id, this.modifierExtension, this.issuer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_UdiDeviceIdentifier#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withJurisdiction(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(this.deviceIdentifier, this.extension, value, this.id, this.modifierExtension, this.issuer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_UdiDeviceIdentifier#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(
        this.deviceIdentifier,
        this.extension,
        this.jurisdiction,
        newValue,
        this.modifierExtension,
        this.issuer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_UdiDeviceIdentifier#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(
        this.deviceIdentifier,
        this.extension,
        this.jurisdiction,
        value,
        this.modifierExtension,
        this.issuer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_UdiDeviceIdentifier#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(this.deviceIdentifier, this.extension, this.jurisdiction, this.id, newValue, this.issuer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_UdiDeviceIdentifier#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(this.deviceIdentifier, this.extension, this.jurisdiction, this.id, value, this.issuer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_UdiDeviceIdentifier#issuer() issuer} attribute.
   * @param value The value for issuer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withIssuer(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "issuer");
    if (this.issuer == newValue) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(
        this.deviceIdentifier,
        this.extension,
        this.jurisdiction,
        this.id,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_UdiDeviceIdentifier#issuer() issuer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issuer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition_UdiDeviceIdentifier withIssuer(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.issuer == value) return this;
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier(
        this.deviceIdentifier,
        this.extension,
        this.jurisdiction,
        this.id,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeviceDefinition_UdiDeviceIdentifier} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeviceDefinition_UdiDeviceIdentifier
        && equalTo((ImmutableDeviceDefinition_UdiDeviceIdentifier) another);
  }

  private boolean equalTo(ImmutableDeviceDefinition_UdiDeviceIdentifier another) {
    return Objects.equals(deviceIdentifier, another.deviceIdentifier)
        && Objects.equals(extension, another.extension)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(issuer, another.issuer);
  }

  /**
   * Computes a hash code from attributes: {@code deviceIdentifier}, {@code extension}, {@code jurisdiction}, {@code id}, {@code modifierExtension}, {@code issuer}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(deviceIdentifier);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(issuer);
    return h;
  }

  /**
   * Prints the immutable value {@code DeviceDefinition_UdiDeviceIdentifier} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DeviceDefinition_UdiDeviceIdentifier{");
    if (deviceIdentifier != null) {
      builder.append("deviceIdentifier=").append(deviceIdentifier);
    }
    if (extension != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (jurisdiction != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (id != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (issuer != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("issuer=").append(issuer);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DeviceDefinition_UdiDeviceIdentifier", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DeviceDefinition_UdiDeviceIdentifier {
    @Nullable Optional<String> deviceIdentifier = Optional.empty();
    boolean deviceIdentifierIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Uri> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Uri> issuer = Optional.empty();
    boolean issuerIsSet;
    @JsonProperty("deviceIdentifier")
    public void setDeviceIdentifier(Optional<String> deviceIdentifier) {
      this.deviceIdentifier = deviceIdentifier;
      this.deviceIdentifierIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<Uri> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
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
    @JsonProperty("issuer")
    public void setIssuer(Optional<Uri> issuer) {
      this.issuer = issuer;
      this.issuerIsSet = true;
    }
    @Override
    public Optional<String> deviceIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> issuer() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDeviceDefinition_UdiDeviceIdentifier fromJson(Json json) {
    ImmutableDeviceDefinition_UdiDeviceIdentifier.Builder builder = ImmutableDeviceDefinition_UdiDeviceIdentifier.builder();
    if (json.deviceIdentifierIsSet) {
      builder.deviceIdentifier(json.deviceIdentifier);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.issuerIsSet) {
      builder.issuer(json.issuer);
    }
    return (ImmutableDeviceDefinition_UdiDeviceIdentifier) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DeviceDefinition_UdiDeviceIdentifier} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DeviceDefinition_UdiDeviceIdentifier instance
   */
  public static DeviceDefinition_UdiDeviceIdentifier copyOf(DeviceDefinition_UdiDeviceIdentifier instance) {
    if (instance instanceof ImmutableDeviceDefinition_UdiDeviceIdentifier) {
      return (ImmutableDeviceDefinition_UdiDeviceIdentifier) instance;
    }
    return ImmutableDeviceDefinition_UdiDeviceIdentifier.builder()
        .deviceIdentifier(instance.deviceIdentifier())
        .extension(instance.extension())
        .jurisdiction(instance.jurisdiction())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .issuer(instance.issuer())
        .build();
  }

  /**
   * Creates a builder for {@link DeviceDefinition_UdiDeviceIdentifier DeviceDefinition_UdiDeviceIdentifier}.
   * <pre>
   * ImmutableDeviceDefinition_UdiDeviceIdentifier.builder()
   *    .deviceIdentifier(String) // optional {@link DeviceDefinition_UdiDeviceIdentifier#deviceIdentifier() deviceIdentifier}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DeviceDefinition_UdiDeviceIdentifier#extension() extension}
   *    .jurisdiction(com.medplum.types.fhir.Uri) // optional {@link DeviceDefinition_UdiDeviceIdentifier#jurisdiction() jurisdiction}
   *    .id(String) // optional {@link DeviceDefinition_UdiDeviceIdentifier#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link DeviceDefinition_UdiDeviceIdentifier#modifierExtension() modifierExtension}
   *    .issuer(com.medplum.types.fhir.Uri) // optional {@link DeviceDefinition_UdiDeviceIdentifier#issuer() issuer}
   *    .build();
   * </pre>
   * @return A new DeviceDefinition_UdiDeviceIdentifier builder
   */
  public static ImmutableDeviceDefinition_UdiDeviceIdentifier.Builder builder() {
    return new ImmutableDeviceDefinition_UdiDeviceIdentifier.Builder();
  }

  /**
   * Builds instances of type {@link DeviceDefinition_UdiDeviceIdentifier DeviceDefinition_UdiDeviceIdentifier}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DeviceDefinition_UdiDeviceIdentifier", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DEVICE_IDENTIFIER = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_JURISDICTION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_ISSUER = 0x20L;
    private long optBits;

    private @Nullable String deviceIdentifier;
    private @Nullable List<Extension> extension;
    private @Nullable Uri jurisdiction;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Uri issuer;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#deviceIdentifier() deviceIdentifier} to deviceIdentifier.
     * @param deviceIdentifier The value for deviceIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder deviceIdentifier(String deviceIdentifier) {
      checkNotIsSet(deviceIdentifierIsSet(), "deviceIdentifier");
      this.deviceIdentifier = Objects.requireNonNull(deviceIdentifier, "deviceIdentifier");
      optBits |= OPT_BIT_DEVICE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#deviceIdentifier() deviceIdentifier} to deviceIdentifier.
     * @param deviceIdentifier The value for deviceIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("deviceIdentifier")
    public final Builder deviceIdentifier(Optional<String> deviceIdentifier) {
      checkNotIsSet(deviceIdentifierIsSet(), "deviceIdentifier");
      this.deviceIdentifier = deviceIdentifier.orElse(null);
      optBits |= OPT_BIT_DEVICE_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdiction(Uri jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = Objects.requireNonNull(jurisdiction, "jurisdiction");
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("jurisdiction")
    public final Builder jurisdiction(Optional<? extends Uri> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = jurisdiction.orElse(null);
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#id() id} to id.
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
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#id() id} to id.
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
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#issuer() issuer} to issuer.
     * @param issuer The value for issuer
     * @return {@code this} builder for chained invocation
     */
    public final Builder issuer(Uri issuer) {
      checkNotIsSet(issuerIsSet(), "issuer");
      this.issuer = Objects.requireNonNull(issuer, "issuer");
      optBits |= OPT_BIT_ISSUER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_UdiDeviceIdentifier#issuer() issuer} to issuer.
     * @param issuer The value for issuer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("issuer")
    public final Builder issuer(Optional<? extends Uri> issuer) {
      checkNotIsSet(issuerIsSet(), "issuer");
      this.issuer = issuer.orElse(null);
      optBits |= OPT_BIT_ISSUER;
      return this;
    }

    /**
     * Builds a new {@link DeviceDefinition_UdiDeviceIdentifier DeviceDefinition_UdiDeviceIdentifier}.
     * @return An immutable instance of DeviceDefinition_UdiDeviceIdentifier
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DeviceDefinition_UdiDeviceIdentifier build() {
      return new ImmutableDeviceDefinition_UdiDeviceIdentifier(deviceIdentifier, extension, jurisdiction, id, modifierExtension, issuer);
    }

    private boolean deviceIdentifierIsSet() {
      return (optBits & OPT_BIT_DEVICE_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean issuerIsSet() {
      return (optBits & OPT_BIT_ISSUER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DeviceDefinition_UdiDeviceIdentifier is strict, attribute is already set: ".concat(name));
    }
  }
}
