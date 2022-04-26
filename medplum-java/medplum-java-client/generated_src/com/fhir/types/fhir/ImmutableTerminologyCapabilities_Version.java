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
 * Immutable implementation of {@link TerminologyCapabilities_Version}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTerminologyCapabilities_Version.builder()}.
 */
@Generated(from = "TerminologyCapabilities_Version", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTerminologyCapabilities_Version
    implements TerminologyCapabilities_Version {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Boolean compositional;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean isDefault;
  private final @Nullable List<Code> property;
  private final @Nullable List<Code> language;
  private final @Nullable List<TerminologyCapabilities_Filter> filter;
  private final @Nullable String code;

  private ImmutableTerminologyCapabilities_Version(
      @Nullable List<Extension> modifierExtension,
      @Nullable Boolean compositional,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Boolean isDefault,
      @Nullable List<Code> property,
      @Nullable List<Code> language,
      @Nullable List<TerminologyCapabilities_Filter> filter,
      @Nullable String code) {
    this.modifierExtension = modifierExtension;
    this.compositional = compositional;
    this.id = id;
    this.extension = extension;
    this.isDefault = isDefault;
    this.property = property;
    this.language = language;
    this.filter = filter;
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
   * @return The value of the {@code compositional} attribute
   */
  @JsonProperty("compositional")
  @Override
  public Optional<Boolean> compositional() {
    return Optional.ofNullable(compositional);
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
   * @return The value of the {@code isDefault} attribute
   */
  @JsonProperty("isDefault")
  @Override
  public Optional<Boolean> isDefault() {
    return Optional.ofNullable(isDefault);
  }

  /**
   * @return The value of the {@code property} attribute
   */
  @JsonProperty("property")
  @Override
  public Optional<List<Code>> property() {
    return Optional.ofNullable(property);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<List<Code>> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code filter} attribute
   */
  @JsonProperty("filter")
  @Override
  public Optional<List<TerminologyCapabilities_Filter>> filter() {
    return Optional.ofNullable(filter);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<String> code() {
    return Optional.ofNullable(code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Version#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Version withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTerminologyCapabilities_Version(
        newValue,
        this.compositional,
        this.id,
        this.extension,
        this.isDefault,
        this.property,
        this.language,
        this.filter,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Version#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_Version withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTerminologyCapabilities_Version(
        value,
        this.compositional,
        this.id,
        this.extension,
        this.isDefault,
        this.property,
        this.language,
        this.filter,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Version#compositional() compositional} attribute.
   * @param value The value for compositional
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Version withCompositional(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.compositional, newValue)) return this;
    return new ImmutableTerminologyCapabilities_Version(
        this.modifierExtension,
        newValue,
        this.id,
        this.extension,
        this.isDefault,
        this.property,
        this.language,
        this.filter,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Version#compositional() compositional} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compositional
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Version withCompositional(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.compositional, value)) return this;
    return new ImmutableTerminologyCapabilities_Version(
        this.modifierExtension,
        value,
        this.id,
        this.extension,
        this.isDefault,
        this.property,
        this.language,
        this.filter,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Version#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Version withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTerminologyCapabilities_Version(
        this.modifierExtension,
        this.compositional,
        newValue,
        this.extension,
        this.isDefault,
        this.property,
        this.language,
        this.filter,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Version#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Version withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTerminologyCapabilities_Version(
        this.modifierExtension,
        this.compositional,
        value,
        this.extension,
        this.isDefault,
        this.property,
        this.language,
        this.filter,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Version#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Version withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTerminologyCapabilities_Version(
        this.modifierExtension,
        this.compositional,
        this.id,
        newValue,
        this.isDefault,
        this.property,
        this.language,
        this.filter,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Version#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_Version withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTerminologyCapabilities_Version(
        this.modifierExtension,
        this.compositional,
        this.id,
        value,
        this.isDefault,
        this.property,
        this.language,
        this.filter,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Version#isDefault() isDefault} attribute.
   * @param value The value for isDefault
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Version withIsDefault(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.isDefault, newValue)) return this;
    return new ImmutableTerminologyCapabilities_Version(
        this.modifierExtension,
        this.compositional,
        this.id,
        this.extension,
        newValue,
        this.property,
        this.language,
        this.filter,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Version#isDefault() isDefault} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for isDefault
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Version withIsDefault(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.isDefault, value)) return this;
    return new ImmutableTerminologyCapabilities_Version(
        this.modifierExtension,
        this.compositional,
        this.id,
        this.extension,
        value,
        this.property,
        this.language,
        this.filter,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Version#property() property} attribute.
   * @param value The value for property
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Version withProperty(List<Code> value) {
    @Nullable List<Code> newValue = Objects.requireNonNull(value, "property");
    if (this.property == newValue) return this;
    return new ImmutableTerminologyCapabilities_Version(
        this.modifierExtension,
        this.compositional,
        this.id,
        this.extension,
        this.isDefault,
        newValue,
        this.language,
        this.filter,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Version#property() property} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for property
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_Version withProperty(Optional<? extends List<Code>> optional) {
    @Nullable List<Code> value = optional.orElse(null);
    if (this.property == value) return this;
    return new ImmutableTerminologyCapabilities_Version(
        this.modifierExtension,
        this.compositional,
        this.id,
        this.extension,
        this.isDefault,
        value,
        this.language,
        this.filter,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Version#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Version withLanguage(List<Code> value) {
    @Nullable List<Code> newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableTerminologyCapabilities_Version(
        this.modifierExtension,
        this.compositional,
        this.id,
        this.extension,
        this.isDefault,
        this.property,
        newValue,
        this.filter,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Version#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_Version withLanguage(Optional<? extends List<Code>> optional) {
    @Nullable List<Code> value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableTerminologyCapabilities_Version(
        this.modifierExtension,
        this.compositional,
        this.id,
        this.extension,
        this.isDefault,
        this.property,
        value,
        this.filter,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Version#filter() filter} attribute.
   * @param value The value for filter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Version withFilter(List<TerminologyCapabilities_Filter> value) {
    @Nullable List<TerminologyCapabilities_Filter> newValue = Objects.requireNonNull(value, "filter");
    if (this.filter == newValue) return this;
    return new ImmutableTerminologyCapabilities_Version(
        this.modifierExtension,
        this.compositional,
        this.id,
        this.extension,
        this.isDefault,
        this.property,
        this.language,
        newValue,
        this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Version#filter() filter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for filter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_Version withFilter(Optional<? extends List<TerminologyCapabilities_Filter>> optional) {
    @Nullable List<TerminologyCapabilities_Filter> value = optional.orElse(null);
    if (this.filter == value) return this;
    return new ImmutableTerminologyCapabilities_Version(
        this.modifierExtension,
        this.compositional,
        this.id,
        this.extension,
        this.isDefault,
        this.property,
        this.language,
        value,
        this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Version#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Version withCode(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "code");
    if (Objects.equals(this.code, newValue)) return this;
    return new ImmutableTerminologyCapabilities_Version(
        this.modifierExtension,
        this.compositional,
        this.id,
        this.extension,
        this.isDefault,
        this.property,
        this.language,
        this.filter,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Version#code() code} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Version withCode(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.code, value)) return this;
    return new ImmutableTerminologyCapabilities_Version(
        this.modifierExtension,
        this.compositional,
        this.id,
        this.extension,
        this.isDefault,
        this.property,
        this.language,
        this.filter,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTerminologyCapabilities_Version} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTerminologyCapabilities_Version
        && equalTo((ImmutableTerminologyCapabilities_Version) another);
  }

  private boolean equalTo(ImmutableTerminologyCapabilities_Version another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(compositional, another.compositional)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(isDefault, another.isDefault)
        && Objects.equals(property, another.property)
        && Objects.equals(language, another.language)
        && Objects.equals(filter, another.filter)
        && Objects.equals(code, another.code);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code compositional}, {@code id}, {@code extension}, {@code isDefault}, {@code property}, {@code language}, {@code filter}, {@code code}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(compositional);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(isDefault);
    h += (h << 5) + Objects.hashCode(property);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(filter);
    h += (h << 5) + Objects.hashCode(code);
    return h;
  }

  /**
   * Prints the immutable value {@code TerminologyCapabilities_Version} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TerminologyCapabilities_Version{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (compositional != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("compositional=").append(compositional);
    }
    if (id != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (isDefault != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("isDefault=").append(isDefault);
    }
    if (property != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("property=").append(property);
    }
    if (language != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (filter != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("filter=").append(filter);
    }
    if (code != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("code=").append(code);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TerminologyCapabilities_Version", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TerminologyCapabilities_Version {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Boolean> compositional = Optional.empty();
    boolean compositionalIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> isDefault = Optional.empty();
    boolean isDefaultIsSet;
    @Nullable Optional<List<Code>> property = Optional.empty();
    boolean propertyIsSet;
    @Nullable Optional<List<Code>> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<TerminologyCapabilities_Filter>> filter = Optional.empty();
    boolean filterIsSet;
    @Nullable Optional<String> code = Optional.empty();
    boolean codeIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("compositional")
    public void setCompositional(Optional<Boolean> compositional) {
      this.compositional = compositional;
      this.compositionalIsSet = true;
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
    @JsonProperty("isDefault")
    public void setIsDefault(Optional<Boolean> isDefault) {
      this.isDefault = isDefault;
      this.isDefaultIsSet = true;
    }
    @JsonProperty("property")
    public void setProperty(Optional<List<Code>> property) {
      this.property = property;
      this.propertyIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<List<Code>> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("filter")
    public void setFilter(Optional<List<TerminologyCapabilities_Filter>> filter) {
      this.filter = filter;
      this.filterIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<String> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> compositional() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> isDefault() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Code>> property() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Code>> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<TerminologyCapabilities_Filter>> filter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> code() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTerminologyCapabilities_Version fromJson(Json json) {
    ImmutableTerminologyCapabilities_Version.Builder builder = ImmutableTerminologyCapabilities_Version.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.compositionalIsSet) {
      builder.compositional(json.compositional);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.isDefaultIsSet) {
      builder.isDefault(json.isDefault);
    }
    if (json.propertyIsSet) {
      builder.property(json.property);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.filterIsSet) {
      builder.filter(json.filter);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    return (ImmutableTerminologyCapabilities_Version) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TerminologyCapabilities_Version} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TerminologyCapabilities_Version instance
   */
  public static TerminologyCapabilities_Version copyOf(TerminologyCapabilities_Version instance) {
    if (instance instanceof ImmutableTerminologyCapabilities_Version) {
      return (ImmutableTerminologyCapabilities_Version) instance;
    }
    return ImmutableTerminologyCapabilities_Version.builder()
        .modifierExtension(instance.modifierExtension())
        .compositional(instance.compositional())
        .id(instance.id())
        .extension(instance.extension())
        .isDefault(instance.isDefault())
        .property(instance.property())
        .language(instance.language())
        .filter(instance.filter())
        .code(instance.code())
        .build();
  }

  /**
   * Creates a builder for {@link TerminologyCapabilities_Version TerminologyCapabilities_Version}.
   * <pre>
   * ImmutableTerminologyCapabilities_Version.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities_Version#modifierExtension() modifierExtension}
   *    .compositional(Boolean) // optional {@link TerminologyCapabilities_Version#compositional() compositional}
   *    .id(String) // optional {@link TerminologyCapabilities_Version#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities_Version#extension() extension}
   *    .isDefault(Boolean) // optional {@link TerminologyCapabilities_Version#isDefault() isDefault}
   *    .property(List&amp;lt;com.fhir.types.fhir.Code&amp;gt;) // optional {@link TerminologyCapabilities_Version#property() property}
   *    .language(List&amp;lt;com.fhir.types.fhir.Code&amp;gt;) // optional {@link TerminologyCapabilities_Version#language() language}
   *    .filter(List&amp;lt;com.fhir.types.fhir.TerminologyCapabilities_Filter&amp;gt;) // optional {@link TerminologyCapabilities_Version#filter() filter}
   *    .code(String) // optional {@link TerminologyCapabilities_Version#code() code}
   *    .build();
   * </pre>
   * @return A new TerminologyCapabilities_Version builder
   */
  public static ImmutableTerminologyCapabilities_Version.Builder builder() {
    return new ImmutableTerminologyCapabilities_Version.Builder();
  }

  /**
   * Builds instances of type {@link TerminologyCapabilities_Version TerminologyCapabilities_Version}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TerminologyCapabilities_Version", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_COMPOSITIONAL = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_IS_DEFAULT = 0x10L;
    private static final long OPT_BIT_PROPERTY = 0x20L;
    private static final long OPT_BIT_LANGUAGE = 0x40L;
    private static final long OPT_BIT_FILTER = 0x80L;
    private static final long OPT_BIT_CODE = 0x100L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Boolean compositional;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean isDefault;
    private @Nullable List<Code> property;
    private @Nullable List<Code> language;
    private @Nullable List<TerminologyCapabilities_Filter> filter;
    private @Nullable String code;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Version#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities_Version#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities_Version#compositional() compositional} to compositional.
     * @param compositional The value for compositional
     * @return {@code this} builder for chained invocation
     */
    public final Builder compositional(boolean compositional) {
      checkNotIsSet(compositionalIsSet(), "compositional");
      this.compositional = compositional;
      optBits |= OPT_BIT_COMPOSITIONAL;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Version#compositional() compositional} to compositional.
     * @param compositional The value for compositional
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("compositional")
    public final Builder compositional(Optional<Boolean> compositional) {
      checkNotIsSet(compositionalIsSet(), "compositional");
      this.compositional = compositional.orElse(null);
      optBits |= OPT_BIT_COMPOSITIONAL;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Version#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities_Version#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities_Version#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities_Version#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities_Version#isDefault() isDefault} to isDefault.
     * @param isDefault The value for isDefault
     * @return {@code this} builder for chained invocation
     */
    public final Builder isDefault(boolean isDefault) {
      checkNotIsSet(isDefaultIsSet(), "isDefault");
      this.isDefault = isDefault;
      optBits |= OPT_BIT_IS_DEFAULT;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Version#isDefault() isDefault} to isDefault.
     * @param isDefault The value for isDefault
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isDefault")
    public final Builder isDefault(Optional<Boolean> isDefault) {
      checkNotIsSet(isDefaultIsSet(), "isDefault");
      this.isDefault = isDefault.orElse(null);
      optBits |= OPT_BIT_IS_DEFAULT;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Version#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    public final Builder property(List<Code> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = Objects.requireNonNull(property, "property");
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Version#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("property")
    public final Builder property(Optional<? extends List<Code>> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = property.orElse(null);
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Version#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(List<Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Version#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends List<Code>> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Version#filter() filter} to filter.
     * @param filter The value for filter
     * @return {@code this} builder for chained invocation
     */
    public final Builder filter(List<TerminologyCapabilities_Filter> filter) {
      checkNotIsSet(filterIsSet(), "filter");
      this.filter = Objects.requireNonNull(filter, "filter");
      optBits |= OPT_BIT_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Version#filter() filter} to filter.
     * @param filter The value for filter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("filter")
    public final Builder filter(Optional<? extends List<TerminologyCapabilities_Filter>> filter) {
      checkNotIsSet(filterIsSet(), "filter");
      this.filter = filter.orElse(null);
      optBits |= OPT_BIT_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Version#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(String code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Version#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<String> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Builds a new {@link TerminologyCapabilities_Version TerminologyCapabilities_Version}.
     * @return An immutable instance of TerminologyCapabilities_Version
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TerminologyCapabilities_Version build() {
      return new ImmutableTerminologyCapabilities_Version(modifierExtension, compositional, id, extension, isDefault, property, language, filter, code);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean compositionalIsSet() {
      return (optBits & OPT_BIT_COMPOSITIONAL) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean isDefaultIsSet() {
      return (optBits & OPT_BIT_IS_DEFAULT) != 0;
    }

    private boolean propertyIsSet() {
      return (optBits & OPT_BIT_PROPERTY) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean filterIsSet() {
      return (optBits & OPT_BIT_FILTER) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TerminologyCapabilities_Version is strict, attribute is already set: ".concat(name));
    }
  }
}
