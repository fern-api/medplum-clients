package com.fhir.types.fhir;

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
 * Immutable implementation of {@link CapabilityStatement_Endpoint}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCapabilityStatement_Endpoint.builder()}.
 */
@Generated(from = "CapabilityStatement_Endpoint", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCapabilityStatement_Endpoint
    implements CapabilityStatement_Endpoint {
  private final @Nullable String id;
  private final @Nullable Url address;
  private final Coding protocol;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;

  private ImmutableCapabilityStatement_Endpoint(
      @Nullable String id,
      @Nullable Url address,
      Coding protocol,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension) {
    this.id = id;
    this.address = address;
    this.protocol = protocol;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
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
   * @return The value of the {@code address} attribute
   */
  @JsonProperty("address")
  @Override
  public Optional<Url> address() {
    return Optional.ofNullable(address);
  }

  /**
   * @return The value of the {@code protocol} attribute
   */
  @JsonProperty("protocol")
  @Override
  public Coding protocol() {
    return protocol;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Endpoint#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Endpoint withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCapabilityStatement_Endpoint(newValue, this.address, this.protocol, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Endpoint#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Endpoint withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCapabilityStatement_Endpoint(value, this.address, this.protocol, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Endpoint#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Endpoint withAddress(Url value) {
    @Nullable Url newValue = Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutableCapabilityStatement_Endpoint(this.id, newValue, this.protocol, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Endpoint#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Endpoint withAddress(Optional<? extends Url> optional) {
    @Nullable Url value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutableCapabilityStatement_Endpoint(this.id, value, this.protocol, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CapabilityStatement_Endpoint#protocol() protocol} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for protocol
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCapabilityStatement_Endpoint withProtocol(Coding value) {
    if (this.protocol == value) return this;
    Coding newValue = Objects.requireNonNull(value, "protocol");
    return new ImmutableCapabilityStatement_Endpoint(this.id, this.address, newValue, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Endpoint#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Endpoint withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCapabilityStatement_Endpoint(this.id, this.address, this.protocol, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Endpoint#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Endpoint withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCapabilityStatement_Endpoint(this.id, this.address, this.protocol, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Endpoint#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Endpoint withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCapabilityStatement_Endpoint(this.id, this.address, this.protocol, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Endpoint#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Endpoint withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCapabilityStatement_Endpoint(this.id, this.address, this.protocol, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCapabilityStatement_Endpoint} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCapabilityStatement_Endpoint
        && equalTo((ImmutableCapabilityStatement_Endpoint) another);
  }

  private boolean equalTo(ImmutableCapabilityStatement_Endpoint another) {
    return Objects.equals(id, another.id)
        && Objects.equals(address, another.address)
        && protocol.equals(another.protocol)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code address}, {@code protocol}, {@code modifierExtension}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(address);
    h += (h << 5) + protocol.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code CapabilityStatement_Endpoint} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CapabilityStatement_Endpoint{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (address != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("address=").append(address);
    }
    if (builder.length() > 29) builder.append(", ");
    builder.append("protocol=").append(protocol);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CapabilityStatement_Endpoint", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CapabilityStatement_Endpoint {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Url> address = Optional.empty();
    boolean addressIsSet;
    @Nullable Coding protocol;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("address")
    public void setAddress(Optional<Url> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @JsonProperty("protocol")
    public void setProtocol(Coding protocol) {
      this.protocol = protocol;
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
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Url> address() { throw new UnsupportedOperationException(); }
    @Override
    public Coding protocol() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
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
  static ImmutableCapabilityStatement_Endpoint fromJson(Json json) {
    ImmutableCapabilityStatement_Endpoint.Builder builder = ((ImmutableCapabilityStatement_Endpoint.Builder) ImmutableCapabilityStatement_Endpoint.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    if (json.protocol != null) {
      builder.protocol(json.protocol);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableCapabilityStatement_Endpoint) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CapabilityStatement_Endpoint} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CapabilityStatement_Endpoint instance
   */
  public static CapabilityStatement_Endpoint copyOf(CapabilityStatement_Endpoint instance) {
    if (instance instanceof ImmutableCapabilityStatement_Endpoint) {
      return (ImmutableCapabilityStatement_Endpoint) instance;
    }
    return ((ImmutableCapabilityStatement_Endpoint.Builder) ImmutableCapabilityStatement_Endpoint.builder())
        .id(instance.id())
        .address(instance.address())
        .protocol(instance.protocol())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link CapabilityStatement_Endpoint CapabilityStatement_Endpoint}.
   * <pre>
   * ImmutableCapabilityStatement_Endpoint.builder()
   *    .id(String) // optional {@link CapabilityStatement_Endpoint#id() id}
   *    .address(com.fhir.types.fhir.Url) // optional {@link CapabilityStatement_Endpoint#address() address}
   *    .protocol(com.fhir.types.fhir.Coding) // required {@link CapabilityStatement_Endpoint#protocol() protocol}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Endpoint#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Endpoint#extension() extension}
   *    .build();
   * </pre>
   * @return A new CapabilityStatement_Endpoint builder
   */
  public static ProtocolBuildStage builder() {
    return new ImmutableCapabilityStatement_Endpoint.Builder();
  }

  /**
   * Builds instances of type {@link CapabilityStatement_Endpoint CapabilityStatement_Endpoint}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CapabilityStatement_Endpoint", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ProtocolBuildStage, BuildFinal {
    private static final long INIT_BIT_PROTOCOL = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_ADDRESS = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String id;
    private @Nullable Url address;
    private @Nullable Coding protocol;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Endpoint#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Endpoint#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    public final Builder address(Url address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = Objects.requireNonNull(address, "address");
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("address")
    public final Builder address(Optional<? extends Url> address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = address.orElse(null);
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the value for the {@link CapabilityStatement_Endpoint#protocol() protocol} attribute.
     * @param protocol The value for protocol 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("protocol")
    public final Builder protocol(Coding protocol) {
      checkNotIsSet(protocolIsSet(), "protocol");
      this.protocol = Objects.requireNonNull(protocol, "protocol");
      initBits &= ~INIT_BIT_PROTOCOL;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Endpoint#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Endpoint#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_Endpoint#extension() extension} to extension.
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
     * Builds a new {@link CapabilityStatement_Endpoint CapabilityStatement_Endpoint}.
     * @return An immutable instance of CapabilityStatement_Endpoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CapabilityStatement_Endpoint build() {
      checkRequiredAttributes();
      return new ImmutableCapabilityStatement_Endpoint(id, address, protocol, modifierExtension, extension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean protocolIsSet() {
      return (initBits & INIT_BIT_PROTOCOL) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CapabilityStatement_Endpoint is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!protocolIsSet()) attributes.add("protocol");
      return "Cannot build CapabilityStatement_Endpoint, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "CapabilityStatement_Endpoint", generator = "Immutables")
  public interface ProtocolBuildStage {
    /**
     * Initializes the value for the {@link CapabilityStatement_Endpoint#protocol() protocol} attribute.
     * @param protocol The value for protocol 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal protocol(Coding protocol);
  }

  @Generated(from = "CapabilityStatement_Endpoint", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    BuildFinal address(Url address);

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal address(Optional<? extends Url> address);

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link CapabilityStatement_Endpoint#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link CapabilityStatement_Endpoint CapabilityStatement_Endpoint}.
     * @return An immutable instance of CapabilityStatement_Endpoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CapabilityStatement_Endpoint build();
  }
}
