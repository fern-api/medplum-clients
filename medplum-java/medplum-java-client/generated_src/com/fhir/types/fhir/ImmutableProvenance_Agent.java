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
 * Immutable implementation of {@link Provenance_Agent}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProvenance_Agent.builder()}.
 */
@Generated(from = "Provenance_Agent", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableProvenance_Agent implements Provenance_Agent {
  private final @Nullable String id;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<Extension> extension;
  private final Reference who;
  private final @Nullable List<CodeableConcept> role;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference onBehalfOf;

  private ImmutableProvenance_Agent(
      @Nullable String id,
      @Nullable CodeableConcept type,
      @Nullable List<Extension> extension,
      Reference who,
      @Nullable List<CodeableConcept> role,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference onBehalfOf) {
    this.id = id;
    this.type = type;
    this.extension = extension;
    this.who = who;
    this.role = role;
    this.modifierExtension = modifierExtension;
    this.onBehalfOf = onBehalfOf;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code who} attribute
   */
  @JsonProperty("who")
  @Override
  public Reference who() {
    return who;
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @JsonProperty("role")
  @Override
  public Optional<List<CodeableConcept>> role() {
    return Optional.ofNullable(role);
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
   * @return The value of the {@code onBehalfOf} attribute
   */
  @JsonProperty("onBehalfOf")
  @Override
  public Optional<Reference> onBehalfOf() {
    return Optional.ofNullable(onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance_Agent#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance_Agent withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableProvenance_Agent(
        newValue,
        this.type,
        this.extension,
        this.who,
        this.role,
        this.modifierExtension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance_Agent#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance_Agent withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableProvenance_Agent(value, this.type, this.extension, this.who, this.role, this.modifierExtension, this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance_Agent#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance_Agent withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableProvenance_Agent(this.id, newValue, this.extension, this.who, this.role, this.modifierExtension, this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance_Agent#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance_Agent withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableProvenance_Agent(this.id, value, this.extension, this.who, this.role, this.modifierExtension, this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance_Agent#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance_Agent withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableProvenance_Agent(this.id, this.type, newValue, this.who, this.role, this.modifierExtension, this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance_Agent#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance_Agent withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableProvenance_Agent(this.id, this.type, value, this.who, this.role, this.modifierExtension, this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Provenance_Agent#who() who} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for who
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProvenance_Agent withWho(Reference value) {
    if (this.who == value) return this;
    Reference newValue = Objects.requireNonNull(value, "who");
    return new ImmutableProvenance_Agent(
        this.id,
        this.type,
        this.extension,
        newValue,
        this.role,
        this.modifierExtension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance_Agent#role() role} attribute.
   * @param value The value for role
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance_Agent withRole(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "role");
    if (this.role == newValue) return this;
    return new ImmutableProvenance_Agent(this.id, this.type, this.extension, this.who, newValue, this.modifierExtension, this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance_Agent#role() role} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for role
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance_Agent withRole(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.role == value) return this;
    return new ImmutableProvenance_Agent(this.id, this.type, this.extension, this.who, value, this.modifierExtension, this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance_Agent#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance_Agent withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableProvenance_Agent(this.id, this.type, this.extension, this.who, this.role, newValue, this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance_Agent#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance_Agent withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableProvenance_Agent(this.id, this.type, this.extension, this.who, this.role, value, this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance_Agent#onBehalfOf() onBehalfOf} attribute.
   * @param value The value for onBehalfOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance_Agent withOnBehalfOf(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "onBehalfOf");
    if (this.onBehalfOf == newValue) return this;
    return new ImmutableProvenance_Agent(this.id, this.type, this.extension, this.who, this.role, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance_Agent#onBehalfOf() onBehalfOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onBehalfOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance_Agent withOnBehalfOf(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.onBehalfOf == value) return this;
    return new ImmutableProvenance_Agent(this.id, this.type, this.extension, this.who, this.role, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProvenance_Agent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProvenance_Agent
        && equalTo((ImmutableProvenance_Agent) another);
  }

  private boolean equalTo(ImmutableProvenance_Agent another) {
    return Objects.equals(id, another.id)
        && Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && who.equals(another.who)
        && Objects.equals(role, another.role)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(onBehalfOf, another.onBehalfOf);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code type}, {@code extension}, {@code who}, {@code role}, {@code modifierExtension}, {@code onBehalfOf}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + who.hashCode();
    h += (h << 5) + Objects.hashCode(role);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(onBehalfOf);
    return h;
  }

  /**
   * Prints the immutable value {@code Provenance_Agent} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Provenance_Agent{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("who=").append(who);
    if (role != null) {
      builder.append(", ");
      builder.append("role=").append(role);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (onBehalfOf != null) {
      builder.append(", ");
      builder.append("onBehalfOf=").append(onBehalfOf);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Provenance_Agent", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Provenance_Agent {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Reference who;
    @Nullable Optional<List<CodeableConcept>> role = Optional.empty();
    boolean roleIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> onBehalfOf = Optional.empty();
    boolean onBehalfOfIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("who")
    public void setWho(Reference who) {
      this.who = who;
    }
    @JsonProperty("role")
    public void setRole(Optional<List<CodeableConcept>> role) {
      this.role = role;
      this.roleIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("onBehalfOf")
    public void setOnBehalfOf(Optional<Reference> onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      this.onBehalfOfIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference who() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> role() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> onBehalfOf() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableProvenance_Agent fromJson(Json json) {
    ImmutableProvenance_Agent.Builder builder = ((ImmutableProvenance_Agent.Builder) ImmutableProvenance_Agent.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.who != null) {
      builder.who(json.who);
    }
    if (json.roleIsSet) {
      builder.role(json.role);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.onBehalfOfIsSet) {
      builder.onBehalfOf(json.onBehalfOf);
    }
    return (ImmutableProvenance_Agent) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Provenance_Agent} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Provenance_Agent instance
   */
  public static Provenance_Agent copyOf(Provenance_Agent instance) {
    if (instance instanceof ImmutableProvenance_Agent) {
      return (ImmutableProvenance_Agent) instance;
    }
    return ((ImmutableProvenance_Agent.Builder) ImmutableProvenance_Agent.builder())
        .id(instance.id())
        .type(instance.type())
        .extension(instance.extension())
        .who(instance.who())
        .role(instance.role())
        .modifierExtension(instance.modifierExtension())
        .onBehalfOf(instance.onBehalfOf())
        .build();
  }

  /**
   * Creates a builder for {@link Provenance_Agent Provenance_Agent}.
   * <pre>
   * ImmutableProvenance_Agent.builder()
   *    .id(String) // optional {@link Provenance_Agent#id() id}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link Provenance_Agent#type() type}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Provenance_Agent#extension() extension}
   *    .who(com.fhir.types.fhir.Reference) // required {@link Provenance_Agent#who() who}
   *    .role(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Provenance_Agent#role() role}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Provenance_Agent#modifierExtension() modifierExtension}
   *    .onBehalfOf(com.fhir.types.fhir.Reference) // optional {@link Provenance_Agent#onBehalfOf() onBehalfOf}
   *    .build();
   * </pre>
   * @return A new Provenance_Agent builder
   */
  public static WhoBuildStage builder() {
    return new ImmutableProvenance_Agent.Builder();
  }

  /**
   * Builds instances of type {@link Provenance_Agent Provenance_Agent}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Provenance_Agent", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements WhoBuildStage, BuildFinal {
    private static final long INIT_BIT_WHO = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ROLE = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_ON_BEHALF_OF = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String id;
    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> extension;
    private @Nullable Reference who;
    private @Nullable List<CodeableConcept> role;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference onBehalfOf;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Provenance_Agent#id() id} to id.
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
     * Initializes the optional value {@link Provenance_Agent#id() id} to id.
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
     * Initializes the optional value {@link Provenance_Agent#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance_Agent#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance_Agent#extension() extension} to extension.
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
     * Initializes the optional value {@link Provenance_Agent#extension() extension} to extension.
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
     * Initializes the value for the {@link Provenance_Agent#who() who} attribute.
     * @param who The value for who 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("who")
    public final Builder who(Reference who) {
      checkNotIsSet(whoIsSet(), "who");
      this.who = Objects.requireNonNull(who, "who");
      initBits &= ~INIT_BIT_WHO;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance_Agent#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    public final Builder role(List<CodeableConcept> role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = Objects.requireNonNull(role, "role");
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance_Agent#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("role")
    public final Builder role(Optional<? extends List<CodeableConcept>> role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = role.orElse(null);
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance_Agent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Provenance_Agent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Provenance_Agent#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder onBehalfOf(Reference onBehalfOf) {
      checkNotIsSet(onBehalfOfIsSet(), "onBehalfOf");
      this.onBehalfOf = Objects.requireNonNull(onBehalfOf, "onBehalfOf");
      optBits |= OPT_BIT_ON_BEHALF_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance_Agent#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onBehalfOf")
    public final Builder onBehalfOf(Optional<? extends Reference> onBehalfOf) {
      checkNotIsSet(onBehalfOfIsSet(), "onBehalfOf");
      this.onBehalfOf = onBehalfOf.orElse(null);
      optBits |= OPT_BIT_ON_BEHALF_OF;
      return this;
    }

    /**
     * Builds a new {@link Provenance_Agent Provenance_Agent}.
     * @return An immutable instance of Provenance_Agent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Provenance_Agent build() {
      checkRequiredAttributes();
      return new ImmutableProvenance_Agent(id, type, extension, who, role, modifierExtension, onBehalfOf);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean roleIsSet() {
      return (optBits & OPT_BIT_ROLE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean onBehalfOfIsSet() {
      return (optBits & OPT_BIT_ON_BEHALF_OF) != 0;
    }

    private boolean whoIsSet() {
      return (initBits & INIT_BIT_WHO) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Provenance_Agent is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!whoIsSet()) attributes.add("who");
      return "Cannot build Provenance_Agent, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Provenance_Agent", generator = "Immutables")
  public interface WhoBuildStage {
    /**
     * Initializes the value for the {@link Provenance_Agent#who() who} attribute.
     * @param who The value for who 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal who(Reference who);
  }

  @Generated(from = "Provenance_Agent", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Provenance_Agent#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Provenance_Agent#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Provenance_Agent#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link Provenance_Agent#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link Provenance_Agent#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Provenance_Agent#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Provenance_Agent#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    BuildFinal role(List<CodeableConcept> role);

    /**
     * Initializes the optional value {@link Provenance_Agent#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal role(Optional<? extends List<CodeableConcept>> role);

    /**
     * Initializes the optional value {@link Provenance_Agent#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Provenance_Agent#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Provenance_Agent#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onBehalfOf(Reference onBehalfOf);

    /**
     * Initializes the optional value {@link Provenance_Agent#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onBehalfOf(Optional<? extends Reference> onBehalfOf);

    /**
     * Builds a new {@link Provenance_Agent Provenance_Agent}.
     * @return An immutable instance of Provenance_Agent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Provenance_Agent build();
  }
}
