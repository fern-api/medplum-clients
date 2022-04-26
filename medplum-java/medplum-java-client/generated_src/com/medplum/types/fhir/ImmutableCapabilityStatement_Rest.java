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
 * Immutable implementation of {@link CapabilityStatement_Rest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCapabilityStatement_Rest.builder()}.
 */
@Generated(from = "CapabilityStatement_Rest", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCapabilityStatement_Rest
    implements CapabilityStatement_Rest {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Capabilitystatement_restMode mode;
  private final @Nullable List<CapabilityStatement_Operation> operation;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Markdown documentation;
  private final @Nullable CapabilityStatement_Security security;
  private final @Nullable List<CapabilityStatement_SearchParam> searchParam;
  private final @Nullable List<CapabilityStatement_Resource> resource;
  private final @Nullable List<CapabilityStatement_Interaction1> interaction;
  private final @Nullable List<Canonical> compartment;

  private ImmutableCapabilityStatement_Rest(
      @Nullable List<Extension> modifierExtension,
      @Nullable Capabilitystatement_restMode mode,
      @Nullable List<CapabilityStatement_Operation> operation,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Markdown documentation,
      @Nullable CapabilityStatement_Security security,
      @Nullable List<CapabilityStatement_SearchParam> searchParam,
      @Nullable List<CapabilityStatement_Resource> resource,
      @Nullable List<CapabilityStatement_Interaction1> interaction,
      @Nullable List<Canonical> compartment) {
    this.modifierExtension = modifierExtension;
    this.mode = mode;
    this.operation = operation;
    this.id = id;
    this.extension = extension;
    this.documentation = documentation;
    this.security = security;
    this.searchParam = searchParam;
    this.resource = resource;
    this.interaction = interaction;
    this.compartment = compartment;
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
   * @return The value of the {@code mode} attribute
   */
  @JsonProperty("mode")
  @Override
  public Optional<Capabilitystatement_restMode> mode() {
    return Optional.ofNullable(mode);
  }

  /**
   * @return The value of the {@code operation} attribute
   */
  @JsonProperty("operation")
  @Override
  public Optional<List<CapabilityStatement_Operation>> operation() {
    return Optional.ofNullable(operation);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code documentation} attribute
   */
  @JsonProperty("documentation")
  @Override
  public Optional<Markdown> documentation() {
    return Optional.ofNullable(documentation);
  }

  /**
   * @return The value of the {@code security} attribute
   */
  @JsonProperty("security")
  @Override
  public Optional<CapabilityStatement_Security> security() {
    return Optional.ofNullable(security);
  }

  /**
   * @return The value of the {@code searchParam} attribute
   */
  @JsonProperty("searchParam")
  @Override
  public Optional<List<CapabilityStatement_SearchParam>> searchParam() {
    return Optional.ofNullable(searchParam);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @JsonProperty("resource")
  @Override
  public Optional<List<CapabilityStatement_Resource>> resource() {
    return Optional.ofNullable(resource);
  }

  /**
   * @return The value of the {@code interaction} attribute
   */
  @JsonProperty("interaction")
  @Override
  public Optional<List<CapabilityStatement_Interaction1>> interaction() {
    return Optional.ofNullable(interaction);
  }

  /**
   * @return The value of the {@code compartment} attribute
   */
  @JsonProperty("compartment")
  @Override
  public Optional<List<Canonical>> compartment() {
    return Optional.ofNullable(compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        newValue,
        this.mode,
        this.operation,
        this.id,
        this.extension,
        this.documentation,
        this.security,
        this.searchParam,
        this.resource,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        value,
        this.mode,
        this.operation,
        this.id,
        this.extension,
        this.documentation,
        this.security,
        this.searchParam,
        this.resource,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#mode() mode} attribute.
   * @param value The value for mode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withMode(Capabilitystatement_restMode value) {
    @Nullable Capabilitystatement_restMode newValue = Objects.requireNonNull(value, "mode");
    if (this.mode == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        newValue,
        this.operation,
        this.id,
        this.extension,
        this.documentation,
        this.security,
        this.searchParam,
        this.resource,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#mode() mode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withMode(Optional<? extends Capabilitystatement_restMode> optional) {
    @Nullable Capabilitystatement_restMode value = optional.orElse(null);
    if (this.mode == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        value,
        this.operation,
        this.id,
        this.extension,
        this.documentation,
        this.security,
        this.searchParam,
        this.resource,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#operation() operation} attribute.
   * @param value The value for operation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withOperation(List<CapabilityStatement_Operation> value) {
    @Nullable List<CapabilityStatement_Operation> newValue = Objects.requireNonNull(value, "operation");
    if (this.operation == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        newValue,
        this.id,
        this.extension,
        this.documentation,
        this.security,
        this.searchParam,
        this.resource,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#operation() operation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withOperation(Optional<? extends List<CapabilityStatement_Operation>> optional) {
    @Nullable List<CapabilityStatement_Operation> value = optional.orElse(null);
    if (this.operation == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        value,
        this.id,
        this.extension,
        this.documentation,
        this.security,
        this.searchParam,
        this.resource,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        this.operation,
        newValue,
        this.extension,
        this.documentation,
        this.security,
        this.searchParam,
        this.resource,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        this.operation,
        value,
        this.extension,
        this.documentation,
        this.security,
        this.searchParam,
        this.resource,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        this.operation,
        this.id,
        newValue,
        this.documentation,
        this.security,
        this.searchParam,
        this.resource,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        this.operation,
        this.id,
        value,
        this.documentation,
        this.security,
        this.searchParam,
        this.resource,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withDocumentation(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "documentation");
    if (this.documentation == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        this.operation,
        this.id,
        this.extension,
        newValue,
        this.security,
        this.searchParam,
        this.resource,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#documentation() documentation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withDocumentation(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.documentation == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        this.operation,
        this.id,
        this.extension,
        value,
        this.security,
        this.searchParam,
        this.resource,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#security() security} attribute.
   * @param value The value for security
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withSecurity(CapabilityStatement_Security value) {
    @Nullable CapabilityStatement_Security newValue = Objects.requireNonNull(value, "security");
    if (this.security == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        this.operation,
        this.id,
        this.extension,
        this.documentation,
        newValue,
        this.searchParam,
        this.resource,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#security() security} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for security
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withSecurity(Optional<? extends CapabilityStatement_Security> optional) {
    @Nullable CapabilityStatement_Security value = optional.orElse(null);
    if (this.security == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        this.operation,
        this.id,
        this.extension,
        this.documentation,
        value,
        this.searchParam,
        this.resource,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#searchParam() searchParam} attribute.
   * @param value The value for searchParam
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withSearchParam(List<CapabilityStatement_SearchParam> value) {
    @Nullable List<CapabilityStatement_SearchParam> newValue = Objects.requireNonNull(value, "searchParam");
    if (this.searchParam == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        this.operation,
        this.id,
        this.extension,
        this.documentation,
        this.security,
        newValue,
        this.resource,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#searchParam() searchParam} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for searchParam
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withSearchParam(Optional<? extends List<CapabilityStatement_SearchParam>> optional) {
    @Nullable List<CapabilityStatement_SearchParam> value = optional.orElse(null);
    if (this.searchParam == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        this.operation,
        this.id,
        this.extension,
        this.documentation,
        this.security,
        value,
        this.resource,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withResource(List<CapabilityStatement_Resource> value) {
    @Nullable List<CapabilityStatement_Resource> newValue = Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        this.operation,
        this.id,
        this.extension,
        this.documentation,
        this.security,
        this.searchParam,
        newValue,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withResource(Optional<? extends List<CapabilityStatement_Resource>> optional) {
    @Nullable List<CapabilityStatement_Resource> value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        this.operation,
        this.id,
        this.extension,
        this.documentation,
        this.security,
        this.searchParam,
        value,
        this.interaction,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#interaction() interaction} attribute.
   * @param value The value for interaction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withInteraction(List<CapabilityStatement_Interaction1> value) {
    @Nullable List<CapabilityStatement_Interaction1> newValue = Objects.requireNonNull(value, "interaction");
    if (this.interaction == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        this.operation,
        this.id,
        this.extension,
        this.documentation,
        this.security,
        this.searchParam,
        this.resource,
        newValue,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#interaction() interaction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for interaction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withInteraction(Optional<? extends List<CapabilityStatement_Interaction1>> optional) {
    @Nullable List<CapabilityStatement_Interaction1> value = optional.orElse(null);
    if (this.interaction == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        this.operation,
        this.id,
        this.extension,
        this.documentation,
        this.security,
        this.searchParam,
        this.resource,
        value,
        this.compartment);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#compartment() compartment} attribute.
   * @param value The value for compartment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withCompartment(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "compartment");
    if (this.compartment == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        this.operation,
        this.id,
        this.extension,
        this.documentation,
        this.security,
        this.searchParam,
        this.resource,
        this.interaction,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#compartment() compartment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compartment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withCompartment(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.compartment == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.modifierExtension,
        this.mode,
        this.operation,
        this.id,
        this.extension,
        this.documentation,
        this.security,
        this.searchParam,
        this.resource,
        this.interaction,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCapabilityStatement_Rest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCapabilityStatement_Rest
        && equalTo((ImmutableCapabilityStatement_Rest) another);
  }

  private boolean equalTo(ImmutableCapabilityStatement_Rest another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(mode, another.mode)
        && Objects.equals(operation, another.operation)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(documentation, another.documentation)
        && Objects.equals(security, another.security)
        && Objects.equals(searchParam, another.searchParam)
        && Objects.equals(resource, another.resource)
        && Objects.equals(interaction, another.interaction)
        && Objects.equals(compartment, another.compartment);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code mode}, {@code operation}, {@code id}, {@code extension}, {@code documentation}, {@code security}, {@code searchParam}, {@code resource}, {@code interaction}, {@code compartment}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(mode);
    h += (h << 5) + Objects.hashCode(operation);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(documentation);
    h += (h << 5) + Objects.hashCode(security);
    h += (h << 5) + Objects.hashCode(searchParam);
    h += (h << 5) + Objects.hashCode(resource);
    h += (h << 5) + Objects.hashCode(interaction);
    h += (h << 5) + Objects.hashCode(compartment);
    return h;
  }

  /**
   * Prints the immutable value {@code CapabilityStatement_Rest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CapabilityStatement_Rest{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (mode != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("mode=").append(mode);
    }
    if (operation != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("operation=").append(operation);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (documentation != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (security != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("security=").append(security);
    }
    if (searchParam != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("searchParam=").append(searchParam);
    }
    if (resource != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (interaction != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("interaction=").append(interaction);
    }
    if (compartment != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("compartment=").append(compartment);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CapabilityStatement_Rest", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CapabilityStatement_Rest {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Capabilitystatement_restMode> mode = Optional.empty();
    boolean modeIsSet;
    @Nullable Optional<List<CapabilityStatement_Operation>> operation = Optional.empty();
    boolean operationIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Markdown> documentation = Optional.empty();
    boolean documentationIsSet;
    @Nullable Optional<CapabilityStatement_Security> security = Optional.empty();
    boolean securityIsSet;
    @Nullable Optional<List<CapabilityStatement_SearchParam>> searchParam = Optional.empty();
    boolean searchParamIsSet;
    @Nullable Optional<List<CapabilityStatement_Resource>> resource = Optional.empty();
    boolean resourceIsSet;
    @Nullable Optional<List<CapabilityStatement_Interaction1>> interaction = Optional.empty();
    boolean interactionIsSet;
    @Nullable Optional<List<Canonical>> compartment = Optional.empty();
    boolean compartmentIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("mode")
    public void setMode(Optional<Capabilitystatement_restMode> mode) {
      this.mode = mode;
      this.modeIsSet = true;
    }
    @JsonProperty("operation")
    public void setOperation(Optional<List<CapabilityStatement_Operation>> operation) {
      this.operation = operation;
      this.operationIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("documentation")
    public void setDocumentation(Optional<Markdown> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @JsonProperty("security")
    public void setSecurity(Optional<CapabilityStatement_Security> security) {
      this.security = security;
      this.securityIsSet = true;
    }
    @JsonProperty("searchParam")
    public void setSearchParam(Optional<List<CapabilityStatement_SearchParam>> searchParam) {
      this.searchParam = searchParam;
      this.searchParamIsSet = true;
    }
    @JsonProperty("resource")
    public void setResource(Optional<List<CapabilityStatement_Resource>> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @JsonProperty("interaction")
    public void setInteraction(Optional<List<CapabilityStatement_Interaction1>> interaction) {
      this.interaction = interaction;
      this.interactionIsSet = true;
    }
    @JsonProperty("compartment")
    public void setCompartment(Optional<List<Canonical>> compartment) {
      this.compartment = compartment;
      this.compartmentIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Capabilitystatement_restMode> mode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CapabilityStatement_Operation>> operation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CapabilityStatement_Security> security() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CapabilityStatement_SearchParam>> searchParam() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CapabilityStatement_Resource>> resource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CapabilityStatement_Interaction1>> interaction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> compartment() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCapabilityStatement_Rest fromJson(Json json) {
    ImmutableCapabilityStatement_Rest.Builder builder = ImmutableCapabilityStatement_Rest.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.modeIsSet) {
      builder.mode(json.mode);
    }
    if (json.operationIsSet) {
      builder.operation(json.operation);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.securityIsSet) {
      builder.security(json.security);
    }
    if (json.searchParamIsSet) {
      builder.searchParam(json.searchParam);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.interactionIsSet) {
      builder.interaction(json.interaction);
    }
    if (json.compartmentIsSet) {
      builder.compartment(json.compartment);
    }
    return (ImmutableCapabilityStatement_Rest) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CapabilityStatement_Rest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CapabilityStatement_Rest instance
   */
  public static CapabilityStatement_Rest copyOf(CapabilityStatement_Rest instance) {
    if (instance instanceof ImmutableCapabilityStatement_Rest) {
      return (ImmutableCapabilityStatement_Rest) instance;
    }
    return ImmutableCapabilityStatement_Rest.builder()
        .modifierExtension(instance.modifierExtension())
        .mode(instance.mode())
        .operation(instance.operation())
        .id(instance.id())
        .extension(instance.extension())
        .documentation(instance.documentation())
        .security(instance.security())
        .searchParam(instance.searchParam())
        .resource(instance.resource())
        .interaction(instance.interaction())
        .compartment(instance.compartment())
        .build();
  }

  /**
   * Creates a builder for {@link CapabilityStatement_Rest CapabilityStatement_Rest}.
   * <pre>
   * ImmutableCapabilityStatement_Rest.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Rest#modifierExtension() modifierExtension}
   *    .mode(com.medplum.types.fhir.Capabilitystatement_restMode) // optional {@link CapabilityStatement_Rest#mode() mode}
   *    .operation(List&amp;lt;com.medplum.types.fhir.CapabilityStatement_Operation&amp;gt;) // optional {@link CapabilityStatement_Rest#operation() operation}
   *    .id(String) // optional {@link CapabilityStatement_Rest#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Rest#extension() extension}
   *    .documentation(com.medplum.types.fhir.Markdown) // optional {@link CapabilityStatement_Rest#documentation() documentation}
   *    .security(com.medplum.types.fhir.CapabilityStatement_Security) // optional {@link CapabilityStatement_Rest#security() security}
   *    .searchParam(List&amp;lt;com.medplum.types.fhir.CapabilityStatement_SearchParam&amp;gt;) // optional {@link CapabilityStatement_Rest#searchParam() searchParam}
   *    .resource(List&amp;lt;com.medplum.types.fhir.CapabilityStatement_Resource&amp;gt;) // optional {@link CapabilityStatement_Rest#resource() resource}
   *    .interaction(List&amp;lt;com.medplum.types.fhir.CapabilityStatement_Interaction1&amp;gt;) // optional {@link CapabilityStatement_Rest#interaction() interaction}
   *    .compartment(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link CapabilityStatement_Rest#compartment() compartment}
   *    .build();
   * </pre>
   * @return A new CapabilityStatement_Rest builder
   */
  public static ImmutableCapabilityStatement_Rest.Builder builder() {
    return new ImmutableCapabilityStatement_Rest.Builder();
  }

  /**
   * Builds instances of type {@link CapabilityStatement_Rest CapabilityStatement_Rest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CapabilityStatement_Rest", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODE = 0x2L;
    private static final long OPT_BIT_OPERATION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_DOCUMENTATION = 0x20L;
    private static final long OPT_BIT_SECURITY = 0x40L;
    private static final long OPT_BIT_SEARCH_PARAM = 0x80L;
    private static final long OPT_BIT_RESOURCE = 0x100L;
    private static final long OPT_BIT_INTERACTION = 0x200L;
    private static final long OPT_BIT_COMPARTMENT = 0x400L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Capabilitystatement_restMode mode;
    private @Nullable List<CapabilityStatement_Operation> operation;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Markdown documentation;
    private @Nullable CapabilityStatement_Security security;
    private @Nullable List<CapabilityStatement_SearchParam> searchParam;
    private @Nullable List<CapabilityStatement_Resource> resource;
    private @Nullable List<CapabilityStatement_Interaction1> interaction;
    private @Nullable List<Canonical> compartment;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Rest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Rest#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    public final Builder mode(Capabilitystatement_restMode mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = Objects.requireNonNull(mode, "mode");
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("mode")
    public final Builder mode(Optional<? extends Capabilitystatement_restMode> mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = mode.orElse(null);
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#operation() operation} to operation.
     * @param operation The value for operation
     * @return {@code this} builder for chained invocation
     */
    public final Builder operation(List<CapabilityStatement_Operation> operation) {
      checkNotIsSet(operationIsSet(), "operation");
      this.operation = Objects.requireNonNull(operation, "operation");
      optBits |= OPT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#operation() operation} to operation.
     * @param operation The value for operation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operation")
    public final Builder operation(Optional<? extends List<CapabilityStatement_Operation>> operation) {
      checkNotIsSet(operationIsSet(), "operation");
      this.operation = operation.orElse(null);
      optBits |= OPT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Rest#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Rest#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_Rest#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_Rest#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentation(Markdown documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("documentation")
    public final Builder documentation(Optional<? extends Markdown> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = documentation.orElse(null);
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#security() security} to security.
     * @param security The value for security
     * @return {@code this} builder for chained invocation
     */
    public final Builder security(CapabilityStatement_Security security) {
      checkNotIsSet(securityIsSet(), "security");
      this.security = Objects.requireNonNull(security, "security");
      optBits |= OPT_BIT_SECURITY;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#security() security} to security.
     * @param security The value for security
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("security")
    public final Builder security(Optional<? extends CapabilityStatement_Security> security) {
      checkNotIsSet(securityIsSet(), "security");
      this.security = security.orElse(null);
      optBits |= OPT_BIT_SECURITY;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#searchParam() searchParam} to searchParam.
     * @param searchParam The value for searchParam
     * @return {@code this} builder for chained invocation
     */
    public final Builder searchParam(List<CapabilityStatement_SearchParam> searchParam) {
      checkNotIsSet(searchParamIsSet(), "searchParam");
      this.searchParam = Objects.requireNonNull(searchParam, "searchParam");
      optBits |= OPT_BIT_SEARCH_PARAM;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#searchParam() searchParam} to searchParam.
     * @param searchParam The value for searchParam
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("searchParam")
    public final Builder searchParam(Optional<? extends List<CapabilityStatement_SearchParam>> searchParam) {
      checkNotIsSet(searchParamIsSet(), "searchParam");
      this.searchParam = searchParam.orElse(null);
      optBits |= OPT_BIT_SEARCH_PARAM;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(List<CapabilityStatement_Resource> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resource")
    public final Builder resource(Optional<? extends List<CapabilityStatement_Resource>> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#interaction() interaction} to interaction.
     * @param interaction The value for interaction
     * @return {@code this} builder for chained invocation
     */
    public final Builder interaction(List<CapabilityStatement_Interaction1> interaction) {
      checkNotIsSet(interactionIsSet(), "interaction");
      this.interaction = Objects.requireNonNull(interaction, "interaction");
      optBits |= OPT_BIT_INTERACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#interaction() interaction} to interaction.
     * @param interaction The value for interaction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("interaction")
    public final Builder interaction(Optional<? extends List<CapabilityStatement_Interaction1>> interaction) {
      checkNotIsSet(interactionIsSet(), "interaction");
      this.interaction = interaction.orElse(null);
      optBits |= OPT_BIT_INTERACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#compartment() compartment} to compartment.
     * @param compartment The value for compartment
     * @return {@code this} builder for chained invocation
     */
    public final Builder compartment(List<Canonical> compartment) {
      checkNotIsSet(compartmentIsSet(), "compartment");
      this.compartment = Objects.requireNonNull(compartment, "compartment");
      optBits |= OPT_BIT_COMPARTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#compartment() compartment} to compartment.
     * @param compartment The value for compartment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("compartment")
    public final Builder compartment(Optional<? extends List<Canonical>> compartment) {
      checkNotIsSet(compartmentIsSet(), "compartment");
      this.compartment = compartment.orElse(null);
      optBits |= OPT_BIT_COMPARTMENT;
      return this;
    }

    /**
     * Builds a new {@link CapabilityStatement_Rest CapabilityStatement_Rest}.
     * @return An immutable instance of CapabilityStatement_Rest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CapabilityStatement_Rest build() {
      return new ImmutableCapabilityStatement_Rest(
          modifierExtension,
          mode,
          operation,
          id,
          extension,
          documentation,
          security,
          searchParam,
          resource,
          interaction,
          compartment);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean modeIsSet() {
      return (optBits & OPT_BIT_MODE) != 0;
    }

    private boolean operationIsSet() {
      return (optBits & OPT_BIT_OPERATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean securityIsSet() {
      return (optBits & OPT_BIT_SECURITY) != 0;
    }

    private boolean searchParamIsSet() {
      return (optBits & OPT_BIT_SEARCH_PARAM) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean interactionIsSet() {
      return (optBits & OPT_BIT_INTERACTION) != 0;
    }

    private boolean compartmentIsSet() {
      return (optBits & OPT_BIT_COMPARTMENT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CapabilityStatement_Rest is strict, attribute is already set: ".concat(name));
    }
  }
}
