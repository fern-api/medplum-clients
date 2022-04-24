//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CapabilityStatement_Rest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCapabilityStatement_Rest.builder()}.
 */
@org.immutables.value.Generated(from = "CapabilityStatement_Rest", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCapabilityStatement_Rest implements com.fhir.CapabilityStatement_Rest {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> compartment;
  private final @javax.annotation.Nullable com.fhir.markdown documentation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Operation> operation;
  private final @javax.annotation.Nullable com.fhir.CapabilityStatement_Security security;
  private final @javax.annotation.Nullable com.fhir.Capabilitystatement_restMode mode;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_SearchParam> searchParam;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Interaction1> interaction;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Resource> resource;

  private ImmutableCapabilityStatement_Rest(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> compartment,
      @javax.annotation.Nullable com.fhir.markdown documentation,
      @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Operation> operation,
      @javax.annotation.Nullable com.fhir.CapabilityStatement_Security security,
      @javax.annotation.Nullable com.fhir.Capabilitystatement_restMode mode,
      @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_SearchParam> searchParam,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Interaction1> interaction,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Resource> resource) {
    this.extension = extension;
    this.compartment = compartment;
    this.documentation = documentation;
    this.operation = operation;
    this.security = security;
    this.mode = mode;
    this.searchParam = searchParam;
    this.modifierExtension = modifierExtension;
    this.interaction = interaction;
    this.id = id;
    this.resource = resource;
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code compartment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("compartment")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> compartment() {
    return java.util.Optional.ofNullable(compartment);
  }

  /**
   * @return The value of the {@code documentation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("documentation")
  @Override
  public java.util.Optional<com.fhir.markdown> documentation() {
    return java.util.Optional.ofNullable(documentation);
  }

  /**
   * @return The value of the {@code operation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("operation")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Operation>> operation() {
    return java.util.Optional.ofNullable(operation);
  }

  /**
   * @return The value of the {@code security} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("security")
  @Override
  public java.util.Optional<com.fhir.CapabilityStatement_Security> security() {
    return java.util.Optional.ofNullable(security);
  }

  /**
   * @return The value of the {@code mode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("mode")
  @Override
  public java.util.Optional<com.fhir.Capabilitystatement_restMode> mode() {
    return java.util.Optional.ofNullable(mode);
  }

  /**
   * @return The value of the {@code searchParam} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("searchParam")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_SearchParam>> searchParam() {
    return java.util.Optional.ofNullable(searchParam);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code interaction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("interaction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Interaction1>> interaction() {
    return java.util.Optional.ofNullable(interaction);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resource")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Resource>> resource() {
    return java.util.Optional.ofNullable(resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        newValue,
        this.compartment,
        this.documentation,
        this.operation,
        this.security,
        this.mode,
        this.searchParam,
        this.modifierExtension,
        this.interaction,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        value,
        this.compartment,
        this.documentation,
        this.operation,
        this.security,
        this.mode,
        this.searchParam,
        this.modifierExtension,
        this.interaction,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#compartment() compartment} attribute.
   * @param value The value for compartment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withCompartment(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "compartment");
    if (this.compartment == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        newValue,
        this.documentation,
        this.operation,
        this.security,
        this.mode,
        this.searchParam,
        this.modifierExtension,
        this.interaction,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#compartment() compartment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compartment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withCompartment(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.compartment == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        value,
        this.documentation,
        this.operation,
        this.security,
        this.mode,
        this.searchParam,
        this.modifierExtension,
        this.interaction,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withDocumentation(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "documentation");
    if (this.documentation == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        newValue,
        this.operation,
        this.security,
        this.mode,
        this.searchParam,
        this.modifierExtension,
        this.interaction,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#documentation() documentation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withDocumentation(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.documentation == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        value,
        this.operation,
        this.security,
        this.mode,
        this.searchParam,
        this.modifierExtension,
        this.interaction,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#operation() operation} attribute.
   * @param value The value for operation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withOperation(java.util.List<com.fhir.CapabilityStatement_Operation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Operation> newValue = java.util.Objects.requireNonNull(value, "operation");
    if (this.operation == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        this.documentation,
        newValue,
        this.security,
        this.mode,
        this.searchParam,
        this.modifierExtension,
        this.interaction,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#operation() operation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withOperation(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Operation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Operation> value = optional.orElse(null);
    if (this.operation == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        this.documentation,
        value,
        this.security,
        this.mode,
        this.searchParam,
        this.modifierExtension,
        this.interaction,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#security() security} attribute.
   * @param value The value for security
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withSecurity(com.fhir.CapabilityStatement_Security value) {
    @javax.annotation.Nullable com.fhir.CapabilityStatement_Security newValue = java.util.Objects.requireNonNull(value, "security");
    if (this.security == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        this.documentation,
        this.operation,
        newValue,
        this.mode,
        this.searchParam,
        this.modifierExtension,
        this.interaction,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#security() security} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for security
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withSecurity(java.util.Optional<? extends com.fhir.CapabilityStatement_Security> optional) {
    @javax.annotation.Nullable com.fhir.CapabilityStatement_Security value = optional.orElse(null);
    if (this.security == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        this.documentation,
        this.operation,
        value,
        this.mode,
        this.searchParam,
        this.modifierExtension,
        this.interaction,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#mode() mode} attribute.
   * @param value The value for mode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withMode(com.fhir.Capabilitystatement_restMode value) {
    @javax.annotation.Nullable com.fhir.Capabilitystatement_restMode newValue = java.util.Objects.requireNonNull(value, "mode");
    if (this.mode == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        this.documentation,
        this.operation,
        this.security,
        newValue,
        this.searchParam,
        this.modifierExtension,
        this.interaction,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#mode() mode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withMode(java.util.Optional<? extends com.fhir.Capabilitystatement_restMode> optional) {
    @javax.annotation.Nullable com.fhir.Capabilitystatement_restMode value = optional.orElse(null);
    if (this.mode == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        this.documentation,
        this.operation,
        this.security,
        value,
        this.searchParam,
        this.modifierExtension,
        this.interaction,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#searchParam() searchParam} attribute.
   * @param value The value for searchParam
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withSearchParam(java.util.List<com.fhir.CapabilityStatement_SearchParam> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_SearchParam> newValue = java.util.Objects.requireNonNull(value, "searchParam");
    if (this.searchParam == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        this.documentation,
        this.operation,
        this.security,
        this.mode,
        newValue,
        this.modifierExtension,
        this.interaction,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#searchParam() searchParam} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for searchParam
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withSearchParam(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_SearchParam>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_SearchParam> value = optional.orElse(null);
    if (this.searchParam == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        this.documentation,
        this.operation,
        this.security,
        this.mode,
        value,
        this.modifierExtension,
        this.interaction,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        this.documentation,
        this.operation,
        this.security,
        this.mode,
        this.searchParam,
        newValue,
        this.interaction,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        this.documentation,
        this.operation,
        this.security,
        this.mode,
        this.searchParam,
        value,
        this.interaction,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#interaction() interaction} attribute.
   * @param value The value for interaction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withInteraction(java.util.List<com.fhir.CapabilityStatement_Interaction1> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Interaction1> newValue = java.util.Objects.requireNonNull(value, "interaction");
    if (this.interaction == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        this.documentation,
        this.operation,
        this.security,
        this.mode,
        this.searchParam,
        this.modifierExtension,
        newValue,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#interaction() interaction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for interaction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withInteraction(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Interaction1>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Interaction1> value = optional.orElse(null);
    if (this.interaction == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        this.documentation,
        this.operation,
        this.security,
        this.mode,
        this.searchParam,
        this.modifierExtension,
        value,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        this.documentation,
        this.operation,
        this.security,
        this.mode,
        this.searchParam,
        this.modifierExtension,
        this.interaction,
        newValue,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        this.documentation,
        this.operation,
        this.security,
        this.mode,
        this.searchParam,
        this.modifierExtension,
        this.interaction,
        value,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Rest#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Rest withResource(java.util.List<com.fhir.CapabilityStatement_Resource> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Resource> newValue = java.util.Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        this.documentation,
        this.operation,
        this.security,
        this.mode,
        this.searchParam,
        this.modifierExtension,
        this.interaction,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Rest#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Rest withResource(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Resource>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Resource> value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableCapabilityStatement_Rest(
        this.extension,
        this.compartment,
        this.documentation,
        this.operation,
        this.security,
        this.mode,
        this.searchParam,
        this.modifierExtension,
        this.interaction,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCapabilityStatement_Rest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCapabilityStatement_Rest
        && equalTo((ImmutableCapabilityStatement_Rest) another);
  }

  private boolean equalTo(ImmutableCapabilityStatement_Rest another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(compartment, another.compartment)
        && java.util.Objects.equals(documentation, another.documentation)
        && java.util.Objects.equals(operation, another.operation)
        && java.util.Objects.equals(security, another.security)
        && java.util.Objects.equals(mode, another.mode)
        && java.util.Objects.equals(searchParam, another.searchParam)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(interaction, another.interaction)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(resource, another.resource);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code compartment}, {@code documentation}, {@code operation}, {@code security}, {@code mode}, {@code searchParam}, {@code modifierExtension}, {@code interaction}, {@code id}, {@code resource}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(compartment);
    h += (h << 5) + java.util.Objects.hashCode(documentation);
    h += (h << 5) + java.util.Objects.hashCode(operation);
    h += (h << 5) + java.util.Objects.hashCode(security);
    h += (h << 5) + java.util.Objects.hashCode(mode);
    h += (h << 5) + java.util.Objects.hashCode(searchParam);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(interaction);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(resource);
    return h;
  }

  /**
   * Prints the immutable value {@code CapabilityStatement_Rest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CapabilityStatement_Rest{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (compartment != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("compartment=").append(compartment);
    }
    if (documentation != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (operation != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("operation=").append(operation);
    }
    if (security != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("security=").append(security);
    }
    if (mode != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("mode=").append(mode);
    }
    if (searchParam != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("searchParam=").append(searchParam);
    }
    if (modifierExtension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (interaction != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("interaction=").append(interaction);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (resource != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CapabilityStatement_Rest", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CapabilityStatement_Rest {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> compartment = java.util.Optional.empty();
    boolean compartmentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> documentation = java.util.Optional.empty();
    boolean documentationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Operation>> operation = java.util.Optional.empty();
    boolean operationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CapabilityStatement_Security> security = java.util.Optional.empty();
    boolean securityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Capabilitystatement_restMode> mode = java.util.Optional.empty();
    boolean modeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CapabilityStatement_SearchParam>> searchParam = java.util.Optional.empty();
    boolean searchParamIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Interaction1>> interaction = java.util.Optional.empty();
    boolean interactionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Resource>> resource = java.util.Optional.empty();
    boolean resourceIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("compartment")
    public void setCompartment(java.util.Optional<java.util.List<com.fhir.canonical>> compartment) {
      this.compartment = compartment;
      this.compartmentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public void setDocumentation(java.util.Optional<com.fhir.markdown> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    public void setOperation(java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Operation>> operation) {
      this.operation = operation;
      this.operationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("security")
    public void setSecurity(java.util.Optional<com.fhir.CapabilityStatement_Security> security) {
      this.security = security;
      this.securityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    public void setMode(java.util.Optional<com.fhir.Capabilitystatement_restMode> mode) {
      this.mode = mode;
      this.modeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("searchParam")
    public void setSearchParam(java.util.Optional<java.util.List<com.fhir.CapabilityStatement_SearchParam>> searchParam) {
      this.searchParam = searchParam;
      this.searchParamIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("interaction")
    public void setInteraction(java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Interaction1>> interaction) {
      this.interaction = interaction;
      this.interactionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public void setResource(java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Resource>> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> compartment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Operation>> operation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CapabilityStatement_Security> security() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Capabilitystatement_restMode> mode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_SearchParam>> searchParam() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Interaction1>> interaction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Resource>> resource() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCapabilityStatement_Rest fromJson(Json json) {
    ImmutableCapabilityStatement_Rest.Builder builder = ImmutableCapabilityStatement_Rest.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.compartmentIsSet) {
      builder.compartment(json.compartment);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.operationIsSet) {
      builder.operation(json.operation);
    }
    if (json.securityIsSet) {
      builder.security(json.security);
    }
    if (json.modeIsSet) {
      builder.mode(json.mode);
    }
    if (json.searchParamIsSet) {
      builder.searchParam(json.searchParam);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.interactionIsSet) {
      builder.interaction(json.interaction);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
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
        .extension(instance.extension())
        .compartment(instance.compartment())
        .documentation(instance.documentation())
        .operation(instance.operation())
        .security(instance.security())
        .mode(instance.mode())
        .searchParam(instance.searchParam())
        .modifierExtension(instance.modifierExtension())
        .interaction(instance.interaction())
        .id(instance.id())
        .resource(instance.resource())
        .build();
  }

  /**
   * Creates a builder for {@link CapabilityStatement_Rest CapabilityStatement_Rest}.
   * <pre>
   * ImmutableCapabilityStatement_Rest.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Rest#extension() extension}
   *    .compartment(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link CapabilityStatement_Rest#compartment() compartment}
   *    .documentation(com.fhir.markdown) // optional {@link CapabilityStatement_Rest#documentation() documentation}
   *    .operation(List&amp;lt;com.fhir.CapabilityStatement_Operation&amp;gt;) // optional {@link CapabilityStatement_Rest#operation() operation}
   *    .security(com.fhir.CapabilityStatement_Security) // optional {@link CapabilityStatement_Rest#security() security}
   *    .mode(com.fhir.Capabilitystatement_restMode) // optional {@link CapabilityStatement_Rest#mode() mode}
   *    .searchParam(List&amp;lt;com.fhir.CapabilityStatement_SearchParam&amp;gt;) // optional {@link CapabilityStatement_Rest#searchParam() searchParam}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Rest#modifierExtension() modifierExtension}
   *    .interaction(List&amp;lt;com.fhir.CapabilityStatement_Interaction1&amp;gt;) // optional {@link CapabilityStatement_Rest#interaction() interaction}
   *    .id(String) // optional {@link CapabilityStatement_Rest#id() id}
   *    .resource(List&amp;lt;com.fhir.CapabilityStatement_Resource&amp;gt;) // optional {@link CapabilityStatement_Rest#resource() resource}
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
  @org.immutables.value.Generated(from = "CapabilityStatement_Rest", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_COMPARTMENT = 0x2L;
    private static final long OPT_BIT_DOCUMENTATION = 0x4L;
    private static final long OPT_BIT_OPERATION = 0x8L;
    private static final long OPT_BIT_SECURITY = 0x10L;
    private static final long OPT_BIT_MODE = 0x20L;
    private static final long OPT_BIT_SEARCH_PARAM = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_INTERACTION = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_RESOURCE = 0x400L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> compartment;
    private @javax.annotation.Nullable com.fhir.markdown documentation;
    private @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Operation> operation;
    private @javax.annotation.Nullable com.fhir.CapabilityStatement_Security security;
    private @javax.annotation.Nullable com.fhir.Capabilitystatement_restMode mode;
    private @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_SearchParam> searchParam;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Interaction1> interaction;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Resource> resource;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#compartment() compartment} to compartment.
     * @param compartment The value for compartment
     * @return {@code this} builder for chained invocation
     */
    public final Builder compartment(java.util.List<com.fhir.canonical> compartment) {
      checkNotIsSet(compartmentIsSet(), "compartment");
      this.compartment = java.util.Objects.requireNonNull(compartment, "compartment");
      optBits |= OPT_BIT_COMPARTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#compartment() compartment} to compartment.
     * @param compartment The value for compartment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartment")
    public final Builder compartment(java.util.Optional<? extends java.util.List<com.fhir.canonical>> compartment) {
      checkNotIsSet(compartmentIsSet(), "compartment");
      this.compartment = compartment.orElse(null);
      optBits |= OPT_BIT_COMPARTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentation(com.fhir.markdown documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = java.util.Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public final Builder documentation(java.util.Optional<? extends com.fhir.markdown> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = documentation.orElse(null);
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#operation() operation} to operation.
     * @param operation The value for operation
     * @return {@code this} builder for chained invocation
     */
    public final Builder operation(java.util.List<com.fhir.CapabilityStatement_Operation> operation) {
      checkNotIsSet(operationIsSet(), "operation");
      this.operation = java.util.Objects.requireNonNull(operation, "operation");
      optBits |= OPT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#operation() operation} to operation.
     * @param operation The value for operation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    public final Builder operation(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Operation>> operation) {
      checkNotIsSet(operationIsSet(), "operation");
      this.operation = operation.orElse(null);
      optBits |= OPT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#security() security} to security.
     * @param security The value for security
     * @return {@code this} builder for chained invocation
     */
    public final Builder security(com.fhir.CapabilityStatement_Security security) {
      checkNotIsSet(securityIsSet(), "security");
      this.security = java.util.Objects.requireNonNull(security, "security");
      optBits |= OPT_BIT_SECURITY;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#security() security} to security.
     * @param security The value for security
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("security")
    public final Builder security(java.util.Optional<? extends com.fhir.CapabilityStatement_Security> security) {
      checkNotIsSet(securityIsSet(), "security");
      this.security = security.orElse(null);
      optBits |= OPT_BIT_SECURITY;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    public final Builder mode(com.fhir.Capabilitystatement_restMode mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = java.util.Objects.requireNonNull(mode, "mode");
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    public final Builder mode(java.util.Optional<? extends com.fhir.Capabilitystatement_restMode> mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = mode.orElse(null);
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#searchParam() searchParam} to searchParam.
     * @param searchParam The value for searchParam
     * @return {@code this} builder for chained invocation
     */
    public final Builder searchParam(java.util.List<com.fhir.CapabilityStatement_SearchParam> searchParam) {
      checkNotIsSet(searchParamIsSet(), "searchParam");
      this.searchParam = java.util.Objects.requireNonNull(searchParam, "searchParam");
      optBits |= OPT_BIT_SEARCH_PARAM;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#searchParam() searchParam} to searchParam.
     * @param searchParam The value for searchParam
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("searchParam")
    public final Builder searchParam(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_SearchParam>> searchParam) {
      checkNotIsSet(searchParamIsSet(), "searchParam");
      this.searchParam = searchParam.orElse(null);
      optBits |= OPT_BIT_SEARCH_PARAM;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#interaction() interaction} to interaction.
     * @param interaction The value for interaction
     * @return {@code this} builder for chained invocation
     */
    public final Builder interaction(java.util.List<com.fhir.CapabilityStatement_Interaction1> interaction) {
      checkNotIsSet(interactionIsSet(), "interaction");
      this.interaction = java.util.Objects.requireNonNull(interaction, "interaction");
      optBits |= OPT_BIT_INTERACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#interaction() interaction} to interaction.
     * @param interaction The value for interaction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interaction")
    public final Builder interaction(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Interaction1>> interaction) {
      checkNotIsSet(interactionIsSet(), "interaction");
      this.interaction = interaction.orElse(null);
      optBits |= OPT_BIT_INTERACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(java.util.List<com.fhir.CapabilityStatement_Resource> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = java.util.Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Rest#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public final Builder resource(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Resource>> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Builds a new {@link CapabilityStatement_Rest CapabilityStatement_Rest}.
     * @return An immutable instance of CapabilityStatement_Rest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CapabilityStatement_Rest build() {
      return new ImmutableCapabilityStatement_Rest(
          extension,
          compartment,
          documentation,
          operation,
          security,
          mode,
          searchParam,
          modifierExtension,
          interaction,
          id,
          resource);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean compartmentIsSet() {
      return (optBits & OPT_BIT_COMPARTMENT) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean operationIsSet() {
      return (optBits & OPT_BIT_OPERATION) != 0;
    }

    private boolean securityIsSet() {
      return (optBits & OPT_BIT_SECURITY) != 0;
    }

    private boolean modeIsSet() {
      return (optBits & OPT_BIT_MODE) != 0;
    }

    private boolean searchParamIsSet() {
      return (optBits & OPT_BIT_SEARCH_PARAM) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean interactionIsSet() {
      return (optBits & OPT_BIT_INTERACTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CapabilityStatement_Rest is strict, attribute is already set: ".concat(name));
    }
  }
}
