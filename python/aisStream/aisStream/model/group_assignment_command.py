"""
    Ais-Stream WebsocketObjects

    OpenAPI 3.0 definitions for the data models used by aisstream.io.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from aisStream.model_utils import (  # noqa: F401
    ApiTypeError,
    ModelComposed,
    ModelNormal,
    ModelSimple,
    cached_property,
    change_keys_js_to_python,
    convert_js_args_to_python_args,
    date,
    datetime,
    file_type,
    none_type,
    validate_get_composed_info,
    OpenApiModel
)
from aisStream.exceptions import ApiAttributeError



class GroupAssignmentCommand(ModelNormal):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      attribute_map (dict): The key is attribute name
          and the value is json key in definition.
      discriminator_value_class_map (dict): A dict to go from the discriminator
          variable value to the discriminator class name.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
    }

    validations = {
    }

    @cached_property
    def additional_properties_type():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded
        """
        return (bool, date, datetime, dict, float, int, list, str, none_type,)  # noqa: E501

    _nullable = False

    @cached_property
    def openapi_types():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded

        Returns
            openapi_types (dict): The key is attribute name
                and the value is attribute type.
        """
        return {
            'message_id': (int,),  # noqa: E501
            'repeat_indicator': (int,),  # noqa: E501
            'user_id': (int,),  # noqa: E501
            'valid': (bool,),  # noqa: E501
            'spare1': (int,),  # noqa: E501
            'longitude1': (float,),  # noqa: E501
            'latitude1': (float,),  # noqa: E501
            'longitude2': (float,),  # noqa: E501
            'latitude2': (float,),  # noqa: E501
            'station_type': (int,),  # noqa: E501
            'ship_type': (int,),  # noqa: E501
            'spare2': (int,),  # noqa: E501
            'tx_rx_mode': (int,),  # noqa: E501
            'reporting_interval': (int,),  # noqa: E501
            'quiet_time': (int,),  # noqa: E501
            'spare3': (int,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'message_id': 'MessageID',  # noqa: E501
        'repeat_indicator': 'RepeatIndicator',  # noqa: E501
        'user_id': 'UserID',  # noqa: E501
        'valid': 'Valid',  # noqa: E501
        'spare1': 'Spare1',  # noqa: E501
        'longitude1': 'Longitude1',  # noqa: E501
        'latitude1': 'Latitude1',  # noqa: E501
        'longitude2': 'Longitude2',  # noqa: E501
        'latitude2': 'Latitude2',  # noqa: E501
        'station_type': 'StationType',  # noqa: E501
        'ship_type': 'ShipType',  # noqa: E501
        'spare2': 'Spare2',  # noqa: E501
        'tx_rx_mode': 'TxRxMode',  # noqa: E501
        'reporting_interval': 'ReportingInterval',  # noqa: E501
        'quiet_time': 'QuietTime',  # noqa: E501
        'spare3': 'Spare3',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, message_id, repeat_indicator, user_id, valid, spare1, longitude1, latitude1, longitude2, latitude2, station_type, ship_type, spare2, tx_rx_mode, reporting_interval, quiet_time, spare3, *args, **kwargs):  # noqa: E501
        """GroupAssignmentCommand - a model defined in OpenAPI

        Args:
            message_id (int):
            repeat_indicator (int):
            user_id (int):
            valid (bool):
            spare1 (int):
            longitude1 (float):
            latitude1 (float):
            longitude2 (float):
            latitude2 (float):
            station_type (int):
            ship_type (int):
            spare2 (int):
            tx_rx_mode (int):
            reporting_interval (int):
            quiet_time (int):
            spare3 (int):

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', True)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        self = super(OpenApiModel, cls).__new__(cls)

        if args:
            for arg in args:
                if isinstance(arg, dict):
                    kwargs.update(arg)
                else:
                    raise ApiTypeError(
                        "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                            args,
                            self.__class__.__name__,
                        ),
                        path_to_item=_path_to_item,
                        valid_classes=(self.__class__,),
                    )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        self.message_id = message_id
        self.repeat_indicator = repeat_indicator
        self.user_id = user_id
        self.valid = valid
        self.spare1 = spare1
        self.longitude1 = longitude1
        self.latitude1 = latitude1
        self.longitude2 = longitude2
        self.latitude2 = latitude2
        self.station_type = station_type
        self.ship_type = ship_type
        self.spare2 = spare2
        self.tx_rx_mode = tx_rx_mode
        self.reporting_interval = reporting_interval
        self.quiet_time = quiet_time
        self.spare3 = spare3
        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
        return self

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
    ])

    @convert_js_args_to_python_args
    def __init__(self, message_id, repeat_indicator, user_id, valid, spare1, longitude1, latitude1, longitude2, latitude2, station_type, ship_type, spare2, tx_rx_mode, reporting_interval, quiet_time, spare3, *args, **kwargs):  # noqa: E501
        """GroupAssignmentCommand - a model defined in OpenAPI

        Args:
            message_id (int):
            repeat_indicator (int):
            user_id (int):
            valid (bool):
            spare1 (int):
            longitude1 (float):
            latitude1 (float):
            longitude2 (float):
            latitude2 (float):
            station_type (int):
            ship_type (int):
            spare2 (int):
            tx_rx_mode (int):
            reporting_interval (int):
            quiet_time (int):
            spare3 (int):

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            for arg in args:
                if isinstance(arg, dict):
                    kwargs.update(arg)
                else:
                    raise ApiTypeError(
                        "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                            args,
                            self.__class__.__name__,
                        ),
                        path_to_item=_path_to_item,
                        valid_classes=(self.__class__,),
                    )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        self.message_id = message_id
        self.repeat_indicator = repeat_indicator
        self.user_id = user_id
        self.valid = valid
        self.spare1 = spare1
        self.longitude1 = longitude1
        self.latitude1 = latitude1
        self.longitude2 = longitude2
        self.latitude2 = latitude2
        self.station_type = station_type
        self.ship_type = ship_type
        self.spare2 = spare2
        self.tx_rx_mode = tx_rx_mode
        self.reporting_interval = reporting_interval
        self.quiet_time = quiet_time
        self.spare3 = spare3
        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
            if var_name in self.read_only_vars:
                raise ApiAttributeError(f"`{var_name}` is a read-only attribute. Use `from_openapi_data` to instantiate "
                                     f"class with read only attributes.")
