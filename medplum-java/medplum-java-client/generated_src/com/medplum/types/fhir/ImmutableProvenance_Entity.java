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
 * Immutable implementation of {@link Provenance_Entity}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProvenance_Entity.builder()}.
 */
@Generated(from = "Provenance_Entity", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableProvenance_Entity implements Provenance_Entity {
  private final @Nullable Provenance_entityRole role;
  private final @Nullable List<Provenance_Agent> agent;
  private final @Nullable String id;
  private final Reference what;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableProvenance_Entity(
      @Nullable Provenance_entityRole role,
      @Nullable List<Provenance_Agent> agent,
      @Nullable String id,
      Reference what,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension) {
    this.role = role;
    this.agent = agent;
    this.id = id;
    this.what = what;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @JsonProperty("role")
  @Override
  public Optional<Provenance_entityRole> role() {
    return Optional.ofNullable(role);
  }

  /**
   * @return The value of the {@code agent} attribute
   */
  @JsonProperty("agent")
  @Override
  public Optional<List<Provenance_Agent>> agent() {
    return Optional.ofNullable(agent);
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
   * @return The value of the {@code what} attribute
   */
  @JsonProperty("what")
  @Override
  public Reference what() {
    return what;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance_Entity#role() role} attribute.
   * @param value The value for role
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance_Entity withRole(Provenance_entityRole value) {
    @Nullable Provenance_entityRole newValue = Objects.requireNonNull(value, "role");
    if (this.role == newValue) return this;
    return new ImmutableProvenance_Entity(newValue, this.agent, this.id, this.what, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance_Entity#role() role} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for role
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance_Entity withRole(Optional<? extends Provenance_entityRole> optional) {
    @Nullable Provenance_entityRole value = optional.orElse(null);
    if (this.role == value) return this;
    return new ImmutableProvenance_Entity(value, this.agent, this.id, this.what, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance_Entity#agent() agent} attribute.
   * @param value The value for agent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance_Entity withAgent(List<Provenance_Agent> value) {
    @Nullable List<Provenance_Agent> newValue = Objects.requireNonNull(value, "agent");
    if (this.agent == newValue) return this;
    return new ImmutableProvenance_Entity(this.role, newValue, this.id, this.what, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance_Entity#agent() agent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for agent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance_Entity withAgent(Optional<? extends List<Provenance_Agent>> optional) {
    @Nullable List<Provenance_Agent> value = optional.orElse(null);
    if (this.agent == value) return this;
    return new ImmutableProvenance_Entity(this.role, value, this.id, this.what, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance_Entity#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance_Entity withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableProvenance_Entity(this.role, this.agent, newValue, this.what, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance_Entity#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance_Entity withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableProvenance_Entity(this.role, this.agent, value, this.what, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Provenance_Entity#what() what} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for what
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProvenance_Entity withWhat(Reference value) {
    if (this.what == value) return this;
    Reference newValue = Objects.requireNonNull(value, "what");
    return new ImmutableProvenance_Entity(this.role, this.agent, this.id, newValue, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance_Entity#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance_Entity withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableProvenance_Entity(this.role, this.agent, this.id, this.what, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance_Entity#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance_Entity withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableProvenance_Entity(this.role, this.agent, this.id, this.what, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Provenance_Entity#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProvenance_Entity withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableProvenance_Entity(this.role, this.agent, this.id, this.what, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Provenance_Entity#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProvenance_Entity withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableProvenance_Entity(this.role, this.agent, this.id, this.what, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProvenance_Entity} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProvenance_Entity
        && equalTo((ImmutableProvenance_Entity) another);
  }

  private boolean equalTo(ImmutableProvenance_Entity another) {
    return Objects.equals(role, another.role)
        && Objects.equals(agent, another.agent)
        && Objects.equals(id, another.id)
        && what.equals(another.what)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code role}, {@code agent}, {@code id}, {@code what}, {@code extension}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(role);
    h += (h << 5) + Objects.hashCode(agent);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + what.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Provenance_Entity} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Provenance_Entity{");
    if (role != null) {
      builder.append("role=").append(role);
    }
    if (agent != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("agent=").append(agent);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("what=").append(what);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Provenance_Entity", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Provenance_Entity {
    @Nullable Optional<Provenance_entityRole> role = Optional.empty();
    boolean roleIsSet;
    @Nullable Optional<List<Provenance_Agent>> agent = Optional.empty();
    boolean agentIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Reference what;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("role")
    public void setRole(Optional<Provenance_entityRole> role) {
      this.role = role;
      this.roleIsSet = true;
    }
    @JsonProperty("agent")
    public void setAgent(Optional<List<Provenance_Agent>> agent) {
      this.agent = agent;
      this.agentIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("what")
    public void setWhat(Reference what) {
      this.what = what;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<Provenance_entityRole> role() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Provenance_Agent>> agent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Reference what() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableProvenance_Entity fromJson(Json json) {
    ImmutableProvenance_Entity.Builder builder = ((ImmutableProvenance_Entity.Builder) ImmutableProvenance_Entity.builder());
    if (json.roleIsSet) {
      builder.role(json.role);
    }
    if (json.agentIsSet) {
      builder.agent(json.agent);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.what != null) {
      builder.what(json.what);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableProvenance_Entity) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Provenance_Entity} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Provenance_Entity instance
   */
  public static Provenance_Entity copyOf(Provenance_Entity instance) {
    if (instance instanceof ImmutableProvenance_Entity) {
      return (ImmutableProvenance_Entity) instance;
    }
    return ((ImmutableProvenance_Entity.Builder) ImmutableProvenance_Entity.builder())
        .role(instance.role())
        .agent(instance.agent())
        .id(instance.id())
        .what(instance.what())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Provenance_Entity Provenance_Entity}.
   * <pre>
   * ImmutableProvenance_Entity.builder()
   *    .role(com.medplum.types.fhir.Provenance_entityRole) // optional {@link Provenance_Entity#role() role}
   *    .agent(List&amp;lt;com.medplum.types.fhir.Provenance_Agent&amp;gt;) // optional {@link Provenance_Entity#agent() agent}
   *    .id(String) // optional {@link Provenance_Entity#id() id}
   *    .what(com.medplum.types.fhir.Reference) // required {@link Provenance_Entity#what() what}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Provenance_Entity#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Provenance_Entity#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new Provenance_Entity builder
   */
  public static WhatBuildStage builder() {
    return new ImmutableProvenance_Entity.Builder();
  }

  /**
   * Builds instances of type {@link Provenance_Entity Provenance_Entity}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Provenance_Entity", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements WhatBuildStage, BuildFinal {
    private static final long INIT_BIT_WHAT = 0x1L;
    private static final long OPT_BIT_ROLE = 0x1L;
    private static final long OPT_BIT_AGENT = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Provenance_entityRole role;
    private @Nullable List<Provenance_Agent> agent;
    private @Nullable String id;
    private @Nullable Reference what;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Provenance_Entity#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    public final Builder role(Provenance_entityRole role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = Objects.requireNonNull(role, "role");
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance_Entity#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("role")
    public final Builder role(Optional<? extends Provenance_entityRole> role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = role.orElse(null);
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance_Entity#agent() agent} to agent.
     * @param agent The value for agent
     * @return {@code this} builder for chained invocation
     */
    public final Builder agent(List<Provenance_Agent> agent) {
      checkNotIsSet(agentIsSet(), "agent");
      this.agent = Objects.requireNonNull(agent, "agent");
      optBits |= OPT_BIT_AGENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance_Entity#agent() agent} to agent.
     * @param agent The value for agent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("agent")
    public final Builder agent(Optional<? extends List<Provenance_Agent>> agent) {
      checkNotIsSet(agentIsSet(), "agent");
      this.agent = agent.orElse(null);
      optBits |= OPT_BIT_AGENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance_Entity#id() id} to id.
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
     * Initializes the optional value {@link Provenance_Entity#id() id} to id.
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
     * Initializes the value for the {@link Provenance_Entity#what() what} attribute.
     * @param what The value for what 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("what")
    public final Builder what(Reference what) {
      checkNotIsSet(whatIsSet(), "what");
      this.what = Objects.requireNonNull(what, "what");
      initBits &= ~INIT_BIT_WHAT;
      return this;
    }

    /**
     * Initializes the optional value {@link Provenance_Entity#extension() extension} to extension.
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
     * Initializes the optional value {@link Provenance_Entity#extension() extension} to extension.
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
     * Initializes the optional value {@link Provenance_Entity#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Provenance_Entity#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link Provenance_Entity Provenance_Entity}.
     * @return An immutable instance of Provenance_Entity
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Provenance_Entity build() {
      checkRequiredAttributes();
      return new ImmutableProvenance_Entity(role, agent, id, what, extension, modifierExtension);
    }

    private boolean roleIsSet() {
      return (optBits & OPT_BIT_ROLE) != 0;
    }

    private boolean agentIsSet() {
      return (optBits & OPT_BIT_AGENT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean whatIsSet() {
      return (initBits & INIT_BIT_WHAT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Provenance_Entity is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!whatIsSet()) attributes.add("what");
      return "Cannot build Provenance_Entity, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Provenance_Entity", generator = "Immutables")
  public interface WhatBuildStage {
    /**
     * Initializes the value for the {@link Provenance_Entity#what() what} attribute.
     * @param what The value for what 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal what(Reference what);
  }

  @Generated(from = "Provenance_Entity", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Provenance_Entity#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    BuildFinal role(Provenance_entityRole role);

    /**
     * Initializes the optional value {@link Provenance_Entity#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal role(Optional<? extends Provenance_entityRole> role);

    /**
     * Initializes the optional value {@link Provenance_Entity#agent() agent} to agent.
     * @param agent The value for agent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal agent(List<Provenance_Agent> agent);

    /**
     * Initializes the optional value {@link Provenance_Entity#agent() agent} to agent.
     * @param agent The value for agent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal agent(Optional<? extends List<Provenance_Agent>> agent);

    /**
     * Initializes the optional value {@link Provenance_Entity#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Provenance_Entity#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Provenance_Entity#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Provenance_Entity#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Provenance_Entity#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Provenance_Entity#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link Provenance_Entity Provenance_Entity}.
     * @return An immutable instance of Provenance_Entity
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Provenance_Entity build();
  }
}