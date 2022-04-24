//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link TerminologyCapabilities_Expansion}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTerminologyCapabilities_Expansion.builder()}.
 */
@org.immutables.value.Generated(from = "TerminologyCapabilities_Expansion", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTerminologyCapabilities_Expansion
    implements com.fhir.TerminologyCapabilities_Expansion {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.TerminologyCapabilities_Parameter> parameter;
  private final @javax.annotation.Nullable java.lang.Boolean paging;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.Boolean hierarchical;
  private final @javax.annotation.Nullable com.fhir.markdown textFilter;
  private final @javax.annotation.Nullable java.lang.Boolean incomplete;

  private ImmutableTerminologyCapabilities_Expansion(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.TerminologyCapabilities_Parameter> parameter,
      @javax.annotation.Nullable java.lang.Boolean paging,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.Boolean hierarchical,
      @javax.annotation.Nullable com.fhir.markdown textFilter,
      @javax.annotation.Nullable java.lang.Boolean incomplete) {
    this.id = id;
    this.parameter = parameter;
    this.paging = paging;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.hierarchical = hierarchical;
    this.textFilter = textFilter;
    this.incomplete = incomplete;
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
   * @return The value of the {@code parameter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parameter")
  @Override
  public java.util.Optional<java.util.List<com.fhir.TerminologyCapabilities_Parameter>> parameter() {
    return java.util.Optional.ofNullable(parameter);
  }

  /**
   * @return The value of the {@code paging} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("paging")
  @Override
  public java.util.Optional<java.lang.Boolean> paging() {
    return java.util.Optional.ofNullable(paging);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code hierarchical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("hierarchical")
  @Override
  public java.util.Optional<java.lang.Boolean> hierarchical() {
    return java.util.Optional.ofNullable(hierarchical);
  }

  /**
   * @return The value of the {@code textFilter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("textFilter")
  @Override
  public java.util.Optional<com.fhir.markdown> textFilter() {
    return java.util.Optional.ofNullable(textFilter);
  }

  /**
   * @return The value of the {@code incomplete} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("incomplete")
  @Override
  public java.util.Optional<java.lang.Boolean> incomplete() {
    return java.util.Optional.ofNullable(incomplete);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Expansion#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        newValue,
        this.parameter,
        this.paging,
        this.modifierExtension,
        this.extension,
        this.hierarchical,
        this.textFilter,
        this.incomplete);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Expansion#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        value,
        this.parameter,
        this.paging,
        this.modifierExtension,
        this.extension,
        this.hierarchical,
        this.textFilter,
        this.incomplete);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Expansion#parameter() parameter} attribute.
   * @param value The value for parameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withParameter(java.util.List<com.fhir.TerminologyCapabilities_Parameter> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.TerminologyCapabilities_Parameter> newValue = java.util.Objects.requireNonNull(value, "parameter");
    if (this.parameter == newValue) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        newValue,
        this.paging,
        this.modifierExtension,
        this.extension,
        this.hierarchical,
        this.textFilter,
        this.incomplete);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Expansion#parameter() parameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_Expansion withParameter(java.util.Optional<? extends java.util.List<com.fhir.TerminologyCapabilities_Parameter>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.TerminologyCapabilities_Parameter> value = optional.orElse(null);
    if (this.parameter == value) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        value,
        this.paging,
        this.modifierExtension,
        this.extension,
        this.hierarchical,
        this.textFilter,
        this.incomplete);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Expansion#paging() paging} attribute.
   * @param value The value for paging
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withPaging(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.paging, newValue)) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.parameter,
        newValue,
        this.modifierExtension,
        this.extension,
        this.hierarchical,
        this.textFilter,
        this.incomplete);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Expansion#paging() paging} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paging
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withPaging(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.paging, value)) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.parameter,
        value,
        this.modifierExtension,
        this.extension,
        this.hierarchical,
        this.textFilter,
        this.incomplete);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Expansion#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.parameter,
        this.paging,
        newValue,
        this.extension,
        this.hierarchical,
        this.textFilter,
        this.incomplete);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Expansion#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_Expansion withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.parameter,
        this.paging,
        value,
        this.extension,
        this.hierarchical,
        this.textFilter,
        this.incomplete);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Expansion#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.parameter,
        this.paging,
        this.modifierExtension,
        newValue,
        this.hierarchical,
        this.textFilter,
        this.incomplete);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Expansion#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_Expansion withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.parameter,
        this.paging,
        this.modifierExtension,
        value,
        this.hierarchical,
        this.textFilter,
        this.incomplete);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Expansion#hierarchical() hierarchical} attribute.
   * @param value The value for hierarchical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withHierarchical(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.hierarchical, newValue)) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.parameter,
        this.paging,
        this.modifierExtension,
        this.extension,
        newValue,
        this.textFilter,
        this.incomplete);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Expansion#hierarchical() hierarchical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hierarchical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withHierarchical(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.hierarchical, value)) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.parameter,
        this.paging,
        this.modifierExtension,
        this.extension,
        value,
        this.textFilter,
        this.incomplete);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Expansion#textFilter() textFilter} attribute.
   * @param value The value for textFilter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withTextFilter(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "textFilter");
    if (this.textFilter == newValue) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.parameter,
        this.paging,
        this.modifierExtension,
        this.extension,
        this.hierarchical,
        newValue,
        this.incomplete);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Expansion#textFilter() textFilter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for textFilter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_Expansion withTextFilter(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.textFilter == value) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.parameter,
        this.paging,
        this.modifierExtension,
        this.extension,
        this.hierarchical,
        value,
        this.incomplete);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Expansion#incomplete() incomplete} attribute.
   * @param value The value for incomplete
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withIncomplete(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.incomplete, newValue)) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.parameter,
        this.paging,
        this.modifierExtension,
        this.extension,
        this.hierarchical,
        this.textFilter,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Expansion#incomplete() incomplete} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for incomplete
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withIncomplete(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.incomplete, value)) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.parameter,
        this.paging,
        this.modifierExtension,
        this.extension,
        this.hierarchical,
        this.textFilter,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTerminologyCapabilities_Expansion} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTerminologyCapabilities_Expansion
        && equalTo((ImmutableTerminologyCapabilities_Expansion) another);
  }

  private boolean equalTo(ImmutableTerminologyCapabilities_Expansion another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(parameter, another.parameter)
        && java.util.Objects.equals(paging, another.paging)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(hierarchical, another.hierarchical)
        && java.util.Objects.equals(textFilter, another.textFilter)
        && java.util.Objects.equals(incomplete, another.incomplete);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code parameter}, {@code paging}, {@code modifierExtension}, {@code extension}, {@code hierarchical}, {@code textFilter}, {@code incomplete}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(parameter);
    h += (h << 5) + java.util.Objects.hashCode(paging);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(hierarchical);
    h += (h << 5) + java.util.Objects.hashCode(textFilter);
    h += (h << 5) + java.util.Objects.hashCode(incomplete);
    return h;
  }

  /**
   * Prints the immutable value {@code TerminologyCapabilities_Expansion} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("TerminologyCapabilities_Expansion{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (parameter != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("parameter=").append(parameter);
    }
    if (paging != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("paging=").append(paging);
    }
    if (modifierExtension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (hierarchical != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("hierarchical=").append(hierarchical);
    }
    if (textFilter != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("textFilter=").append(textFilter);
    }
    if (incomplete != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("incomplete=").append(incomplete);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "TerminologyCapabilities_Expansion", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.TerminologyCapabilities_Expansion {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.TerminologyCapabilities_Parameter>> parameter = java.util.Optional.empty();
    boolean parameterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> paging = java.util.Optional.empty();
    boolean pagingIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> hierarchical = java.util.Optional.empty();
    boolean hierarchicalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> textFilter = java.util.Optional.empty();
    boolean textFilterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> incomplete = java.util.Optional.empty();
    boolean incompleteIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public void setParameter(java.util.Optional<java.util.List<com.fhir.TerminologyCapabilities_Parameter>> parameter) {
      this.parameter = parameter;
      this.parameterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("paging")
    public void setPaging(java.util.Optional<java.lang.Boolean> paging) {
      this.paging = paging;
      this.pagingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("hierarchical")
    public void setHierarchical(java.util.Optional<java.lang.Boolean> hierarchical) {
      this.hierarchical = hierarchical;
      this.hierarchicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("textFilter")
    public void setTextFilter(java.util.Optional<com.fhir.markdown> textFilter) {
      this.textFilter = textFilter;
      this.textFilterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("incomplete")
    public void setIncomplete(java.util.Optional<java.lang.Boolean> incomplete) {
      this.incomplete = incomplete;
      this.incompleteIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.TerminologyCapabilities_Parameter>> parameter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> paging() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> hierarchical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> textFilter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> incomplete() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableTerminologyCapabilities_Expansion fromJson(Json json) {
    ImmutableTerminologyCapabilities_Expansion.Builder builder = ImmutableTerminologyCapabilities_Expansion.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.parameterIsSet) {
      builder.parameter(json.parameter);
    }
    if (json.pagingIsSet) {
      builder.paging(json.paging);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.hierarchicalIsSet) {
      builder.hierarchical(json.hierarchical);
    }
    if (json.textFilterIsSet) {
      builder.textFilter(json.textFilter);
    }
    if (json.incompleteIsSet) {
      builder.incomplete(json.incomplete);
    }
    return (ImmutableTerminologyCapabilities_Expansion) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TerminologyCapabilities_Expansion} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TerminologyCapabilities_Expansion instance
   */
  public static TerminologyCapabilities_Expansion copyOf(TerminologyCapabilities_Expansion instance) {
    if (instance instanceof ImmutableTerminologyCapabilities_Expansion) {
      return (ImmutableTerminologyCapabilities_Expansion) instance;
    }
    return ImmutableTerminologyCapabilities_Expansion.builder()
        .id(instance.id())
        .parameter(instance.parameter())
        .paging(instance.paging())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .hierarchical(instance.hierarchical())
        .textFilter(instance.textFilter())
        .incomplete(instance.incomplete())
        .build();
  }

  /**
   * Creates a builder for {@link TerminologyCapabilities_Expansion TerminologyCapabilities_Expansion}.
   * <pre>
   * ImmutableTerminologyCapabilities_Expansion.builder()
   *    .id(String) // optional {@link TerminologyCapabilities_Expansion#id() id}
   *    .parameter(List&amp;lt;com.fhir.TerminologyCapabilities_Parameter&amp;gt;) // optional {@link TerminologyCapabilities_Expansion#parameter() parameter}
   *    .paging(Boolean) // optional {@link TerminologyCapabilities_Expansion#paging() paging}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities_Expansion#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities_Expansion#extension() extension}
   *    .hierarchical(Boolean) // optional {@link TerminologyCapabilities_Expansion#hierarchical() hierarchical}
   *    .textFilter(com.fhir.markdown) // optional {@link TerminologyCapabilities_Expansion#textFilter() textFilter}
   *    .incomplete(Boolean) // optional {@link TerminologyCapabilities_Expansion#incomplete() incomplete}
   *    .build();
   * </pre>
   * @return A new TerminologyCapabilities_Expansion builder
   */
  public static ImmutableTerminologyCapabilities_Expansion.Builder builder() {
    return new ImmutableTerminologyCapabilities_Expansion.Builder();
  }

  /**
   * Builds instances of type {@link TerminologyCapabilities_Expansion TerminologyCapabilities_Expansion}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "TerminologyCapabilities_Expansion", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_PARAMETER = 0x2L;
    private static final long OPT_BIT_PAGING = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_HIERARCHICAL = 0x20L;
    private static final long OPT_BIT_TEXT_FILTER = 0x40L;
    private static final long OPT_BIT_INCOMPLETE = 0x80L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.TerminologyCapabilities_Parameter> parameter;
    private @javax.annotation.Nullable java.lang.Boolean paging;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.Boolean hierarchical;
    private @javax.annotation.Nullable com.fhir.markdown textFilter;
    private @javax.annotation.Nullable java.lang.Boolean incomplete;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameter(java.util.List<com.fhir.TerminologyCapabilities_Parameter> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = java.util.Objects.requireNonNull(parameter, "parameter");
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public final Builder parameter(java.util.Optional<? extends java.util.List<com.fhir.TerminologyCapabilities_Parameter>> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = parameter.orElse(null);
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#paging() paging} to paging.
     * @param paging The value for paging
     * @return {@code this} builder for chained invocation
     */
    public final Builder paging(boolean paging) {
      checkNotIsSet(pagingIsSet(), "paging");
      this.paging = paging;
      optBits |= OPT_BIT_PAGING;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#paging() paging} to paging.
     * @param paging The value for paging
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("paging")
    public final Builder paging(java.util.Optional<java.lang.Boolean> paging) {
      checkNotIsSet(pagingIsSet(), "paging");
      this.paging = paging.orElse(null);
      optBits |= OPT_BIT_PAGING;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#hierarchical() hierarchical} to hierarchical.
     * @param hierarchical The value for hierarchical
     * @return {@code this} builder for chained invocation
     */
    public final Builder hierarchical(boolean hierarchical) {
      checkNotIsSet(hierarchicalIsSet(), "hierarchical");
      this.hierarchical = hierarchical;
      optBits |= OPT_BIT_HIERARCHICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#hierarchical() hierarchical} to hierarchical.
     * @param hierarchical The value for hierarchical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hierarchical")
    public final Builder hierarchical(java.util.Optional<java.lang.Boolean> hierarchical) {
      checkNotIsSet(hierarchicalIsSet(), "hierarchical");
      this.hierarchical = hierarchical.orElse(null);
      optBits |= OPT_BIT_HIERARCHICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#textFilter() textFilter} to textFilter.
     * @param textFilter The value for textFilter
     * @return {@code this} builder for chained invocation
     */
    public final Builder textFilter(com.fhir.markdown textFilter) {
      checkNotIsSet(textFilterIsSet(), "textFilter");
      this.textFilter = java.util.Objects.requireNonNull(textFilter, "textFilter");
      optBits |= OPT_BIT_TEXT_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#textFilter() textFilter} to textFilter.
     * @param textFilter The value for textFilter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("textFilter")
    public final Builder textFilter(java.util.Optional<? extends com.fhir.markdown> textFilter) {
      checkNotIsSet(textFilterIsSet(), "textFilter");
      this.textFilter = textFilter.orElse(null);
      optBits |= OPT_BIT_TEXT_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#incomplete() incomplete} to incomplete.
     * @param incomplete The value for incomplete
     * @return {@code this} builder for chained invocation
     */
    public final Builder incomplete(boolean incomplete) {
      checkNotIsSet(incompleteIsSet(), "incomplete");
      this.incomplete = incomplete;
      optBits |= OPT_BIT_INCOMPLETE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#incomplete() incomplete} to incomplete.
     * @param incomplete The value for incomplete
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("incomplete")
    public final Builder incomplete(java.util.Optional<java.lang.Boolean> incomplete) {
      checkNotIsSet(incompleteIsSet(), "incomplete");
      this.incomplete = incomplete.orElse(null);
      optBits |= OPT_BIT_INCOMPLETE;
      return this;
    }

    /**
     * Builds a new {@link TerminologyCapabilities_Expansion TerminologyCapabilities_Expansion}.
     * @return An immutable instance of TerminologyCapabilities_Expansion
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.TerminologyCapabilities_Expansion build() {
      return new ImmutableTerminologyCapabilities_Expansion(id, parameter, paging, modifierExtension, extension, hierarchical, textFilter, incomplete);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean parameterIsSet() {
      return (optBits & OPT_BIT_PARAMETER) != 0;
    }

    private boolean pagingIsSet() {
      return (optBits & OPT_BIT_PAGING) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean hierarchicalIsSet() {
      return (optBits & OPT_BIT_HIERARCHICAL) != 0;
    }

    private boolean textFilterIsSet() {
      return (optBits & OPT_BIT_TEXT_FILTER) != 0;
    }

    private boolean incompleteIsSet() {
      return (optBits & OPT_BIT_INCOMPLETE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of TerminologyCapabilities_Expansion is strict, attribute is already set: ".concat(name));
    }
  }
}
