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
 * Immutable implementation of {@link ValueSet_Contains}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableValueSet_Contains.builder()}.
 */
@Generated(from = "ValueSet_Contains", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableValueSet_Contains implements ValueSet_Contains {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable List<ValueSet_Contains> contains;
  private final @Nullable Boolean _abstract;
  private final @Nullable String display;
  private final @Nullable List<ValueSet_Designation> designation;
  private final @Nullable String version;
  private final @Nullable Uri system;
  private final @Nullable Boolean inactive;
  private final @Nullable Code code;

  private ImmutableValueSet_Contains(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable List<ValueSet_Contains> contains,
      @Nullable Boolean _abstract,
      @Nullable String display,
      @Nullable List<ValueSet_Designation> designation,
      @Nullable String version,
      @Nullable Uri system,
      @Nullable Boolean inactive,
      @Nullable Code code) {
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.id = id;
    this.contains = contains;
    this._abstract = _abstract;
    this.display = display;
    this.designation = designation;
    this.version = version;
    this.system = system;
    this.inactive = inactive;
    this.code = code;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code contains} attribute
   */
  @JsonProperty("contains")
  @Override
  public Optional<List<ValueSet_Contains>> contains() {
    return Optional.ofNullable(contains);
  }

  /**
   * @return The value of the {@code _abstract} attribute
   */
  @JsonProperty("abstract")
  @Override
  public Optional<Boolean> _abstract() {
    return Optional.ofNullable(_abstract);
  }

  /**
   * @return The value of the {@code display} attribute
   */
  @JsonProperty("display")
  @Override
  public Optional<String> display() {
    return Optional.ofNullable(display);
  }

  /**
   * @return The value of the {@code designation} attribute
   */
  @JsonProperty("designation")
  @Override
  public Optional<List<ValueSet_Designation>> designation() {
    return Optional.ofNullable(designation);
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<String> version() {
    return Optional.ofNullable(version);
  }

  /**
   * @return The value of the {@code system} attribute
   */
  @JsonProperty("system")
  @Override
  public Optional<Uri> system() {
    return Optional.ofNullable(system);
  }

  /**
   * @return The value of the {@code inactive} attribute
   */
  @JsonProperty("inactive")
  @Override
  public Optional<Boolean> inactive() {
    return Optional.ofNullable(inactive);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Code> code() {
    return Optional.ofNullable(code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableValueSet_Contains(
        newValue,
        this.extension,
        this.id,
        this.contains,
        this._abstract,
        this.display,
        this.designation,
        this.version,
        this.system,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Contains withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableValueSet_Contains(
        value,
        this.extension,
        this.id,
        this.contains,
        this._abstract,
        this.display,
        this.designation,
        this.version,
        this.system,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        newValue,
        this.id,
        this.contains,
        this._abstract,
        this.display,
        this.designation,
        this.version,
        this.system,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Contains withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        value,
        this.id,
        this.contains,
        this._abstract,
        this.display,
        this.designation,
        this.version,
        this.system,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        newValue,
        this.contains,
        this._abstract,
        this.display,
        this.designation,
        this.version,
        this.system,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        value,
        this.contains,
        this._abstract,
        this.display,
        this.designation,
        this.version,
        this.system,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#contains() contains} attribute.
   * @param value The value for contains
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withContains(List<ValueSet_Contains> value) {
    @Nullable List<ValueSet_Contains> newValue = Objects.requireNonNull(value, "contains");
    if (this.contains == newValue) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        this.id,
        newValue,
        this._abstract,
        this.display,
        this.designation,
        this.version,
        this.system,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#contains() contains} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contains
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Contains withContains(Optional<? extends List<ValueSet_Contains>> optional) {
    @Nullable List<ValueSet_Contains> value = optional.orElse(null);
    if (this.contains == value) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        this.id,
        value,
        this._abstract,
        this.display,
        this.designation,
        this.version,
        this.system,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#_abstract() _abstract} attribute.
   * @param value The value for _abstract
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains with_abstract(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this._abstract, newValue)) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        this.id,
        this.contains,
        newValue,
        this.display,
        this.designation,
        this.version,
        this.system,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#_abstract() _abstract} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _abstract
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains with_abstract(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this._abstract, value)) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        this.id,
        this.contains,
        value,
        this.display,
        this.designation,
        this.version,
        this.system,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#display() display} attribute.
   * @param value The value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withDisplay(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "display");
    if (Objects.equals(this.display, newValue)) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        this.id,
        this.contains,
        this._abstract,
        newValue,
        this.designation,
        this.version,
        this.system,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#display() display} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withDisplay(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.display, value)) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        this.id,
        this.contains,
        this._abstract,
        value,
        this.designation,
        this.version,
        this.system,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#designation() designation} attribute.
   * @param value The value for designation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withDesignation(List<ValueSet_Designation> value) {
    @Nullable List<ValueSet_Designation> newValue = Objects.requireNonNull(value, "designation");
    if (this.designation == newValue) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        this.id,
        this.contains,
        this._abstract,
        this.display,
        newValue,
        this.version,
        this.system,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#designation() designation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for designation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Contains withDesignation(Optional<? extends List<ValueSet_Designation>> optional) {
    @Nullable List<ValueSet_Designation> value = optional.orElse(null);
    if (this.designation == value) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        this.id,
        this.contains,
        this._abstract,
        this.display,
        value,
        this.version,
        this.system,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        this.id,
        this.contains,
        this._abstract,
        this.display,
        this.designation,
        newValue,
        this.system,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        this.id,
        this.contains,
        this._abstract,
        this.display,
        this.designation,
        value,
        this.system,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withSystem(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "system");
    if (this.system == newValue) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        this.id,
        this.contains,
        this._abstract,
        this.display,
        this.designation,
        this.version,
        newValue,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#system() system} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Contains withSystem(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.system == value) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        this.id,
        this.contains,
        this._abstract,
        this.display,
        this.designation,
        this.version,
        value,
        this.inactive,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#inactive() inactive} attribute.
   * @param value The value for inactive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withInactive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.inactive, newValue)) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        this.id,
        this.contains,
        this._abstract,
        this.display,
        this.designation,
        this.version,
        this.system,
        newValue,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#inactive() inactive} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for inactive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withInactive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.inactive, value)) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        this.id,
        this.contains,
        this._abstract,
        this.display,
        this.designation,
        this.version,
        this.system,
        value,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Contains#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Contains withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        this.id,
        this.contains,
        this._abstract,
        this.display,
        this.designation,
        this.version,
        this.system,
        this.inactive,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Contains#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Contains withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableValueSet_Contains(
        this.modifierExtension,
        this.extension,
        this.id,
        this.contains,
        this._abstract,
        this.display,
        this.designation,
        this.version,
        this.system,
        this.inactive,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableValueSet_Contains} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableValueSet_Contains
        && equalTo((ImmutableValueSet_Contains) another);
  }

  private boolean equalTo(ImmutableValueSet_Contains another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(contains, another.contains)
        && Objects.equals(_abstract, another._abstract)
        && Objects.equals(display, another.display)
        && Objects.equals(designation, another.designation)
        && Objects.equals(version, another.version)
        && Objects.equals(system, another.system)
        && Objects.equals(inactive, another.inactive)
        && Objects.equals(code, another.code);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code extension}, {@code id}, {@code contains}, {@code _abstract}, {@code display}, {@code designation}, {@code version}, {@code system}, {@code inactive}, {@code code}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(contains);
    h += (h << 5) + Objects.hashCode(_abstract);
    h += (h << 5) + Objects.hashCode(display);
    h += (h << 5) + Objects.hashCode(designation);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(system);
    h += (h << 5) + Objects.hashCode(inactive);
    h += (h << 5) + Objects.hashCode(code);
    return h;
  }

  /**
   * Prints the immutable value {@code ValueSet_Contains} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ValueSet_Contains{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contains != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("contains=").append(contains);
    }
    if (_abstract != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("_abstract=").append(_abstract);
    }
    if (display != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("display=").append(display);
    }
    if (designation != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("designation=").append(designation);
    }
    if (version != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (system != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("system=").append(system);
    }
    if (inactive != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("inactive=").append(inactive);
    }
    if (code != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("code=").append(code);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ValueSet_Contains", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ValueSet_Contains {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<ValueSet_Contains>> contains = Optional.empty();
    boolean containsIsSet;
    @Nullable Optional<Boolean> _abstract = Optional.empty();
    boolean _abstractIsSet;
    @Nullable Optional<String> display = Optional.empty();
    boolean displayIsSet;
    @Nullable Optional<List<ValueSet_Designation>> designation = Optional.empty();
    boolean designationIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<Uri> system = Optional.empty();
    boolean systemIsSet;
    @Nullable Optional<Boolean> inactive = Optional.empty();
    boolean inactiveIsSet;
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
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
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("contains")
    public void setContains(Optional<List<ValueSet_Contains>> contains) {
      this.contains = contains;
      this.containsIsSet = true;
    }
    @JsonProperty("abstract")
    public void set_abstract(Optional<Boolean> _abstract) {
      this._abstract = _abstract;
      this._abstractIsSet = true;
    }
    @JsonProperty("display")
    public void setDisplay(Optional<String> display) {
      this.display = display;
      this.displayIsSet = true;
    }
    @JsonProperty("designation")
    public void setDesignation(Optional<List<ValueSet_Designation>> designation) {
      this.designation = designation;
      this.designationIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("system")
    public void setSystem(Optional<Uri> system) {
      this.system = system;
      this.systemIsSet = true;
    }
    @JsonProperty("inactive")
    public void setInactive(Optional<Boolean> inactive) {
      this.inactive = inactive;
      this.inactiveIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<Code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ValueSet_Contains>> contains() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> _abstract() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> display() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ValueSet_Designation>> designation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> system() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> inactive() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> code() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableValueSet_Contains fromJson(Json json) {
    ImmutableValueSet_Contains.Builder builder = ImmutableValueSet_Contains.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.containsIsSet) {
      builder.contains(json.contains);
    }
    if (json._abstractIsSet) {
      builder._abstract(json._abstract);
    }
    if (json.displayIsSet) {
      builder.display(json.display);
    }
    if (json.designationIsSet) {
      builder.designation(json.designation);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    if (json.inactiveIsSet) {
      builder.inactive(json.inactive);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    return (ImmutableValueSet_Contains) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ValueSet_Contains} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ValueSet_Contains instance
   */
  public static ValueSet_Contains copyOf(ValueSet_Contains instance) {
    if (instance instanceof ImmutableValueSet_Contains) {
      return (ImmutableValueSet_Contains) instance;
    }
    return ImmutableValueSet_Contains.builder()
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .id(instance.id())
        .contains(instance.contains())
        ._abstract(instance._abstract())
        .display(instance.display())
        .designation(instance.designation())
        .version(instance.version())
        .system(instance.system())
        .inactive(instance.inactive())
        .code(instance.code())
        .build();
  }

  /**
   * Creates a builder for {@link ValueSet_Contains ValueSet_Contains}.
   * <pre>
   * ImmutableValueSet_Contains.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ValueSet_Contains#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ValueSet_Contains#extension() extension}
   *    .id(String) // optional {@link ValueSet_Contains#id() id}
   *    .contains(List&amp;lt;com.fhir.types.fhir.ValueSet_Contains&amp;gt;) // optional {@link ValueSet_Contains#contains() contains}
   *    ._abstract(Boolean) // optional {@link ValueSet_Contains#_abstract() _abstract}
   *    .display(String) // optional {@link ValueSet_Contains#display() display}
   *    .designation(List&amp;lt;com.fhir.types.fhir.ValueSet_Designation&amp;gt;) // optional {@link ValueSet_Contains#designation() designation}
   *    .version(String) // optional {@link ValueSet_Contains#version() version}
   *    .system(com.fhir.types.fhir.Uri) // optional {@link ValueSet_Contains#system() system}
   *    .inactive(Boolean) // optional {@link ValueSet_Contains#inactive() inactive}
   *    .code(com.fhir.types.fhir.Code) // optional {@link ValueSet_Contains#code() code}
   *    .build();
   * </pre>
   * @return A new ValueSet_Contains builder
   */
  public static ImmutableValueSet_Contains.Builder builder() {
    return new ImmutableValueSet_Contains.Builder();
  }

  /**
   * Builds instances of type {@link ValueSet_Contains ValueSet_Contains}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ValueSet_Contains", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_CONTAINS = 0x8L;
    private static final long OPT_BIT__ABSTRACT = 0x10L;
    private static final long OPT_BIT_DISPLAY = 0x20L;
    private static final long OPT_BIT_DESIGNATION = 0x40L;
    private static final long OPT_BIT_VERSION = 0x80L;
    private static final long OPT_BIT_SYSTEM = 0x100L;
    private static final long OPT_BIT_INACTIVE = 0x200L;
    private static final long OPT_BIT_CODE = 0x400L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable List<ValueSet_Contains> contains;
    private @Nullable Boolean _abstract;
    private @Nullable String display;
    private @Nullable List<ValueSet_Designation> designation;
    private @Nullable String version;
    private @Nullable Uri system;
    private @Nullable Boolean inactive;
    private @Nullable Code code;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ValueSet_Contains#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ValueSet_Contains#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Contains#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Contains#id() id} to id.
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
     * Initializes the optional value {@link ValueSet_Contains#id() id} to id.
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
     * Initializes the optional value {@link ValueSet_Contains#contains() contains} to contains.
     * @param contains The value for contains
     * @return {@code this} builder for chained invocation
     */
    public final Builder contains(List<ValueSet_Contains> contains) {
      checkNotIsSet(containsIsSet(), "contains");
      this.contains = Objects.requireNonNull(contains, "contains");
      optBits |= OPT_BIT_CONTAINS;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#contains() contains} to contains.
     * @param contains The value for contains
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contains")
    public final Builder contains(Optional<? extends List<ValueSet_Contains>> contains) {
      checkNotIsSet(containsIsSet(), "contains");
      this.contains = contains.orElse(null);
      optBits |= OPT_BIT_CONTAINS;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#_abstract() _abstract} to _abstract.
     * @param _abstract The value for _abstract
     * @return {@code this} builder for chained invocation
     */
    public final Builder _abstract(boolean _abstract) {
      checkNotIsSet(_abstractIsSet(), "_abstract");
      this._abstract = _abstract;
      optBits |= OPT_BIT__ABSTRACT;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#_abstract() _abstract} to _abstract.
     * @param _abstract The value for _abstract
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("abstract")
    public final Builder _abstract(Optional<Boolean> _abstract) {
      checkNotIsSet(_abstractIsSet(), "_abstract");
      this._abstract = _abstract.orElse(null);
      optBits |= OPT_BIT__ABSTRACT;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for chained invocation
     */
    public final Builder display(String display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = Objects.requireNonNull(display, "display");
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("display")
    public final Builder display(Optional<String> display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = display.orElse(null);
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#designation() designation} to designation.
     * @param designation The value for designation
     * @return {@code this} builder for chained invocation
     */
    public final Builder designation(List<ValueSet_Designation> designation) {
      checkNotIsSet(designationIsSet(), "designation");
      this.designation = Objects.requireNonNull(designation, "designation");
      optBits |= OPT_BIT_DESIGNATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#designation() designation} to designation.
     * @param designation The value for designation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("designation")
    public final Builder designation(Optional<? extends List<ValueSet_Designation>> designation) {
      checkNotIsSet(designationIsSet(), "designation");
      this.designation = designation.orElse(null);
      optBits |= OPT_BIT_DESIGNATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(String version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("version")
    public final Builder version(Optional<String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    public final Builder system(Uri system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = Objects.requireNonNull(system, "system");
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("system")
    public final Builder system(Optional<? extends Uri> system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system.orElse(null);
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#inactive() inactive} to inactive.
     * @param inactive The value for inactive
     * @return {@code this} builder for chained invocation
     */
    public final Builder inactive(boolean inactive) {
      checkNotIsSet(inactiveIsSet(), "inactive");
      this.inactive = inactive;
      optBits |= OPT_BIT_INACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#inactive() inactive} to inactive.
     * @param inactive The value for inactive
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("inactive")
    public final Builder inactive(Optional<Boolean> inactive) {
      checkNotIsSet(inactiveIsSet(), "inactive");
      this.inactive = inactive.orElse(null);
      optBits |= OPT_BIT_INACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(Code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Contains#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends Code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Builds a new {@link ValueSet_Contains ValueSet_Contains}.
     * @return An immutable instance of ValueSet_Contains
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ValueSet_Contains build() {
      return new ImmutableValueSet_Contains(
          modifierExtension,
          extension,
          id,
          contains,
          _abstract,
          display,
          designation,
          version,
          system,
          inactive,
          code);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean containsIsSet() {
      return (optBits & OPT_BIT_CONTAINS) != 0;
    }

    private boolean _abstractIsSet() {
      return (optBits & OPT_BIT__ABSTRACT) != 0;
    }

    private boolean displayIsSet() {
      return (optBits & OPT_BIT_DISPLAY) != 0;
    }

    private boolean designationIsSet() {
      return (optBits & OPT_BIT_DESIGNATION) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private boolean inactiveIsSet() {
      return (optBits & OPT_BIT_INACTIVE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ValueSet_Contains is strict, attribute is already set: ".concat(name));
    }
  }
}
