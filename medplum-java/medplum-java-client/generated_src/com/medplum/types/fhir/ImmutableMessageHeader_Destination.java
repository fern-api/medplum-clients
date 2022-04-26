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
 * Immutable implementation of {@link MessageHeader_Destination}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMessageHeader_Destination.builder()}.
 */
@Generated(from = "MessageHeader_Destination", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMessageHeader_Destination
    implements MessageHeader_Destination {
  private final @Nullable List<Extension> extension;
  private final @Nullable Url endpoint;
  private final @Nullable Reference target;
  private final @Nullable String id;
  private final @Nullable String name;
  private final @Nullable Reference receiver;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableMessageHeader_Destination(
      @Nullable List<Extension> extension,
      @Nullable Url endpoint,
      @Nullable Reference target,
      @Nullable String id,
      @Nullable String name,
      @Nullable Reference receiver,
      @Nullable List<Extension> modifierExtension) {
    this.extension = extension;
    this.endpoint = endpoint;
    this.target = target;
    this.id = id;
    this.name = name;
    this.receiver = receiver;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code endpoint} attribute
   */
  @JsonProperty("endpoint")
  @Override
  public Optional<Url> endpoint() {
    return Optional.ofNullable(endpoint);
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public Optional<Reference> target() {
    return Optional.ofNullable(target);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code receiver} attribute
   */
  @JsonProperty("receiver")
  @Override
  public Optional<Reference> receiver() {
    return Optional.ofNullable(receiver);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Destination#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Destination withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMessageHeader_Destination(newValue, this.endpoint, this.target, this.id, this.name, this.receiver, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Destination#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Destination withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMessageHeader_Destination(value, this.endpoint, this.target, this.id, this.name, this.receiver, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Destination#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Destination withEndpoint(Url value) {
    @Nullable Url newValue = Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableMessageHeader_Destination(
        this.extension,
        newValue,
        this.target,
        this.id,
        this.name,
        this.receiver,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Destination#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Destination withEndpoint(Optional<? extends Url> optional) {
    @Nullable Url value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableMessageHeader_Destination(this.extension, value, this.target, this.id, this.name, this.receiver, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Destination#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Destination withTarget(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutableMessageHeader_Destination(
        this.extension,
        this.endpoint,
        newValue,
        this.id,
        this.name,
        this.receiver,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Destination#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Destination withTarget(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutableMessageHeader_Destination(this.extension, this.endpoint, value, this.id, this.name, this.receiver, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Destination#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Destination withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMessageHeader_Destination(
        this.extension,
        this.endpoint,
        this.target,
        newValue,
        this.name,
        this.receiver,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Destination#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Destination withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMessageHeader_Destination(
        this.extension,
        this.endpoint,
        this.target,
        value,
        this.name,
        this.receiver,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Destination#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Destination withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableMessageHeader_Destination(
        this.extension,
        this.endpoint,
        this.target,
        this.id,
        newValue,
        this.receiver,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Destination#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Destination withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableMessageHeader_Destination(
        this.extension,
        this.endpoint,
        this.target,
        this.id,
        value,
        this.receiver,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Destination#receiver() receiver} attribute.
   * @param value The value for receiver
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Destination withReceiver(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "receiver");
    if (this.receiver == newValue) return this;
    return new ImmutableMessageHeader_Destination(
        this.extension,
        this.endpoint,
        this.target,
        this.id,
        this.name,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Destination#receiver() receiver} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for receiver
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Destination withReceiver(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.receiver == value) return this;
    return new ImmutableMessageHeader_Destination(this.extension, this.endpoint, this.target, this.id, this.name, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Destination#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Destination withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMessageHeader_Destination(this.extension, this.endpoint, this.target, this.id, this.name, this.receiver, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Destination#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Destination withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMessageHeader_Destination(this.extension, this.endpoint, this.target, this.id, this.name, this.receiver, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMessageHeader_Destination} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMessageHeader_Destination
        && equalTo((ImmutableMessageHeader_Destination) another);
  }

  private boolean equalTo(ImmutableMessageHeader_Destination another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(endpoint, another.endpoint)
        && Objects.equals(target, another.target)
        && Objects.equals(id, another.id)
        && Objects.equals(name, another.name)
        && Objects.equals(receiver, another.receiver)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code endpoint}, {@code target}, {@code id}, {@code name}, {@code receiver}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(endpoint);
    h += (h << 5) + Objects.hashCode(target);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(receiver);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code MessageHeader_Destination} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MessageHeader_Destination{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (endpoint != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    if (target != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("target=").append(target);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (name != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (receiver != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("receiver=").append(receiver);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MessageHeader_Destination", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MessageHeader_Destination {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Url> endpoint = Optional.empty();
    boolean endpointIsSet;
    @Nullable Optional<Reference> target = Optional.empty();
    boolean targetIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Reference> receiver = Optional.empty();
    boolean receiverIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("endpoint")
    public void setEndpoint(Optional<Url> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @JsonProperty("target")
    public void setTarget(Optional<Reference> target) {
      this.target = target;
      this.targetIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("receiver")
    public void setReceiver(Optional<Reference> receiver) {
      this.receiver = receiver;
      this.receiverIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Url> endpoint() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> target() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> receiver() { throw new UnsupportedOperationException(); }
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
  static ImmutableMessageHeader_Destination fromJson(Json json) {
    ImmutableMessageHeader_Destination.Builder builder = ImmutableMessageHeader_Destination.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.receiverIsSet) {
      builder.receiver(json.receiver);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableMessageHeader_Destination) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MessageHeader_Destination} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MessageHeader_Destination instance
   */
  public static MessageHeader_Destination copyOf(MessageHeader_Destination instance) {
    if (instance instanceof ImmutableMessageHeader_Destination) {
      return (ImmutableMessageHeader_Destination) instance;
    }
    return ImmutableMessageHeader_Destination.builder()
        .extension(instance.extension())
        .endpoint(instance.endpoint())
        .target(instance.target())
        .id(instance.id())
        .name(instance.name())
        .receiver(instance.receiver())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link MessageHeader_Destination MessageHeader_Destination}.
   * <pre>
   * ImmutableMessageHeader_Destination.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MessageHeader_Destination#extension() extension}
   *    .endpoint(com.medplum.types.fhir.Url) // optional {@link MessageHeader_Destination#endpoint() endpoint}
   *    .target(com.medplum.types.fhir.Reference) // optional {@link MessageHeader_Destination#target() target}
   *    .id(String) // optional {@link MessageHeader_Destination#id() id}
   *    .name(String) // optional {@link MessageHeader_Destination#name() name}
   *    .receiver(com.medplum.types.fhir.Reference) // optional {@link MessageHeader_Destination#receiver() receiver}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MessageHeader_Destination#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new MessageHeader_Destination builder
   */
  public static ImmutableMessageHeader_Destination.Builder builder() {
    return new ImmutableMessageHeader_Destination.Builder();
  }

  /**
   * Builds instances of type {@link MessageHeader_Destination MessageHeader_Destination}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MessageHeader_Destination", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ENDPOINT = 0x2L;
    private static final long OPT_BIT_TARGET = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_NAME = 0x10L;
    private static final long OPT_BIT_RECEIVER = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Url endpoint;
    private @Nullable Reference target;
    private @Nullable String id;
    private @Nullable String name;
    private @Nullable Reference receiver;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MessageHeader_Destination#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageHeader_Destination#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageHeader_Destination#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder endpoint(Url endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = Objects.requireNonNull(endpoint, "endpoint");
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Destination#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("endpoint")
    public final Builder endpoint(Optional<? extends Url> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = endpoint.orElse(null);
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Destination#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(Reference target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Destination#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(Optional<? extends Reference> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Destination#id() id} to id.
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
     * Initializes the optional value {@link MessageHeader_Destination#id() id} to id.
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
     * Initializes the optional value {@link MessageHeader_Destination#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Destination#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Destination#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for chained invocation
     */
    public final Builder receiver(Reference receiver) {
      checkNotIsSet(receiverIsSet(), "receiver");
      this.receiver = Objects.requireNonNull(receiver, "receiver");
      optBits |= OPT_BIT_RECEIVER;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Destination#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("receiver")
    public final Builder receiver(Optional<? extends Reference> receiver) {
      checkNotIsSet(receiverIsSet(), "receiver");
      this.receiver = receiver.orElse(null);
      optBits |= OPT_BIT_RECEIVER;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Destination#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageHeader_Destination#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link MessageHeader_Destination MessageHeader_Destination}.
     * @return An immutable instance of MessageHeader_Destination
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MessageHeader_Destination build() {
      return new ImmutableMessageHeader_Destination(extension, endpoint, target, id, name, receiver, modifierExtension);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean receiverIsSet() {
      return (optBits & OPT_BIT_RECEIVER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MessageHeader_Destination is strict, attribute is already set: ".concat(name));
    }
  }
}
