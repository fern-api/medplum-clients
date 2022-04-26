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
 * Immutable implementation of {@link CodeSystem_Concept}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCodeSystem_Concept.builder()}.
 */
@Generated(from = "CodeSystem_Concept", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCodeSystem_Concept implements CodeSystem_Concept {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<CodeSystem_Designation> designation;
  private final @Nullable List<CodeSystem_Concept> concept;
  private final @Nullable List<CodeSystem_Property1> property;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Code code;
  private final @Nullable String display;
  private final @Nullable String id;
  private final @Nullable String definition;

  private ImmutableCodeSystem_Concept(
      @Nullable List<Extension> extension,
      @Nullable List<CodeSystem_Designation> designation,
      @Nullable List<CodeSystem_Concept> concept,
      @Nullable List<CodeSystem_Property1> property,
      @Nullable List<Extension> modifierExtension,
      @Nullable Code code,
      @Nullable String display,
      @Nullable String id,
      @Nullable String definition) {
    this.extension = extension;
    this.designation = designation;
    this.concept = concept;
    this.property = property;
    this.modifierExtension = modifierExtension;
    this.code = code;
    this.display = display;
    this.id = id;
    this.definition = definition;
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
   * @return The value of the {@code designation} attribute
   */
  @JsonProperty("designation")
  @Override
  public Optional<List<CodeSystem_Designation>> designation() {
    return Optional.ofNullable(designation);
  }

  /**
   * @return The value of the {@code concept} attribute
   */
  @JsonProperty("concept")
  @Override
  public Optional<List<CodeSystem_Concept>> concept() {
    return Optional.ofNullable(concept);
  }

  /**
   * @return The value of the {@code property} attribute
   */
  @JsonProperty("property")
  @Override
  public Optional<List<CodeSystem_Property1>> property() {
    return Optional.ofNullable(property);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Code> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code definition} attribute
   */
  @JsonProperty("definition")
  @Override
  public Optional<String> definition() {
    return Optional.ofNullable(definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCodeSystem_Concept(
        newValue,
        this.designation,
        this.concept,
        this.property,
        this.modifierExtension,
        this.code,
        this.display,
        this.id,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Concept withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCodeSystem_Concept(
        value,
        this.designation,
        this.concept,
        this.property,
        this.modifierExtension,
        this.code,
        this.display,
        this.id,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#designation() designation} attribute.
   * @param value The value for designation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withDesignation(List<CodeSystem_Designation> value) {
    @Nullable List<CodeSystem_Designation> newValue = Objects.requireNonNull(value, "designation");
    if (this.designation == newValue) return this;
    return new ImmutableCodeSystem_Concept(
        this.extension,
        newValue,
        this.concept,
        this.property,
        this.modifierExtension,
        this.code,
        this.display,
        this.id,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#designation() designation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for designation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Concept withDesignation(Optional<? extends List<CodeSystem_Designation>> optional) {
    @Nullable List<CodeSystem_Designation> value = optional.orElse(null);
    if (this.designation == value) return this;
    return new ImmutableCodeSystem_Concept(
        this.extension,
        value,
        this.concept,
        this.property,
        this.modifierExtension,
        this.code,
        this.display,
        this.id,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#concept() concept} attribute.
   * @param value The value for concept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withConcept(List<CodeSystem_Concept> value) {
    @Nullable List<CodeSystem_Concept> newValue = Objects.requireNonNull(value, "concept");
    if (this.concept == newValue) return this;
    return new ImmutableCodeSystem_Concept(
        this.extension,
        this.designation,
        newValue,
        this.property,
        this.modifierExtension,
        this.code,
        this.display,
        this.id,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#concept() concept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for concept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Concept withConcept(Optional<? extends List<CodeSystem_Concept>> optional) {
    @Nullable List<CodeSystem_Concept> value = optional.orElse(null);
    if (this.concept == value) return this;
    return new ImmutableCodeSystem_Concept(
        this.extension,
        this.designation,
        value,
        this.property,
        this.modifierExtension,
        this.code,
        this.display,
        this.id,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#property() property} attribute.
   * @param value The value for property
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withProperty(List<CodeSystem_Property1> value) {
    @Nullable List<CodeSystem_Property1> newValue = Objects.requireNonNull(value, "property");
    if (this.property == newValue) return this;
    return new ImmutableCodeSystem_Concept(
        this.extension,
        this.designation,
        this.concept,
        newValue,
        this.modifierExtension,
        this.code,
        this.display,
        this.id,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#property() property} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for property
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Concept withProperty(Optional<? extends List<CodeSystem_Property1>> optional) {
    @Nullable List<CodeSystem_Property1> value = optional.orElse(null);
    if (this.property == value) return this;
    return new ImmutableCodeSystem_Concept(
        this.extension,
        this.designation,
        this.concept,
        value,
        this.modifierExtension,
        this.code,
        this.display,
        this.id,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCodeSystem_Concept(
        this.extension,
        this.designation,
        this.concept,
        this.property,
        newValue,
        this.code,
        this.display,
        this.id,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Concept withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCodeSystem_Concept(
        this.extension,
        this.designation,
        this.concept,
        this.property,
        value,
        this.code,
        this.display,
        this.id,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableCodeSystem_Concept(
        this.extension,
        this.designation,
        this.concept,
        this.property,
        this.modifierExtension,
        newValue,
        this.display,
        this.id,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCodeSystem_Concept withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableCodeSystem_Concept(
        this.extension,
        this.designation,
        this.concept,
        this.property,
        this.modifierExtension,
        value,
        this.display,
        this.id,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#display() display} attribute.
   * @param value The value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withDisplay(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "display");
    if (Objects.equals(this.display, newValue)) return this;
    return new ImmutableCodeSystem_Concept(
        this.extension,
        this.designation,
        this.concept,
        this.property,
        this.modifierExtension,
        this.code,
        newValue,
        this.id,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#display() display} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withDisplay(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.display, value)) return this;
    return new ImmutableCodeSystem_Concept(
        this.extension,
        this.designation,
        this.concept,
        this.property,
        this.modifierExtension,
        this.code,
        value,
        this.id,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCodeSystem_Concept(
        this.extension,
        this.designation,
        this.concept,
        this.property,
        this.modifierExtension,
        this.code,
        this.display,
        newValue,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCodeSystem_Concept(
        this.extension,
        this.designation,
        this.concept,
        this.property,
        this.modifierExtension,
        this.code,
        this.display,
        value,
        this.definition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CodeSystem_Concept#definition() definition} attribute.
   * @param value The value for definition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withDefinition(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "definition");
    if (Objects.equals(this.definition, newValue)) return this;
    return new ImmutableCodeSystem_Concept(
        this.extension,
        this.designation,
        this.concept,
        this.property,
        this.modifierExtension,
        this.code,
        this.display,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CodeSystem_Concept#definition() definition} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCodeSystem_Concept withDefinition(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.definition, value)) return this;
    return new ImmutableCodeSystem_Concept(
        this.extension,
        this.designation,
        this.concept,
        this.property,
        this.modifierExtension,
        this.code,
        this.display,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCodeSystem_Concept} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCodeSystem_Concept
        && equalTo((ImmutableCodeSystem_Concept) another);
  }

  private boolean equalTo(ImmutableCodeSystem_Concept another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(designation, another.designation)
        && Objects.equals(concept, another.concept)
        && Objects.equals(property, another.property)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(code, another.code)
        && Objects.equals(display, another.display)
        && Objects.equals(id, another.id)
        && Objects.equals(definition, another.definition);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code designation}, {@code concept}, {@code property}, {@code modifierExtension}, {@code code}, {@code display}, {@code id}, {@code definition}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(designation);
    h += (h << 5) + Objects.hashCode(concept);
    h += (h << 5) + Objects.hashCode(property);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(display);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(definition);
    return h;
  }

  /**
   * Prints the immutable value {@code CodeSystem_Concept} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CodeSystem_Concept{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (designation != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("designation=").append(designation);
    }
    if (concept != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("concept=").append(concept);
    }
    if (property != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("property=").append(property);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (code != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (display != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("display=").append(display);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (definition != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("definition=").append(definition);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CodeSystem_Concept", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CodeSystem_Concept {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<CodeSystem_Designation>> designation = Optional.empty();
    boolean designationIsSet;
    @Nullable Optional<List<CodeSystem_Concept>> concept = Optional.empty();
    boolean conceptIsSet;
    @Nullable Optional<List<CodeSystem_Property1>> property = Optional.empty();
    boolean propertyIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<String> display = Optional.empty();
    boolean displayIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> definition = Optional.empty();
    boolean definitionIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("designation")
    public void setDesignation(Optional<List<CodeSystem_Designation>> designation) {
      this.designation = designation;
      this.designationIsSet = true;
    }
    @JsonProperty("concept")
    public void setConcept(Optional<List<CodeSystem_Concept>> concept) {
      this.concept = concept;
      this.conceptIsSet = true;
    }
    @JsonProperty("property")
    public void setProperty(Optional<List<CodeSystem_Property1>> property) {
      this.property = property;
      this.propertyIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<Code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("display")
    public void setDisplay(Optional<String> display) {
      this.display = display;
      this.displayIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("definition")
    public void setDefinition(Optional<String> definition) {
      this.definition = definition;
      this.definitionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeSystem_Designation>> designation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeSystem_Concept>> concept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeSystem_Property1>> property() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> display() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> definition() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCodeSystem_Concept fromJson(Json json) {
    ImmutableCodeSystem_Concept.Builder builder = ImmutableCodeSystem_Concept.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.designationIsSet) {
      builder.designation(json.designation);
    }
    if (json.conceptIsSet) {
      builder.concept(json.concept);
    }
    if (json.propertyIsSet) {
      builder.property(json.property);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.displayIsSet) {
      builder.display(json.display);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.definitionIsSet) {
      builder.definition(json.definition);
    }
    return (ImmutableCodeSystem_Concept) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CodeSystem_Concept} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CodeSystem_Concept instance
   */
  public static CodeSystem_Concept copyOf(CodeSystem_Concept instance) {
    if (instance instanceof ImmutableCodeSystem_Concept) {
      return (ImmutableCodeSystem_Concept) instance;
    }
    return ImmutableCodeSystem_Concept.builder()
        .extension(instance.extension())
        .designation(instance.designation())
        .concept(instance.concept())
        .property(instance.property())
        .modifierExtension(instance.modifierExtension())
        .code(instance.code())
        .display(instance.display())
        .id(instance.id())
        .definition(instance.definition())
        .build();
  }

  /**
   * Creates a builder for {@link CodeSystem_Concept CodeSystem_Concept}.
   * <pre>
   * ImmutableCodeSystem_Concept.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CodeSystem_Concept#extension() extension}
   *    .designation(List&amp;lt;com.fhir.types.fhir.CodeSystem_Designation&amp;gt;) // optional {@link CodeSystem_Concept#designation() designation}
   *    .concept(List&amp;lt;com.fhir.types.fhir.CodeSystem_Concept&amp;gt;) // optional {@link CodeSystem_Concept#concept() concept}
   *    .property(List&amp;lt;com.fhir.types.fhir.CodeSystem_Property1&amp;gt;) // optional {@link CodeSystem_Concept#property() property}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CodeSystem_Concept#modifierExtension() modifierExtension}
   *    .code(com.fhir.types.fhir.Code) // optional {@link CodeSystem_Concept#code() code}
   *    .display(String) // optional {@link CodeSystem_Concept#display() display}
   *    .id(String) // optional {@link CodeSystem_Concept#id() id}
   *    .definition(String) // optional {@link CodeSystem_Concept#definition() definition}
   *    .build();
   * </pre>
   * @return A new CodeSystem_Concept builder
   */
  public static ImmutableCodeSystem_Concept.Builder builder() {
    return new ImmutableCodeSystem_Concept.Builder();
  }

  /**
   * Builds instances of type {@link CodeSystem_Concept CodeSystem_Concept}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CodeSystem_Concept", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_DESIGNATION = 0x2L;
    private static final long OPT_BIT_CONCEPT = 0x4L;
    private static final long OPT_BIT_PROPERTY = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_CODE = 0x20L;
    private static final long OPT_BIT_DISPLAY = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_DEFINITION = 0x100L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<CodeSystem_Designation> designation;
    private @Nullable List<CodeSystem_Concept> concept;
    private @Nullable List<CodeSystem_Property1> property;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Code code;
    private @Nullable String display;
    private @Nullable String id;
    private @Nullable String definition;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem_Concept#extension() extension} to extension.
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
     * Initializes the optional value {@link CodeSystem_Concept#designation() designation} to designation.
     * @param designation The value for designation
     * @return {@code this} builder for chained invocation
     */
    public final Builder designation(List<CodeSystem_Designation> designation) {
      checkNotIsSet(designationIsSet(), "designation");
      this.designation = Objects.requireNonNull(designation, "designation");
      optBits |= OPT_BIT_DESIGNATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#designation() designation} to designation.
     * @param designation The value for designation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("designation")
    public final Builder designation(Optional<? extends List<CodeSystem_Designation>> designation) {
      checkNotIsSet(designationIsSet(), "designation");
      this.designation = designation.orElse(null);
      optBits |= OPT_BIT_DESIGNATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#concept() concept} to concept.
     * @param concept The value for concept
     * @return {@code this} builder for chained invocation
     */
    public final Builder concept(List<CodeSystem_Concept> concept) {
      checkNotIsSet(conceptIsSet(), "concept");
      this.concept = Objects.requireNonNull(concept, "concept");
      optBits |= OPT_BIT_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#concept() concept} to concept.
     * @param concept The value for concept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("concept")
    public final Builder concept(Optional<? extends List<CodeSystem_Concept>> concept) {
      checkNotIsSet(conceptIsSet(), "concept");
      this.concept = concept.orElse(null);
      optBits |= OPT_BIT_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    public final Builder property(List<CodeSystem_Property1> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = Objects.requireNonNull(property, "property");
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("property")
    public final Builder property(Optional<? extends List<CodeSystem_Property1>> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = property.orElse(null);
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem_Concept#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CodeSystem_Concept#code() code} to code.
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
     * Initializes the optional value {@link CodeSystem_Concept#code() code} to code.
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
     * Initializes the optional value {@link CodeSystem_Concept#display() display} to display.
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
     * Initializes the optional value {@link CodeSystem_Concept#display() display} to display.
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
     * Initializes the optional value {@link CodeSystem_Concept#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem_Concept#id() id} to id.
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
     * Initializes the optional value {@link CodeSystem_Concept#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    public final Builder definition(String definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = Objects.requireNonNull(definition, "definition");
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link CodeSystem_Concept#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definition")
    public final Builder definition(Optional<String> definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = definition.orElse(null);
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Builds a new {@link CodeSystem_Concept CodeSystem_Concept}.
     * @return An immutable instance of CodeSystem_Concept
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CodeSystem_Concept build() {
      return new ImmutableCodeSystem_Concept(extension, designation, concept, property, modifierExtension, code, display, id, definition);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean designationIsSet() {
      return (optBits & OPT_BIT_DESIGNATION) != 0;
    }

    private boolean conceptIsSet() {
      return (optBits & OPT_BIT_CONCEPT) != 0;
    }

    private boolean propertyIsSet() {
      return (optBits & OPT_BIT_PROPERTY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean displayIsSet() {
      return (optBits & OPT_BIT_DISPLAY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean definitionIsSet() {
      return (optBits & OPT_BIT_DEFINITION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CodeSystem_Concept is strict, attribute is already set: ".concat(name));
    }
  }
}
