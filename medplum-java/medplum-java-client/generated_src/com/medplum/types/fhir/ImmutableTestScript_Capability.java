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
 * Immutable implementation of {@link TestScript_Capability}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript_Capability.builder()}.
 */
@Generated(from = "TestScript_Capability", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript_Capability implements TestScript_Capability {
  private final @Nullable Integer destination;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final Canonical capabilities;
  private final @Nullable List<Integer> origin;
  private final @Nullable Boolean required;
  private final @Nullable List<Uri> link;
  private final @Nullable Boolean validated;
  private final @Nullable List<Extension> extension;
  private final @Nullable String description;

  private ImmutableTestScript_Capability(
      @Nullable Integer destination,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      Canonical capabilities,
      @Nullable List<Integer> origin,
      @Nullable Boolean required,
      @Nullable List<Uri> link,
      @Nullable Boolean validated,
      @Nullable List<Extension> extension,
      @Nullable String description) {
    this.destination = destination;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.capabilities = capabilities;
    this.origin = origin;
    this.required = required;
    this.link = link;
    this.validated = validated;
    this.extension = extension;
    this.description = description;
  }

  /**
   * @return The value of the {@code destination} attribute
   */
  @JsonProperty("destination")
  @Override
  public Optional<Integer> destination() {
    return Optional.ofNullable(destination);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code capabilities} attribute
   */
  @JsonProperty("capabilities")
  @Override
  public Canonical capabilities() {
    return capabilities;
  }

  /**
   * @return The value of the {@code origin} attribute
   */
  @JsonProperty("origin")
  @Override
  public Optional<List<Integer>> origin() {
    return Optional.ofNullable(origin);
  }

  /**
   * @return The value of the {@code required} attribute
   */
  @JsonProperty("required")
  @Override
  public Optional<Boolean> required() {
    return Optional.ofNullable(required);
  }

  /**
   * @return The value of the {@code link} attribute
   */
  @JsonProperty("link")
  @Override
  public Optional<List<Uri>> link() {
    return Optional.ofNullable(link);
  }

  /**
   * @return The value of the {@code validated} attribute
   */
  @JsonProperty("validated")
  @Override
  public Optional<Boolean> validated() {
    return Optional.ofNullable(validated);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#destination() destination} attribute.
   * @param value The value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withDestination(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.destination, newValue)) return this;
    return new ImmutableTestScript_Capability(
        newValue,
        this.modifierExtension,
        this.id,
        this.capabilities,
        this.origin,
        this.required,
        this.link,
        this.validated,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#destination() destination} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withDestination(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.destination, value)) return this;
    return new ImmutableTestScript_Capability(
        value,
        this.modifierExtension,
        this.id,
        this.capabilities,
        this.origin,
        this.required,
        this.link,
        this.validated,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript_Capability(
        this.destination,
        newValue,
        this.id,
        this.capabilities,
        this.origin,
        this.required,
        this.link,
        this.validated,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Capability withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript_Capability(
        this.destination,
        value,
        this.id,
        this.capabilities,
        this.origin,
        this.required,
        this.link,
        this.validated,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestScript_Capability(
        this.destination,
        this.modifierExtension,
        newValue,
        this.capabilities,
        this.origin,
        this.required,
        this.link,
        this.validated,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTestScript_Capability(
        this.destination,
        this.modifierExtension,
        value,
        this.capabilities,
        this.origin,
        this.required,
        this.link,
        this.validated,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TestScript_Capability#capabilities() capabilities} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for capabilities
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTestScript_Capability withCapabilities(Canonical value) {
    if (this.capabilities == value) return this;
    Canonical newValue = Objects.requireNonNull(value, "capabilities");
    return new ImmutableTestScript_Capability(
        this.destination,
        this.modifierExtension,
        this.id,
        newValue,
        this.origin,
        this.required,
        this.link,
        this.validated,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#origin() origin} attribute.
   * @param value The value for origin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withOrigin(List<Integer> value) {
    @Nullable List<Integer> newValue = Objects.requireNonNull(value, "origin");
    if (this.origin == newValue) return this;
    return new ImmutableTestScript_Capability(
        this.destination,
        this.modifierExtension,
        this.id,
        this.capabilities,
        newValue,
        this.required,
        this.link,
        this.validated,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#origin() origin} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for origin
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Capability withOrigin(Optional<? extends List<Integer>> optional) {
    @Nullable List<Integer> value = optional.orElse(null);
    if (this.origin == value) return this;
    return new ImmutableTestScript_Capability(
        this.destination,
        this.modifierExtension,
        this.id,
        this.capabilities,
        value,
        this.required,
        this.link,
        this.validated,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#required() required} attribute.
   * @param value The value for required
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withRequired(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.required, newValue)) return this;
    return new ImmutableTestScript_Capability(
        this.destination,
        this.modifierExtension,
        this.id,
        this.capabilities,
        this.origin,
        newValue,
        this.link,
        this.validated,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#required() required} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for required
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withRequired(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.required, value)) return this;
    return new ImmutableTestScript_Capability(
        this.destination,
        this.modifierExtension,
        this.id,
        this.capabilities,
        this.origin,
        value,
        this.link,
        this.validated,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#link() link} attribute.
   * @param value The value for link
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withLink(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "link");
    if (this.link == newValue) return this;
    return new ImmutableTestScript_Capability(
        this.destination,
        this.modifierExtension,
        this.id,
        this.capabilities,
        this.origin,
        this.required,
        newValue,
        this.validated,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#link() link} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for link
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Capability withLink(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.link == value) return this;
    return new ImmutableTestScript_Capability(
        this.destination,
        this.modifierExtension,
        this.id,
        this.capabilities,
        this.origin,
        this.required,
        value,
        this.validated,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#validated() validated} attribute.
   * @param value The value for validated
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withValidated(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.validated, newValue)) return this;
    return new ImmutableTestScript_Capability(
        this.destination,
        this.modifierExtension,
        this.id,
        this.capabilities,
        this.origin,
        this.required,
        this.link,
        newValue,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#validated() validated} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validated
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withValidated(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.validated, value)) return this;
    return new ImmutableTestScript_Capability(
        this.destination,
        this.modifierExtension,
        this.id,
        this.capabilities,
        this.origin,
        this.required,
        this.link,
        value,
        this.extension,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript_Capability(
        this.destination,
        this.modifierExtension,
        this.id,
        this.capabilities,
        this.origin,
        this.required,
        this.link,
        this.validated,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Capability withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript_Capability(
        this.destination,
        this.modifierExtension,
        this.id,
        this.capabilities,
        this.origin,
        this.required,
        this.link,
        this.validated,
        value,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Capability#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableTestScript_Capability(
        this.destination,
        this.modifierExtension,
        this.id,
        this.capabilities,
        this.origin,
        this.required,
        this.link,
        this.validated,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Capability#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Capability withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableTestScript_Capability(
        this.destination,
        this.modifierExtension,
        this.id,
        this.capabilities,
        this.origin,
        this.required,
        this.link,
        this.validated,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript_Capability} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript_Capability
        && equalTo((ImmutableTestScript_Capability) another);
  }

  private boolean equalTo(ImmutableTestScript_Capability another) {
    return Objects.equals(destination, another.destination)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && capabilities.equals(another.capabilities)
        && Objects.equals(origin, another.origin)
        && Objects.equals(required, another.required)
        && Objects.equals(link, another.link)
        && Objects.equals(validated, another.validated)
        && Objects.equals(extension, another.extension)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code destination}, {@code modifierExtension}, {@code id}, {@code capabilities}, {@code origin}, {@code required}, {@code link}, {@code validated}, {@code extension}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(destination);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + capabilities.hashCode();
    h += (h << 5) + Objects.hashCode(origin);
    h += (h << 5) + Objects.hashCode(required);
    h += (h << 5) + Objects.hashCode(link);
    h += (h << 5) + Objects.hashCode(validated);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript_Capability} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestScript_Capability{");
    if (destination != null) {
      builder.append("destination=").append(destination);
    }
    if (modifierExtension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("capabilities=").append(capabilities);
    if (origin != null) {
      builder.append(", ");
      builder.append("origin=").append(origin);
    }
    if (required != null) {
      builder.append(", ");
      builder.append("required=").append(required);
    }
    if (link != null) {
      builder.append(", ");
      builder.append("link=").append(link);
    }
    if (validated != null) {
      builder.append(", ");
      builder.append("validated=").append(validated);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TestScript_Capability", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestScript_Capability {
    @Nullable Optional<Integer> destination = Optional.empty();
    boolean destinationIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Canonical capabilities;
    @Nullable Optional<List<Integer>> origin = Optional.empty();
    boolean originIsSet;
    @Nullable Optional<Boolean> required = Optional.empty();
    boolean requiredIsSet;
    @Nullable Optional<List<Uri>> link = Optional.empty();
    boolean linkIsSet;
    @Nullable Optional<Boolean> validated = Optional.empty();
    boolean validatedIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @JsonProperty("destination")
    public void setDestination(Optional<Integer> destination) {
      this.destination = destination;
      this.destinationIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("capabilities")
    public void setCapabilities(Canonical capabilities) {
      this.capabilities = capabilities;
    }
    @JsonProperty("origin")
    public void setOrigin(Optional<List<Integer>> origin) {
      this.origin = origin;
      this.originIsSet = true;
    }
    @JsonProperty("required")
    public void setRequired(Optional<Boolean> required) {
      this.required = required;
      this.requiredIsSet = true;
    }
    @JsonProperty("link")
    public void setLink(Optional<List<Uri>> link) {
      this.link = link;
      this.linkIsSet = true;
    }
    @JsonProperty("validated")
    public void setValidated(Optional<Boolean> validated) {
      this.validated = validated;
      this.validatedIsSet = true;
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
    public Optional<Integer> destination() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Canonical capabilities() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Integer>> origin() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> required() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> link() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> validated() { throw new UnsupportedOperationException(); }
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
  static ImmutableTestScript_Capability fromJson(Json json) {
    ImmutableTestScript_Capability.Builder builder = ((ImmutableTestScript_Capability.Builder) ImmutableTestScript_Capability.builder());
    if (json.destinationIsSet) {
      builder.destination(json.destination);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.capabilities != null) {
      builder.capabilities(json.capabilities);
    }
    if (json.originIsSet) {
      builder.origin(json.origin);
    }
    if (json.requiredIsSet) {
      builder.required(json.required);
    }
    if (json.linkIsSet) {
      builder.link(json.link);
    }
    if (json.validatedIsSet) {
      builder.validated(json.validated);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    return (ImmutableTestScript_Capability) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestScript_Capability} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestScript_Capability instance
   */
  public static TestScript_Capability copyOf(TestScript_Capability instance) {
    if (instance instanceof ImmutableTestScript_Capability) {
      return (ImmutableTestScript_Capability) instance;
    }
    return ((ImmutableTestScript_Capability.Builder) ImmutableTestScript_Capability.builder())
        .destination(instance.destination())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .capabilities(instance.capabilities())
        .origin(instance.origin())
        .required(instance.required())
        .link(instance.link())
        .validated(instance.validated())
        .extension(instance.extension())
        .description(instance.description())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript_Capability TestScript_Capability}.
   * <pre>
   * ImmutableTestScript_Capability.builder()
   *    .destination(Integer) // optional {@link TestScript_Capability#destination() destination}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Capability#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link TestScript_Capability#id() id}
   *    .capabilities(com.medplum.types.fhir.Canonical) // required {@link TestScript_Capability#capabilities() capabilities}
   *    .origin(List&amp;lt;Integer&amp;gt;) // optional {@link TestScript_Capability#origin() origin}
   *    .required(Boolean) // optional {@link TestScript_Capability#required() required}
   *    .link(List&amp;lt;com.medplum.types.fhir.Uri&amp;gt;) // optional {@link TestScript_Capability#link() link}
   *    .validated(Boolean) // optional {@link TestScript_Capability#validated() validated}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Capability#extension() extension}
   *    .description(String) // optional {@link TestScript_Capability#description() description}
   *    .build();
   * </pre>
   * @return A new TestScript_Capability builder
   */
  public static CapabilitiesBuildStage builder() {
    return new ImmutableTestScript_Capability.Builder();
  }

  /**
   * Builds instances of type {@link TestScript_Capability TestScript_Capability}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TestScript_Capability", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CapabilitiesBuildStage, BuildFinal {
    private static final long INIT_BIT_CAPABILITIES = 0x1L;
    private static final long OPT_BIT_DESTINATION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_ORIGIN = 0x8L;
    private static final long OPT_BIT_REQUIRED = 0x10L;
    private static final long OPT_BIT_LINK = 0x20L;
    private static final long OPT_BIT_VALIDATED = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_DESCRIPTION = 0x100L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Integer destination;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable Canonical capabilities;
    private @Nullable List<Integer> origin;
    private @Nullable Boolean required;
    private @Nullable List<Uri> link;
    private @Nullable Boolean validated;
    private @Nullable List<Extension> extension;
    private @Nullable String description;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    public final Builder destination(int destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = destination;
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("destination")
    public final Builder destination(Optional<Integer> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = destination.orElse(null);
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Capability#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Capability#id() id} to id.
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
     * Initializes the optional value {@link TestScript_Capability#id() id} to id.
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
     * Initializes the value for the {@link TestScript_Capability#capabilities() capabilities} attribute.
     * @param capabilities The value for capabilities 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("capabilities")
    public final Builder capabilities(Canonical capabilities) {
      checkNotIsSet(capabilitiesIsSet(), "capabilities");
      this.capabilities = Objects.requireNonNull(capabilities, "capabilities");
      initBits &= ~INIT_BIT_CAPABILITIES;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for chained invocation
     */
    public final Builder origin(List<Integer> origin) {
      checkNotIsSet(originIsSet(), "origin");
      this.origin = Objects.requireNonNull(origin, "origin");
      optBits |= OPT_BIT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("origin")
    public final Builder origin(Optional<? extends List<Integer>> origin) {
      checkNotIsSet(originIsSet(), "origin");
      this.origin = origin.orElse(null);
      optBits |= OPT_BIT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#required() required} to required.
     * @param required The value for required
     * @return {@code this} builder for chained invocation
     */
    public final Builder required(boolean required) {
      checkNotIsSet(requiredIsSet(), "required");
      this.required = required;
      optBits |= OPT_BIT_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#required() required} to required.
     * @param required The value for required
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("required")
    public final Builder required(Optional<Boolean> required) {
      checkNotIsSet(requiredIsSet(), "required");
      this.required = required.orElse(null);
      optBits |= OPT_BIT_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    public final Builder link(List<Uri> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = Objects.requireNonNull(link, "link");
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("link")
    public final Builder link(Optional<? extends List<Uri>> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = link.orElse(null);
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#validated() validated} to validated.
     * @param validated The value for validated
     * @return {@code this} builder for chained invocation
     */
    public final Builder validated(boolean validated) {
      checkNotIsSet(validatedIsSet(), "validated");
      this.validated = validated;
      optBits |= OPT_BIT_VALIDATED;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#validated() validated} to validated.
     * @param validated The value for validated
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("validated")
    public final Builder validated(Optional<Boolean> validated) {
      checkNotIsSet(validatedIsSet(), "validated");
      this.validated = validated.orElse(null);
      optBits |= OPT_BIT_VALIDATED;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Capability#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Capability#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Capability#description() description} to description.
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
     * Initializes the optional value {@link TestScript_Capability#description() description} to description.
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
     * Builds a new {@link TestScript_Capability TestScript_Capability}.
     * @return An immutable instance of TestScript_Capability
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestScript_Capability build() {
      checkRequiredAttributes();
      return new ImmutableTestScript_Capability(
          destination,
          modifierExtension,
          id,
          capabilities,
          origin,
          required,
          link,
          validated,
          extension,
          description);
    }

    private boolean destinationIsSet() {
      return (optBits & OPT_BIT_DESTINATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean originIsSet() {
      return (optBits & OPT_BIT_ORIGIN) != 0;
    }

    private boolean requiredIsSet() {
      return (optBits & OPT_BIT_REQUIRED) != 0;
    }

    private boolean linkIsSet() {
      return (optBits & OPT_BIT_LINK) != 0;
    }

    private boolean validatedIsSet() {
      return (optBits & OPT_BIT_VALIDATED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean capabilitiesIsSet() {
      return (initBits & INIT_BIT_CAPABILITIES) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestScript_Capability is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!capabilitiesIsSet()) attributes.add("capabilities");
      return "Cannot build TestScript_Capability, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "TestScript_Capability", generator = "Immutables")
  public interface CapabilitiesBuildStage {
    /**
     * Initializes the value for the {@link TestScript_Capability#capabilities() capabilities} attribute.
     * @param capabilities The value for capabilities 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal capabilities(Canonical capabilities);
  }

  @Generated(from = "TestScript_Capability", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link TestScript_Capability#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    BuildFinal destination(int destination);

    /**
     * Initializes the optional value {@link TestScript_Capability#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal destination(Optional<Integer> destination);

    /**
     * Initializes the optional value {@link TestScript_Capability#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link TestScript_Capability#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link TestScript_Capability#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link TestScript_Capability#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link TestScript_Capability#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for chained invocation
     */
    BuildFinal origin(List<Integer> origin);

    /**
     * Initializes the optional value {@link TestScript_Capability#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal origin(Optional<? extends List<Integer>> origin);

    /**
     * Initializes the optional value {@link TestScript_Capability#required() required} to required.
     * @param required The value for required
     * @return {@code this} builder for chained invocation
     */
    BuildFinal required(boolean required);

    /**
     * Initializes the optional value {@link TestScript_Capability#required() required} to required.
     * @param required The value for required
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal required(Optional<Boolean> required);

    /**
     * Initializes the optional value {@link TestScript_Capability#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    BuildFinal link(List<Uri> link);

    /**
     * Initializes the optional value {@link TestScript_Capability#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal link(Optional<? extends List<Uri>> link);

    /**
     * Initializes the optional value {@link TestScript_Capability#validated() validated} to validated.
     * @param validated The value for validated
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validated(boolean validated);

    /**
     * Initializes the optional value {@link TestScript_Capability#validated() validated} to validated.
     * @param validated The value for validated
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validated(Optional<Boolean> validated);

    /**
     * Initializes the optional value {@link TestScript_Capability#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link TestScript_Capability#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link TestScript_Capability#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link TestScript_Capability#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Builds a new {@link TestScript_Capability TestScript_Capability}.
     * @return An immutable instance of TestScript_Capability
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    TestScript_Capability build();
  }
}
