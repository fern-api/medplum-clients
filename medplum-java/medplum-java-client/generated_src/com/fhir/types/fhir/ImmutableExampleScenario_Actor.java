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
 * Immutable implementation of {@link ExampleScenario_Actor}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExampleScenario_Actor.builder()}.
 */
@Generated(from = "ExampleScenario_Actor", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExampleScenario_Actor implements ExampleScenario_Actor {
  private final @Nullable Markdown description;
  private final @Nullable List<Extension> extension;
  private final @Nullable String name;
  private final @Nullable Examplescenario_ActorType type;
  private final @Nullable String actorId;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableExampleScenario_Actor(
      @Nullable Markdown description,
      @Nullable List<Extension> extension,
      @Nullable String name,
      @Nullable Examplescenario_ActorType type,
      @Nullable String actorId,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension) {
    this.description = description;
    this.extension = extension;
    this.name = name;
    this.type = type;
    this.actorId = actorId;
    this.id = id;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Examplescenario_ActorType> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code actorId} attribute
   */
  @JsonProperty("actorId")
  @Override
  public Optional<String> actorId() {
    return Optional.ofNullable(actorId);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Actor#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Actor withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableExampleScenario_Actor(newValue, this.extension, this.name, this.type, this.actorId, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Actor#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Actor withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableExampleScenario_Actor(value, this.extension, this.name, this.type, this.actorId, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Actor#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Actor withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExampleScenario_Actor(this.description, newValue, this.name, this.type, this.actorId, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Actor#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Actor withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExampleScenario_Actor(this.description, value, this.name, this.type, this.actorId, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Actor#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Actor withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableExampleScenario_Actor(
        this.description,
        this.extension,
        newValue,
        this.type,
        this.actorId,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Actor#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Actor withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableExampleScenario_Actor(
        this.description,
        this.extension,
        value,
        this.type,
        this.actorId,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Actor#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Actor withType(Examplescenario_ActorType value) {
    @Nullable Examplescenario_ActorType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableExampleScenario_Actor(
        this.description,
        this.extension,
        this.name,
        newValue,
        this.actorId,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Actor#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Actor withType(Optional<? extends Examplescenario_ActorType> optional) {
    @Nullable Examplescenario_ActorType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableExampleScenario_Actor(
        this.description,
        this.extension,
        this.name,
        value,
        this.actorId,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Actor#actorId() actorId} attribute.
   * @param value The value for actorId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Actor withActorId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "actorId");
    if (Objects.equals(this.actorId, newValue)) return this;
    return new ImmutableExampleScenario_Actor(
        this.description,
        this.extension,
        this.name,
        this.type,
        newValue,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Actor#actorId() actorId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actorId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Actor withActorId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.actorId, value)) return this;
    return new ImmutableExampleScenario_Actor(this.description, this.extension, this.name, this.type, value, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Actor#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Actor withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExampleScenario_Actor(
        this.description,
        this.extension,
        this.name,
        this.type,
        this.actorId,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Actor#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Actor withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExampleScenario_Actor(
        this.description,
        this.extension,
        this.name,
        this.type,
        this.actorId,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Actor#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Actor withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExampleScenario_Actor(this.description, this.extension, this.name, this.type, this.actorId, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Actor#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Actor withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExampleScenario_Actor(this.description, this.extension, this.name, this.type, this.actorId, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExampleScenario_Actor} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExampleScenario_Actor
        && equalTo((ImmutableExampleScenario_Actor) another);
  }

  private boolean equalTo(ImmutableExampleScenario_Actor another) {
    return Objects.equals(description, another.description)
        && Objects.equals(extension, another.extension)
        && Objects.equals(name, another.name)
        && Objects.equals(type, another.type)
        && Objects.equals(actorId, another.actorId)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code description}, {@code extension}, {@code name}, {@code type}, {@code actorId}, {@code id}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(actorId);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ExampleScenario_Actor} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExampleScenario_Actor{");
    if (description != null) {
      builder.append("description=").append(description);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (name != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (type != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (actorId != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("actorId=").append(actorId);
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
  @Generated(from = "ExampleScenario_Actor", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExampleScenario_Actor {
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Examplescenario_ActorType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> actorId = Optional.empty();
    boolean actorIdIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Examplescenario_ActorType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("actorId")
    public void setActorId(Optional<String> actorId) {
      this.actorId = actorId;
      this.actorIdIsSet = true;
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
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Examplescenario_ActorType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> actorId() { throw new UnsupportedOperationException(); }
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
  static ImmutableExampleScenario_Actor fromJson(Json json) {
    ImmutableExampleScenario_Actor.Builder builder = ImmutableExampleScenario_Actor.builder();
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.actorIdIsSet) {
      builder.actorId(json.actorId);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableExampleScenario_Actor) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExampleScenario_Actor} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExampleScenario_Actor instance
   */
  public static ExampleScenario_Actor copyOf(ExampleScenario_Actor instance) {
    if (instance instanceof ImmutableExampleScenario_Actor) {
      return (ImmutableExampleScenario_Actor) instance;
    }
    return ImmutableExampleScenario_Actor.builder()
        .description(instance.description())
        .extension(instance.extension())
        .name(instance.name())
        .type(instance.type())
        .actorId(instance.actorId())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ExampleScenario_Actor ExampleScenario_Actor}.
   * <pre>
   * ImmutableExampleScenario_Actor.builder()
   *    .description(com.fhir.types.fhir.Markdown) // optional {@link ExampleScenario_Actor#description() description}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Actor#extension() extension}
   *    .name(String) // optional {@link ExampleScenario_Actor#name() name}
   *    .type(Examplescenario_ActorType) // optional {@link ExampleScenario_Actor#type() type}
   *    .actorId(String) // optional {@link ExampleScenario_Actor#actorId() actorId}
   *    .id(String) // optional {@link ExampleScenario_Actor#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Actor#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ExampleScenario_Actor builder
   */
  public static ImmutableExampleScenario_Actor.Builder builder() {
    return new ImmutableExampleScenario_Actor.Builder();
  }

  /**
   * Builds instances of type {@link ExampleScenario_Actor ExampleScenario_Actor}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExampleScenario_Actor", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DESCRIPTION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_NAME = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_ACTOR_ID = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long optBits;

    private @Nullable Markdown description;
    private @Nullable List<Extension> extension;
    private @Nullable String name;
    private @Nullable Examplescenario_ActorType type;
    private @Nullable String actorId;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Actor#description() description} to description.
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
     * Initializes the optional value {@link ExampleScenario_Actor#description() description} to description.
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
     * Initializes the optional value {@link ExampleScenario_Actor#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Actor#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Actor#name() name} to name.
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
     * Initializes the optional value {@link ExampleScenario_Actor#name() name} to name.
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
     * Initializes the optional value {@link ExampleScenario_Actor#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Examplescenario_ActorType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Actor#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Examplescenario_ActorType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Actor#actorId() actorId} to actorId.
     * @param actorId The value for actorId
     * @return {@code this} builder for chained invocation
     */
    public final Builder actorId(String actorId) {
      checkNotIsSet(actorIdIsSet(), "actorId");
      this.actorId = Objects.requireNonNull(actorId, "actorId");
      optBits |= OPT_BIT_ACTOR_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Actor#actorId() actorId} to actorId.
     * @param actorId The value for actorId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("actorId")
    public final Builder actorId(Optional<String> actorId) {
      checkNotIsSet(actorIdIsSet(), "actorId");
      this.actorId = actorId.orElse(null);
      optBits |= OPT_BIT_ACTOR_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Actor#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Actor#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Actor#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Actor#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ExampleScenario_Actor ExampleScenario_Actor}.
     * @return An immutable instance of ExampleScenario_Actor
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExampleScenario_Actor build() {
      return new ImmutableExampleScenario_Actor(description, extension, name, type, actorId, id, modifierExtension);
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean actorIdIsSet() {
      return (optBits & OPT_BIT_ACTOR_ID) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExampleScenario_Actor is strict, attribute is already set: ".concat(name));
    }
  }
}
